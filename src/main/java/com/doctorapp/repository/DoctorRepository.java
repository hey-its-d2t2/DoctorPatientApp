package com.doctorapp.repository;

import com.doctorapp.entity.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface DoctorRepository extends JpaRepository<Doctor, Long> {
    @Query("SELECT d FROM Doctor d JOIN d.specialization s WHERE s.experties = :experties")
    List<Doctor> findDoctorsBySpecialization(@Param("experties") String experties);

    @Query("SELECT d FROM Doctor d " +
            "JOIN d.specialization s " +
            "JOIN d.city c " +
            "WHERE s.experties = :experties " +
            "AND c.name = :cityName")
    List<Doctor> findDoctorsBySpecializationAndCity(@Param("experties") String experties, @Param("cityName") String cityName);

    @Query("SELECT d FROM Doctor d " +
            "JOIN d.specialization s " +
            "LEFT JOIN d.city c " +
            "LEFT JOIN d.area a " +
            "WHERE s.experties = :experties " +
            "AND (c.name = :cityName OR a.area = :areaName)")
    List<Doctor> findDoctorsBySpecializationAndCityOrArea(@Param("experties") String experties,
                                                          @Param("cityName") String cityName,
                                                          @Param("areaName") String areaName);
}
