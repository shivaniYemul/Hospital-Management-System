package com.hopitalpatient.HospitalMgmt.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.hopitalpatient.HospitalMgmt.entity.Patient;
import com.hopitalpatient.HospitalMgmt.repository.PatientRepository;

import java.util.Optional;

@Repository
public class PatientDao {

    @Autowired
    private PatientRepository patientRepository;

    public Patient savePatient(Patient patient) {
        return patientRepository.save(patient);
    }

    public Optional<Patient> findById(int id) {
        return patientRepository.findById(id);
    }

    public void deleteById(int id) {
        patientRepository.deleteById(id);
    }
}
