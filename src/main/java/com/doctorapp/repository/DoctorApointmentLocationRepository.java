package com.doctorapp.repository;

import com.doctorapp.entity.DoctorApointmentLocation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DoctorApointmentLocationRepository extends JpaRepository<DoctorApointmentLocation, Long> {
}