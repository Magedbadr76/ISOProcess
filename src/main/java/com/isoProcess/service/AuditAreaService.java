package com.isoProcess.service;

import java.util.List;

import com.isoProcess.entity.AuditArea;

public interface AuditAreaService {
    AuditArea saveAuditArea(AuditArea auditArea);
    AuditArea getAuditAreaById(int id);
    List<AuditArea> getAllAuditAreas();
    AuditArea updateAuditArea(int id, AuditArea auditArea);
    void deleteAuditArea(int id);
}