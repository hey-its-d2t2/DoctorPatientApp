package com.doctorapp.repository;

import com.doctorapp.entity.AppointmentChart;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppointmentChartRepository extends JpaRepository<AppointmentChart, Long> {
}