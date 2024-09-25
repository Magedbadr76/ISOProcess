package com.isoProcess.service.impl;

import java.util.List;
import java.util.Optional;

import com.isoProcess.entity.UserJobs;
import com.isoProcess.repo.UserJobsRepository;
import com.isoProcess.service.UserJobsService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserJobsServiceImpl implements UserJobsService {

    @Autowired
    private UserJobsRepository userJobsRepository;

    @Override
    public UserJobs saveOrUpdateJob(UserJobs userJob) {
        return userJobsRepository.save(userJob);
    }

    @Override
    public UserJobs getJobById(Integer id) {
        Optional<UserJobs> job = userJobsRepository.findById(id);
        return job.orElse(null);
    }

    @Override
    public List<UserJobs> getAllJobs() {
        return userJobsRepository.findAll();
    }

    @Override
    public void deleteJobById(Integer id) {
        userJobsRepository.deleteById(id);
    }

    @Override
    public List<UserJobs> getJobsByUserId(int userId) {
        return userJobsRepository.findByJobUserId(userId);
    }
}