package com.isoProcess.controller;

import com.isoProcess.entity.AuditArea;
import com.isoProcess.service.AuditAreaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/auditAreas")
public class AuditAreaController {

    @Autowired
    private AuditAreaService auditAreaService;

    // Create a new AuditArea
    @PostMapping
    public ResponseEntity<AuditArea> createAuditArea(@RequestBody AuditArea auditArea) {
        AuditArea savedAuditArea = auditAreaService.saveAuditArea(auditArea);
        return new ResponseEntity<>(savedAuditArea, HttpStatus.CREATED);
    }

    // Get AuditArea by ID
    @GetMapping("/{id}")
    public ResponseEntity<AuditArea> getAuditAreaById(@PathVariable int id) {
        AuditArea auditArea = auditAreaService.getAuditAreaById(id);
        if (auditArea != null) {
            return new ResponseEntity<>(auditArea, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    // Get all AuditAreas
    @GetMapping
    public ResponseEntity<List<AuditArea>> getAllAuditAreas() {
        List<AuditArea> auditAreas = auditAreaService.getAllAuditAreas();
        return new ResponseEntity<>(auditAreas, HttpStatus.OK);
    }

    // Update an AuditArea
    @PutMapping("/{id}")
    public ResponseEntity<AuditArea> updateAuditArea(@PathVariable int id, @RequestBody AuditArea auditArea) {
        AuditArea updatedAuditArea = auditAreaService.updateAuditArea(id, auditArea);
        if (updatedAuditArea != null) {
            return new ResponseEntity<>(updatedAuditArea, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    // Delete an AuditArea
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteAuditArea(@PathVariable int id) {
        auditAreaService.deleteAuditArea(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}