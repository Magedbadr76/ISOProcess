package com.isoProcess.controller;

import com.isoProcess.entity.AuditCheckpoints;
import com.isoProcess.service.AuditCheckpointsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/auditCheckpoints")
public class AuditCheckpointsController {

    @Autowired
    private AuditCheckpointsService auditCheckpointsService;

    // Create a new AuditCheckpoint
    @PostMapping
    public ResponseEntity<AuditCheckpoints> createAuditCheckpoint(@RequestBody AuditCheckpoints auditCheckpoint) {
        AuditCheckpoints savedAuditCheckpoint = auditCheckpointsService.saveAuditCheckpoint(auditCheckpoint);
        return new ResponseEntity<>(savedAuditCheckpoint, HttpStatus.CREATED);
    }

    // Get AuditCheckpoint by ID
    @GetMapping("/{id}")
    public ResponseEntity<AuditCheckpoints> getAuditCheckpointById(@PathVariable Integer id) {
        Optional<AuditCheckpoints> auditCheckpoint = auditCheckpointsService.getAuditCheckpointById(id);
        if (auditCheckpoint.isPresent()) {
            return new ResponseEntity<>(auditCheckpoint.get(), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    // Get all AuditCheckpoints
    @GetMapping
    public ResponseEntity<List<AuditCheckpoints>> getAllAuditCheckpoints() {
        List<AuditCheckpoints> auditCheckpoints = auditCheckpointsService.getAllAuditCheckpoints();
        return new ResponseEntity<>(auditCheckpoints, HttpStatus.OK);
    }

    // Delete AuditCheckpoint by ID
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteAuditCheckpointById(@PathVariable Integer id) {
        auditCheckpointsService.deleteAuditCheckpointById(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}