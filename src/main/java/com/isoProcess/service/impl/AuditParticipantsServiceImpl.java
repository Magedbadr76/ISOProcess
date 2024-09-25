package com.isoProcess.service.impl;

import java.util.List;
import java.util.Optional;

import com.isoProcess.entity.AuditParticipants;
import com.isoProcess.repo.AuditParticipantsRepository;
import com.isoProcess.service.AuditParticipantsService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuditParticipantsServiceImpl implements AuditParticipantsService {

    @Autowired
    private AuditParticipantsRepository auditParticipantsRepository;

    @Override
    public AuditParticipants saveAuditParticipant(AuditParticipants auditParticipant) {
        return auditParticipantsRepository.save(auditParticipant);
    }

    @Override
    public Optional<AuditParticipants> getAuditParticipantById(Integer id) {
        return auditParticipantsRepository.findById(id);
    }

    @Override
    public List<AuditParticipants> getAllAuditParticipants() {
        return auditParticipantsRepository.findAll();
    }

    @Override
    public void deleteAuditParticipantById(Integer id) {
        auditParticipantsRepository.deleteById(id);
    }
}