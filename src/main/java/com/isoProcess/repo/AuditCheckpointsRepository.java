package com.isoProcess.repo;


import com.isoProcess.entity.AuditCheckpoints;

import org.springframework.data.jpa.repository.JpaRepository;

public interface AuditCheckpointsRepository extends JpaRepository<AuditCheckpoints, Integer> {

}
