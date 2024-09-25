package com.isoProcess.service;

import com.isoProcess.entity.AuditCheckpoints;
import java.util.List;
import java.util.Optional;

public interface AuditCheckpointsService {
    AuditCheckpoints saveAuditCheckpoint(AuditCheckpoints auditCheckpoint);
    Optional<AuditCheckpoints> getAuditCheckpointById(Integer id);
    List<AuditCheckpoints> getAllAuditCheckpoints();
    void deleteAuditCheckpointById(Integer id);
}
