package com.doctorapp.Controller;

import com.doctorapp.entity.Doctor;
import com.doctorapp.repository.DoctorRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.print.Doc;
import java.util.List;

@RestController
@RequestMapping("/api/v1/doctor")
public class DoctorController {
    private DoctorRepository doctorRepository;

    public DoctorController(DoctorRepository doctorRepository) {
        this.doctorRepository = doctorRepository;
    }

   @GetMapping("/search")
    public List<Doctor> searchDoctorResult(){
       return  doctorRepository.findDoctorsBySpecialization("Heart");
    }

    @GetMapping("/search/city/spec")
    public List<Doctor> findDoctorsBySpecializationAndCity(String experties, String cityName) {
        return doctorRepository.findDoctorsBySpecializationAndCity("Heart", "bangalore");
    }

    // Search by city
    @GetMapping("search/city/area")
    public List<Doctor> findDoctorsBySpecializationAndCityOrArea(String experties, String cityName, String areaName) {
       // return doctorRepository.findDoctorsBySpecializationAndCityOrArea("Heart", "Delhi",null);
        return doctorRepository.findDoctorsBySpecializationAndCityOrArea("Heart", null,"New Delhi");
    }


    /*// Search by area
    public List<Doctor> findDoctorsBySpecializationAndCityOrArea(String experties, String cityName, String areaName){
        List<Doctor> doctorsByArea = doctorRepository.findDoctorsBySpecializationAndCityOrArea("dentist", null, "BTM");
     }
    */
}
