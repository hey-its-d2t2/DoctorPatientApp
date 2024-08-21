package com.doctorapp.repository;

import com.doctorapp.entity.DoctorSpecialization;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DoctorSpecializationRepository extends JpaRepository<DoctorSpecialization, Long> {
}