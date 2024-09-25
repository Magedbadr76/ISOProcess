package com.isoProcess.controller;

import com.isoProcess.entity.NCTrans;
import com.isoProcess.service.NCTransService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/nc-trans")
public class NCTransController {

    private final NCTransService ncTransService;

    @Autowired
    public NCTransController(NCTransService ncTransService) {
        this.ncTransService = ncTransService;
    }

    // Create a new NCTrans
    @PostMapping
    public ResponseEntity<NCTrans> createNCTrans(@RequestBody NCTrans ncTrans) {
        NCTrans createdNCTrans = ncTransService.saveNCTrans(ncTrans);
        return new ResponseEntity<>(createdNCTrans, HttpStatus.CREATED);
    }

    // Get NCTrans by ID
    @GetMapping("/{id}")
    public ResponseEntity<NCTrans> getNCTransById(@PathVariable("id") int id) {
        Optional<NCTrans> ncTrans = ncTransService.getNCTransById(id);
        return ncTrans.map(ResponseEntity::ok)
                      .orElseGet(() -> ResponseEntity.notFound().build());
    }

    // Get all NCTrans
    @GetMapping
    public ResponseEntity<List<NCTrans>> getAllNCTrans() {
        List<NCTrans> ncTransList = ncTransService.getAllNCTrans();
        return new ResponseEntity<>(ncTransList, HttpStatus.OK);
    }

    // Delete NCTrans by ID
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteNCTransById(@PathVariable("id") int id) {
        ncTransService.deleteNCTransById(id);
        return ResponseEntity.noContent().build();
    }
}