package com.isoProcess.controller;

import com.isoProcess.entity.DashboardCountPerDept;
import com.isoProcess.service.DashboardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/dashboard")
public class DashboardController {

    @Autowired
    private DashboardService dashboardService;

    // Get all pending audits by department
    @GetMapping("/pending")
    public ResponseEntity<List<DashboardCountPerDept>> getAllPending() {
        List<DashboardCountPerDept> pendingAudits = dashboardService.getallPending();
        return new ResponseEntity<>(pendingAudits, HttpStatus.OK);
    }

    // Get all completed audits by department
    @GetMapping("/completed")
    public ResponseEntity<List<DashboardCountPerDept>> getAllCompleted() {
        List<DashboardCountPerDept> completedAudits = dashboardService.getallCompleted();
        return new ResponseEntity<>(completedAudits, HttpStatus.OK);
    }

    // Get audits per status
    @GetMapping("/status")
    public ResponseEntity<List<DashboardCountPerDept>> getAuditsPerStatus() {
        List<DashboardCountPerDept> auditsPerStatus = dashboardService.getAuditsPerStatus();
        return new ResponseEntity<>(auditsPerStatus, HttpStatus.OK);
    }
}