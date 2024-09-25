package com.isoProcess.controller;

import com.isoProcess.entity.ScheduleAudit;
import com.isoProcess.service.ScheduleAuditService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/schedule-audits")
public class ScheduleAuditController {

    @Autowired
    private ScheduleAuditService scheduleAuditService;

    @PostMapping
    public ResponseEntity<ScheduleAudit> createOrUpdateScheduleAudit(@RequestBody ScheduleAudit scheduleAudit) {
        ScheduleAudit savedScheduleAudit = scheduleAuditService.saveOrUpdateScheduleAudit(scheduleAudit);
        return ResponseEntity.ok(savedScheduleAudit);
    }

    @GetMapping("/{id}")
    public ResponseEntity<ScheduleAudit> getScheduleAuditById(@PathVariable("id") int scheduleId) {
        ScheduleAudit scheduleAudit = scheduleAuditService.getScheduleAuditById(scheduleId);
        if (scheduleAudit != null) {
            return ResponseEntity.ok(scheduleAudit);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping
    public ResponseEntity<List<ScheduleAudit>> getAllScheduleAudits() {
        List<ScheduleAudit> scheduleAudits = scheduleAuditService.getAllScheduleAudits();
        return ResponseEntity.ok(scheduleAudits);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteScheduleAuditById(@PathVariable("id") int scheduleId) {
        scheduleAuditService.deleteScheduleAuditById(scheduleId);
        return ResponseEntity.noContent().build();
    }

    @PatchMapping("/{id}")
    public ResponseEntity<ScheduleAudit> updateScheduleState(
            @PathVariable("id") int scheduleId,
            @RequestParam String state,
            @RequestParam(required = false) String auditorRejectReason,
            @RequestParam(required = false) String auditeeRejectReason) {
        ScheduleAudit updatedScheduleAudit = scheduleAuditService.updateScheduleState(scheduleId, state, auditorRejectReason, auditeeRejectReason);
        if (updatedScheduleAudit != null) {
            return ResponseEntity.ok(updatedScheduleAudit);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}