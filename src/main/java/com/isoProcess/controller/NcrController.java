package com.isoProcess.controller;

import com.isoProcess.entity.Ncr;
import com.isoProcess.service.NcrService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/ncrs")
public class NcrController {

    @Autowired
    private NcrService ncrService;

    // Create a new Ncr
    @PostMapping
    public ResponseEntity<Ncr> createNcr(@RequestBody Ncr ncr) {
        Ncr createdNcr = ncrService.saveNcr(ncr);
        return new ResponseEntity<>(createdNcr, HttpStatus.CREATED);
    }

    // Get Ncr by ID
    @GetMapping("/{id}")
    public ResponseEntity<Ncr> getNcrById(@PathVariable("id") int id) {
        Optional<Ncr> ncr = ncrService.getNcrById(id);
        return ncr.map(ResponseEntity::ok)
                  .orElseGet(() -> ResponseEntity.notFound().build());
    }

    // Get all Ncrs
    @GetMapping
    public ResponseEntity<List<Ncr>> getAllNcrs() {
        List<Ncr> ncrs = ncrService.getAllNcrs();
        return new ResponseEntity<>(ncrs, HttpStatus.OK);
    }

    // Delete Ncr by ID
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteNcrById(@PathVariable("id") int id) {
        ncrService.deleteNcrById(id);
        return ResponseEntity.noContent().build();
    }
}