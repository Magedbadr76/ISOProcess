package com.isoProcess.repo;


import java.util.List;

import com.isoProcess.entity.UserJobs;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserJobsRepository extends JpaRepository<UserJobs, Integer> {

	List<UserJobs> findByJobUserId(int jobUserId);
}
