package com.isoProcess.controller;

import com.isoProcess.entity.UserJobs;
import com.isoProcess.service.UserJobsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user-jobs")
public class UserJobsController {

    @Autowired
    private UserJobsService userJobsService;

    @PostMapping
    public UserJobs createOrUpdateJob(@RequestBody UserJobs userJob) {
        return userJobsService.saveOrUpdateJob(userJob);
    }

    @GetMapping("/{id}")
    public UserJobs getJobById(@PathVariable Integer id) {
        return userJobsService.getJobById(id);
    }

    @GetMapping
    public List<UserJobs> getAllJobs() {
        return userJobsService.getAllJobs();
    }

    @DeleteMapping("/{id}")
    public String deleteJobById(@PathVariable Integer id) {
        userJobsService.deleteJobById(id);
        return "Job deleted successfully!";
    }

    @GetMapping("/user/{userId}")
    public List<UserJobs> getJobsByUserId(@PathVariable int userId) {
        return userJobsService.getJobsByUserId(userId);
    }
}