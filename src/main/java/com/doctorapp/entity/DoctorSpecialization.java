package com.doctorapp.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "doctor_specialization")
public class DoctorSpecialization {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "specialization", nullable = false)
    private String specialization;

    @OneToOne(orphanRemoval = true)
    @JoinColumn(name = "doctor_specialization_id")
    private DoctorSpecialization doctorSpecialization;

}