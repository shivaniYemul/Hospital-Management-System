package com.hopitalpatient.HospitalMgmt.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hopitalpatient.HospitalMgmt.entity.Appointment;

import jakarta.persistence.Id;

public interface AppointmentRepository extends JpaRepository<Appointment,Integer> {
	

}
