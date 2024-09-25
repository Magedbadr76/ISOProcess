package com.isoProcess.service;

import com.isoProcess.entity.UserJobs;

import java.util.List;

public interface UserJobsService {

    // Create or update a job
    UserJobs saveOrUpdateJob(UserJobs userJob);

    // Retrieve a job by ID
    UserJobs getJobById(Integer id);

    // Retrieve all jobs
    List<UserJobs> getAllJobs();

    // Delete a job by ID
    void deleteJobById(Integer id);

    // Retrieve jobs by user ID
    List<UserJobs> getJobsByUserId(int userId);
}