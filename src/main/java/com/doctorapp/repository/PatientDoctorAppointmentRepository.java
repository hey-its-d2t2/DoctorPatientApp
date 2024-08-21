package com.doctorapp.repository;

import com.doctorapp.entity.PatientDoctorAppointment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientDoctorAppointmentRepository extends JpaRepository<PatientDoctorAppointment, Long> {
}