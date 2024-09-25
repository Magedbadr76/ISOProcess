package com.isoProcess.service.impl;

import java.util.List;
import java.util.Optional;

import com.isoProcess.entity.AuditCheckpoints;
import com.isoProcess.repo.AuditCheckpointsRepository;
import com.isoProcess.service.AuditCheckpointsService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuditCheckpointsServiceImpl implements AuditCheckpointsService {

    @Autowired
    private AuditCheckpointsRepository auditCheckpointsRepository;

    @Override
    public AuditCheckpoints saveAuditCheckpoint(AuditCheckpoints auditCheckpoint) {
        return auditCheckpointsRepository.save(auditCheckpoint);
    }

    @Override
    public Optional<AuditCheckpoints> getAuditCheckpointById(Integer id) {
        return auditCheckpointsRepository.findById(id);
    }

    @Override
    public List<AuditCheckpoints> getAllAuditCheckpoints() {
        return auditCheckpointsRepository.findAll();
    }

    @Override
    public void deleteAuditCheckpointById(Integer id) {
        auditCheckpointsRepository.deleteById(id);
    }
}
