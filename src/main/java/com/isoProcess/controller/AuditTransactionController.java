package com.isoProcess.controller;

import com.isoProcess.entity.AuditTransaction;
import com.isoProcess.service.AuditTransService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/auditTransactions")
public class AuditTransactionController {

    @Autowired
    private AuditTransService auditTransService;

    // Create a new AuditTransaction
    @PostMapping
    public ResponseEntity<AuditTransaction> createAuditTransaction(@RequestBody AuditTransaction auditTransaction) {
        AuditTransaction savedAuditTransaction = auditTransService.saveAuditTransaction(auditTransaction);
        return new ResponseEntity<>(savedAuditTransaction, HttpStatus.CREATED);
    }

    // Get AuditTransaction by ID
    @GetMapping("/{id}")
    public ResponseEntity<AuditTransaction> getAuditTransactionById(@PathVariable Integer id) {
        Optional<AuditTransaction> auditTransaction = auditTransService.getAuditTransactionById(id);
        if (auditTransaction.isPresent()) {
            return new ResponseEntity<>(auditTransaction.get(), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    // Get all AuditTransactions
    @GetMapping
    public ResponseEntity<List<AuditTransaction>> getAllAuditTransactions() {
        List<AuditTransaction> auditTransactions = auditTransService.getAllAuditTransactions();
        return new ResponseEntity<>(auditTransactions, HttpStatus.OK);
    }

    // Delete AuditTransaction by ID
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteAuditTransactionById(@PathVariable Integer id) {
        auditTransService.deleteAuditTransactionById(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}