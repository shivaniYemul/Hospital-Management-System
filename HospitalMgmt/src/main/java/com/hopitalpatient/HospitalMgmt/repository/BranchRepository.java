package com.hopitalpatient.HospitalMgmt.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.hopitalpatient.HospitalMgmt.entity.Branch;

public interface BranchRepository extends JpaRepository<Branch, Integer>{

//	@Modifying
//	@Query("delete from branch b where b.id=:branchId")
//	void deleteBYId(@Param("branchId") int branchId);
}
