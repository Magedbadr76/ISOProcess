package com.isoProcess.service;

import com.isoProcess.entity.AuditTransaction;

import java.util.List;
import java.util.Optional;

public interface AuditTransService {

	   AuditTransaction saveAuditTransaction(AuditTransaction auditTransaction);
	    Optional<AuditTransaction> getAuditTransactionById(Integer id);
	    List<AuditTransaction> getAllAuditTransactions();
	    void deleteAuditTransactionById(Integer id);
}
