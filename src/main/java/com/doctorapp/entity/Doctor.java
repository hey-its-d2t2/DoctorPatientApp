package com.doctorapp.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "doctor")
public class Doctor {
    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name", nullable = false, length = 45)
    private String name;

    @Column(name = "qualifiaction", nullable = false)
    private String qualifiaction;

    @Column(name = "about", length = 5000)
    private String about;

    @Column(name = "experience", nullable = false)
    private String experience;

    @Column(name = "image_url")
    private String image_url;

    @Column(name = "email", nullable = false, unique = true)
    private String email;

    @Column(name = "password", nullable = false, unique = true, length = 1000)
    private String password;

    @Column(name = "mobile", length = 15)
    private String mobile;

}