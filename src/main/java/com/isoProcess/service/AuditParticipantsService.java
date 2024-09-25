package com.isoProcess.service;

import java.util.List;
import java.util.Optional;

import com.isoProcess.entity.AuditParticipants;

public interface AuditParticipantsService {
    AuditParticipants saveAuditParticipant(AuditParticipants auditParticipant);
    Optional<AuditParticipants> getAuditParticipantById(Integer id);
    List<AuditParticipants> getAllAuditParticipants();
    void deleteAuditParticipantById(Integer id);
}