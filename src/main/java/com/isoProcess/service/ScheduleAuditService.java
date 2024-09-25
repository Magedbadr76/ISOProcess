package com.isoProcess.service;

import java.util.List;

import com.isoProcess.entity.ScheduleAudit;

public interface ScheduleAuditService {

    // Create or update a ScheduleAudit
    ScheduleAudit saveOrUpdateScheduleAudit(ScheduleAudit scheduleAudit);

    // Retrieve a ScheduleAudit by ID
    ScheduleAudit getScheduleAuditById(int scheduleId);

    // Retrieve all ScheduleAudits
    List<ScheduleAudit> getAllScheduleAudits();

    // Delete a ScheduleAudit by ID
    void deleteScheduleAuditById(int scheduleId);

    // Custom method to update specific fields (e.g., state and rejection reasons)
    ScheduleAudit updateScheduleState(int scheduleId, String state, String auditorRejectReason, String auditeeRejectReason);
}