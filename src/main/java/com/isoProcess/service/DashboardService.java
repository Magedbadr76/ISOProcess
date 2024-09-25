package com.isoProcess.service;

import java.util.List;

import com.isoProcess.entity.DashboardCountPerDept;



public interface DashboardService {
	public List<DashboardCountPerDept> getallPending();
	public List<DashboardCountPerDept> getallCompleted();
	public List<DashboardCountPerDept> getAuditsPerStatus();
	
}