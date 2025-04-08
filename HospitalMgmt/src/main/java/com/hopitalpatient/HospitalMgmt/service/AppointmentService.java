package com.hopitalpatient.HospitalMgmt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.hopitalpatient.HospitalMgmt.dao.AppointmentDao;
import com.hopitalpatient.HospitalMgmt.dao.PatientDao;
import com.hopitalpatient.HospitalMgmt.entity.Appointment;
import com.hopitalpatient.HospitalMgmt.entity.Patient;

@Service
public class AppointmentService {

    @Autowired
    private AppointmentDao appointmentDao;
    
    @Autowired
    private PatientDao patientDao;

    public Appointment saveAppointment(int patientId, Appointment a) {
        Patient patient = patientDao.findById(patientId).orElse(null);
        if (patient != null) {
            a.setPatient(patient);
            return appointmentDao.saveAppointment(a);
        }
        return null;
    }

    public Appointment findAppointmentById(int id) {
        return appointmentDao.findById(id).orElse(null);
    }

    public void deleteAppointment(int id) {
        appointmentDao.deleteById(id);
    }

    public Appointment updateAppointment(int id, Appointment a) {
        Appointment existing = findAppointmentById(id);
        if (existing != null) {
            existing.setAppointmentDate(a.getAppointmentDate());
            existing.setDoctorName(a.getDoctorName());
            return appointmentDao.saveAppointment(existing);
        }
        return null;
    }
}
