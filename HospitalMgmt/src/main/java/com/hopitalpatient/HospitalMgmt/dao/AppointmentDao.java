package com.hopitalpatient.HospitalMgmt.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.hopitalpatient.HospitalMgmt.entity.Appointment;
import com.hopitalpatient.HospitalMgmt.repository.AppointmentRepository;

import java.util.Optional;

@Repository
public class AppointmentDao {

    @Autowired
    private AppointmentRepository appointmentRepository;

    public Appointment saveAppointment(Appointment appointment) {
        return appointmentRepository.save(appointment);
    }

    public Optional<Appointment> findById(int id) {
        return appointmentRepository.findById(id);
    }

    public void deleteById(int id) {
        appointmentRepository.deleteById(id);
    }
}
