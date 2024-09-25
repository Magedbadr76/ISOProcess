package com.isoProcess.repo;

import java.util.List;

import com.isoProcess.entity.DashboardCountPerDept;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DashboardRepository extends CrudRepository<DashboardCountPerDept, String> {

	@Query(value = "SELECT audit_area_name AS name, COUNT(*) AS counts " + "FROM schedule_audit aud, audit_area area "
			+ "WHERE aud.schedule_auditarea = area.audit_area_id " + "AND schedule_state != 'SUBMITTED' "
			+ "GROUP BY area.audit_area_name", nativeQuery = true)
	List<DashboardCountPerDept> getPendingAuditsByDept();

	@Query(value = "SELECT audit_area_name AS name, COUNT(*) AS counts " + "FROM schedule_audit aud, audit_area area "
			+ "WHERE aud.schedule_auditarea = area.audit_area_id " + "AND schedule_state = 'SUBMITTED' "
			+ "GROUP BY area.audit_area_name", nativeQuery = true)
	List<DashboardCountPerDept> getCompletedByDept();

	@Query(value = "SELECT schedule_state AS name, COUNT(*) AS counts " + "FROM schedule_audit "
			+ "GROUP BY schedule_state", nativeQuery = true)
	List<DashboardCountPerDept> getAuditsPerStatus();
}
