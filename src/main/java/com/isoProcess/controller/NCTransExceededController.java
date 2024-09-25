package com.isoProcess.controller;

import com.isoProcess.entity.NCTransExceeded;
import com.isoProcess.service.NCTransExceededService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/nc-trans-exceeded")
public class NCTransExceededController {

    @Autowired
    private NCTransExceededService ncTransExceededService;

    // Create a new NCTransExceeded
    @PostMapping
    public ResponseEntity<NCTransExceeded> createNCTransExceeded(@RequestBody NCTransExceeded ncTransExceeded) {
        NCTransExceeded createdNCTransExceeded = ncTransExceededService.saveNCTransExceeded(ncTransExceeded);
        return new ResponseEntity<>(createdNCTransExceeded, HttpStatus.CREATED);
    }

    // Get NCTransExceeded by ID
    @GetMapping("/{id}")
    public ResponseEntity<NCTransExceeded> getNCTransExceededById(@PathVariable("id") int id) {
        Optional<NCTransExceeded> ncTransExceeded = ncTransExceededService.getNCTransExceededById(id);
        return ncTransExceeded.map(ResponseEntity::ok)
                              .orElseGet(() -> ResponseEntity.notFound().build());
    }

    // Get all NCTransExceeded
    @GetMapping
    public ResponseEntity<List<NCTransExceeded>> getAllNCTransExceeded() {
        List<NCTransExceeded> ncTransExceededList = ncTransExceededService.getAllNCTransExceeded();
        return new ResponseEntity<>(ncTransExceededList, HttpStatus.OK);
    }

    // Delete NCTransExceeded by ID
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteNCTransExceededById(@PathVariable("id") int id) {
        ncTransExceededService.deleteNCTransExceededById(id);
        return ResponseEntity.noContent().build();
    }
}