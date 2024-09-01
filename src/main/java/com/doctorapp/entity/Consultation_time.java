package com.doctorapp.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalTime;

@Getter
@Setter
@Entity
@Table(name = "consultation_time")
public class Consultation_time {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "local_date", nullable = false)
    private LocalDate localDate;

    @Column(name = "time", nullable = false)
    private LocalTime time;

    @Column(name = "status", nullable = false)
    private String status;
    @ManyToOne
    @JoinColumn(name = "doctor_id")
    private Doctor doctor;

}