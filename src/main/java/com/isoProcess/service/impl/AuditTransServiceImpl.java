package com.isoProcess.service.impl;

import java.util.List;
import java.util.Optional;

import com.isoProcess.entity.AuditTransaction;
import com.isoProcess.repo.AuditTransactionRepository;
import com.isoProcess.service.AuditTransService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuditTransServiceImpl implements AuditTransService {

    @Autowired
    private AuditTransactionRepository auditTransactionRepository;

    @Override
    public AuditTransaction saveAuditTransaction(AuditTransaction auditTransaction) {
        return auditTransactionRepository.save(auditTransaction);
    }

    @Override
    public Optional<AuditTransaction> getAuditTransactionById(Integer id) {
        return auditTransactionRepository.findById(id);
    }

    @Override
    public List<AuditTransaction> getAllAuditTransactions() {
        return auditTransactionRepository.findAll();
    }

    @Override
    public void deleteAuditTransactionById(Integer id) {
        auditTransactionRepository.deleteById(id);
    }
}
