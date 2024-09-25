package com.isoProcess.controller;

import com.isoProcess.entity.AuditParticipants;
import com.isoProcess.service.AuditParticipantsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/auditParticipants")
public class AuditParticipantsController {

    @Autowired
    private AuditParticipantsService auditParticipantsService;

    // Create a new AuditParticipant
    @PostMapping
    public ResponseEntity<AuditParticipants> createAuditParticipant(@RequestBody AuditParticipants auditParticipant) {
        AuditParticipants savedAuditParticipant = auditParticipantsService.saveAuditParticipant(auditParticipant);
        return new ResponseEntity<>(savedAuditParticipant, HttpStatus.CREATED);
    }

    // Get AuditParticipant by ID
    @GetMapping("/{id}")
    public ResponseEntity<AuditParticipants> getAuditParticipantById(@PathVariable Integer id) {
        Optional<AuditParticipants> auditParticipant = auditParticipantsService.getAuditParticipantById(id);
        if (auditParticipant.isPresent()) {
            return new ResponseEntity<>(auditParticipant.get(), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    // Get all AuditParticipants
    @GetMapping
    public ResponseEntity<List<AuditParticipants>> getAllAuditParticipants() {
        List<AuditParticipants> auditParticipants = auditParticipantsService.getAllAuditParticipants();
        return new ResponseEntity<>(auditParticipants, HttpStatus.OK);
    }

    // Delete AuditParticipant by ID
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteAuditParticipantById(@PathVariable Integer id) {
        auditParticipantsService.deleteAuditParticipantById(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
