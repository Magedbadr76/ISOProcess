package com.isoProcess.service.impl;

import java.util.List;
import java.util.Optional;

import com.isoProcess.entity.ScheduleAudit;
import com.isoProcess.repo.ScheduleAuditRepository;
import com.isoProcess.service.ScheduleAuditService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ScheduleAuditServiceImpl implements ScheduleAuditService {

    @Autowired
    private ScheduleAuditRepository scheduleAuditRepository;

    @Override
    public ScheduleAudit saveOrUpdateScheduleAudit(ScheduleAudit scheduleAudit) {
        return scheduleAuditRepository.save(scheduleAudit);
    }

    @Override
    public ScheduleAudit getScheduleAuditById(int scheduleId) {
        Optional<ScheduleAudit> scheduleAudit = scheduleAuditRepository.findById(scheduleId);
        return scheduleAudit.orElse(null);
    }

    @Override
    public List<ScheduleAudit> getAllScheduleAudits() {
        return scheduleAuditRepository.findAll();
    }

    @Override
    public void deleteScheduleAuditById(int scheduleId) {
        scheduleAuditRepository.deleteById(scheduleId);
    }

    @Override
    public ScheduleAudit updateScheduleState(int scheduleId, String state, String auditorRejectReason, String auditeeRejectReason) {
        ScheduleAudit scheduleAudit = getScheduleAuditById(scheduleId);
        if (scheduleAudit != null) {
            scheduleAudit.setSCHEDULE_STATE(state);
            scheduleAudit.setAUDITOR_REJECT_REASON(auditorRejectReason);
            scheduleAudit.setAUDITEE_REJECT_REASON(auditeeRejectReason);
            return scheduleAuditRepository.save(scheduleAudit);
        }
        return null;
    }
}
