package com.hopitalpatient.HospitalMgmt.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Patient {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    private String name;
    private int age;

    @ManyToOne
    private Branch branch;

    @OneToOne( cascade = CascadeType.ALL)
    private Appointment appointment;

  
}
