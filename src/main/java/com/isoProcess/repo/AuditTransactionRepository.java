package com.isoProcess.repo;


import com.isoProcess.entity.AuditTransaction;

import org.springframework.data.jpa.repository.JpaRepository;

public interface AuditTransactionRepository extends JpaRepository<AuditTransaction, Integer> {

}
