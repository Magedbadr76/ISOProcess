package com.isoProcess.controller;

import com.isoProcess.entity.Lookup;
import com.isoProcess.service.LookupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/lookups")
public class LookupController {

    @Autowired
    private LookupService lookupService;

    // Save a new lookup
    @PostMapping
    public ResponseEntity<Lookup> createLookup(@RequestBody Lookup lookup) {
        Lookup savedLookup = lookupService.saveLookup(lookup);
        return new ResponseEntity<>(savedLookup, HttpStatus.CREATED);
    }

    // Get a lookup by ID
    @GetMapping("/{id}")
    public ResponseEntity<Lookup> getLookupById(@PathVariable int id) {
        Optional<Lookup> lookup = lookupService.getLookupById(id);
        return lookup.map(value -> new ResponseEntity<>(value, HttpStatus.OK))
                     .orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    // Get all lookups
    @GetMapping
    public ResponseEntity<List<Lookup>> getAllLookups() {
        List<Lookup> lookups = lookupService.getAllLookups();
        return new ResponseEntity<>(lookups, HttpStatus.OK);
    }

    // Delete a lookup by ID
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteLookupById(@PathVariable int id) {
        lookupService.deleteLookupById(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}