package com.hopitalpatient.HospitalMgmt.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import com.hopitalpatient.HospitalMgmt.entity.Hospital;

public interface HospitalRepository extends JpaRepository<Hospital, Integer> {

	
}
