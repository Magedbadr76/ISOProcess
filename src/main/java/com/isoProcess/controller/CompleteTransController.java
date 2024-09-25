package com.isoProcess.controller;

import com.isoProcess.entity.CompleteTrans;
import com.isoProcess.service.CompleteTransService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/complete-trans")
public class CompleteTransController {

    @Autowired
    private CompleteTransService completeTransService;

    // Create a new CompleteTrans
    @PostMapping
    public ResponseEntity<CompleteTrans> createCompleteTrans(@RequestBody CompleteTrans completeTrans) {
        CompleteTrans savedCompleteTrans = completeTransService.saveCompleteTrans(completeTrans);
        return new ResponseEntity<>(savedCompleteTrans, HttpStatus.CREATED);
    }

    // Get CompleteTrans by ID
    @GetMapping("/{id}")
    public ResponseEntity<CompleteTrans> getCompleteTransById(@PathVariable Integer id) {
        Optional<CompleteTrans> completeTrans = completeTransService.getCompleteTransById(id);
        if (completeTrans.isPresent()) {
            return new ResponseEntity<>(completeTrans.get(), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    // Get all CompleteTrans records
    @GetMapping
    public ResponseEntity<List<CompleteTrans>> getAllCompleteTrans() {
        List<CompleteTrans> completeTransList = completeTransService.getAllCompleteTrans();
        return new ResponseEntity<>(completeTransList, HttpStatus.OK);
    }

    // Delete CompleteTrans by ID
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteCompleteTransById(@PathVariable Integer id) {
        completeTransService.deleteCompleteTransById(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
