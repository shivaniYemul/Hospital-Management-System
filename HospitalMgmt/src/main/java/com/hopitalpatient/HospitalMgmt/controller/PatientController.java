package com.hopitalpatient.HospitalMgmt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.hopitalpatient.HospitalMgmt.entity.Patient;
import com.hopitalpatient.HospitalMgmt.service.PatientService;

@RestController
@RequestMapping("/patient")
public class PatientController {

    @Autowired
    private PatientService patientService;

    @PostMapping("/add/{branchId}")
    public Patient savePatient(@PathVariable int branchId, @RequestBody Patient p) {
        return patientService.savePatient(branchId, p);
    }

    @GetMapping("/{id}")
    public Patient findPatientById(@PathVariable int id) {
        return patientService.findPatientById(id);
    }

    @DeleteMapping("/delete/{id}")
    public void deletePatient(@PathVariable int id) {
        patientService.deletePatient(id);
    }

    @PutMapping("/update/{id}")
    public Patient updatePatient(@PathVariable int id, @RequestBody Patient p) {
        return patientService.updatePatient(id, p);
    }
}
