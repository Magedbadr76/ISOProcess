package com.isoProcess.service.impl;

import java.util.List;
import java.util.Optional;

import com.isoProcess.entity.AuditArea;
import com.isoProcess.repo.AuditAreaRepository;
import com.isoProcess.service.AuditAreaService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuditAreaServiceImpl implements AuditAreaService {

    @Autowired
    private AuditAreaRepository auditAreaRepository;

    @Override
    public AuditArea saveAuditArea(AuditArea auditArea) {
        return auditAreaRepository.save(auditArea);
    }

    @Override
    public AuditArea getAuditAreaById(int id) {
        Optional<AuditArea> auditArea = auditAreaRepository.findById(id);
        return auditArea.orElse(null);
    }

    @Override
    public List<AuditArea> getAllAuditAreas() {
        return auditAreaRepository.findAll();
    }

    @Override
    public AuditArea updateAuditArea(int id, AuditArea auditArea) {
        Optional<AuditArea> existingAuditArea = auditAreaRepository.findById(id);
        if (existingAuditArea.isPresent()) {
            AuditArea updatedAuditArea = existingAuditArea.get();
            updatedAuditArea.setaUDIT_AREA_NAME(auditArea.getaUDIT_AREA_NAME());
            return auditAreaRepository.save(updatedAuditArea);
        } else {
            return null;
        }
    }

    @Override
    public void deleteAuditArea(int id) {
        auditAreaRepository.deleteById(id);
    }
}