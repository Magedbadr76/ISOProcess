package com.isoProcess.service.impl;

import java.util.List;

import com.isoProcess.entity.DashboardCountPerDept;
import com.isoProcess.repo.DashboardRepository;
import com.isoProcess.service.DashboardService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DashboardServiceImpl implements DashboardService {

    @Autowired
    private DashboardRepository dashboardRepository;

    public List<DashboardCountPerDept> getallPending() {
        return dashboardRepository.getPendingAuditsByDept();
    }

    public List<DashboardCountPerDept> getallCompleted() {
        return dashboardRepository.getCompletedByDept();
    }

    public List<DashboardCountPerDept> getAuditsPerStatus() {
        return dashboardRepository.getAuditsPerStatus();
    }
}