package com.doctorapp.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "doctor_apointment_location")
public class DoctorApointmentLocation {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "area", nullable = false)
    private String area;

    @Column(name = "city", nullable = false)
    private String city;

    @Column(name = "country", nullable = false)
    private String country;

    @Column(name = "contact_number", nullable = false)
    private String contact_number;

    @ManyToOne
    @JoinColumn(name = "doctor_id")
    private Doctor doctor;

}