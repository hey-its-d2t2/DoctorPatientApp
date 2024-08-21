package com.doctorapp.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "reports")
public class Reports {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "report_name", nullable = false)
    private String report_name;

    @Column(name = "report_url", nullable = false)
    private String report_url;

    @ManyToOne
    @JoinColumn(name = "patient_id")
    private Patient patient;

}