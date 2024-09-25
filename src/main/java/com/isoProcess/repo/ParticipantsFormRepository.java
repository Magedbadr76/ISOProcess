package com.isoProcess.repo;


import com.isoProcess.entity.NCTrans;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ParticipantsFormRepository extends JpaRepository<NCTrans, Integer> {

}
