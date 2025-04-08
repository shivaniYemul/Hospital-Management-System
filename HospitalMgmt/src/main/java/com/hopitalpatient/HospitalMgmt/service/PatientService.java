package com.hopitalpatient.HospitalMgmt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.hopitalpatient.HospitalMgmt.dao.PatientDao;
import com.hopitalpatient.HospitalMgmt.dao.BranchDao;
import com.hopitalpatient.HospitalMgmt.entity.Patient;
import com.hopitalpatient.HospitalMgmt.entity.Branch;

@Service
public class PatientService {

    @Autowired
    private PatientDao patientDao;
    
    @Autowired
    private BranchDao branchDao;

    public Patient savePatient(int branchId, Patient p) {
        Branch branch = branchDao.findByBranchId(branchId);
        if (branch != null) {
            p.setBranch(branch);
            return patientDao.savePatient(p);
        }
        return null;
    }

    public Patient findPatientById(int id) {
        return patientDao.findById(id).orElse(null);
    }

    public void deletePatient(int id) {
        patientDao.deleteById(id);
    }

    public Patient updatePatient(int id, Patient p) {
        Patient existing = findPatientById(id);
        if (existing != null) {
            existing.setName(p.getName());
            existing.setAge(p.getAge());
            return patientDao.savePatient(existing);
        }
        return null;
    }
}
