package com.hopitalpatient.HospitalMgmt.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Appointment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    private String appointmentDate;
    private String doctorName;

    @OneToOne
    private Patient patient;

}
