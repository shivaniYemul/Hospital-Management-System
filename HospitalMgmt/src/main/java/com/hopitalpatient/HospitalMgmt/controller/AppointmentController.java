package com.hopitalpatient.HospitalMgmt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.hopitalpatient.HospitalMgmt.entity.Appointment;
import com.hopitalpatient.HospitalMgmt.service.AppointmentService;

@RestController
@RequestMapping("/appointment")
public class AppointmentController {

    @Autowired
    private AppointmentService appointmentService;

    @PostMapping("/add/{patientId}")
    public Appointment saveAppointment(@PathVariable int patientId, @RequestBody Appointment a) {
        return appointmentService.saveAppointment(patientId, a);
    }

    @GetMapping("/{id}")
    public Appointment findAppointmentById(@PathVariable int id) {
        return appointmentService.findAppointmentById(id);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteAppointment(@PathVariable int id) {
        appointmentService.deleteAppointment(id);
    }

    @PutMapping("/update/{id}")
    public Appointment updateAppointment(@PathVariable int id, @RequestBody Appointment a) {
        return appointmentService.updateAppointment(id, a);
    }
}
