package com.hopitalpatient.HospitalMgmt.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hopitalpatient.HospitalMgmt.entity.Patient;

public interface PatientRepository extends JpaRepository<Patient,Integer>{

}
