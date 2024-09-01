package com.doctorapp.repository;

import com.doctorapp.entity.Consultation_time;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ConsultationTimeRepo extends JpaRepository<Consultation_time, Long> {
    List<Consultation_time> findByDoctorId(Long doctorId);

    @Query("SELECT c FROM Consultation_time c WHERE c.status = :status")
    List<Consultation_time> findByStatus(@Param("status") String status);

    @Query("SELECT c FROM Consultation_time c WHERE c.status = :status AND c.doctor.id = :doctorId")
    List<Consultation_time> findByStatusAndDoctorId(@Param("status") String status, @Param("doctorId") Long doctorId);
}