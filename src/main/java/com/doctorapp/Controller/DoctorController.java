package com.doctorapp.Controller;

import com.doctorapp.entity.Consultation_time;
import com.doctorapp.entity.Doctor;
import com.doctorapp.repository.ConsultationTimeRepo;
import com.doctorapp.repository.DoctorRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.print.Doc;
import java.util.List;

@RestController
@RequestMapping("/api/v1/doctor")
public class DoctorController {
    private DoctorRepository doctorRepository;
    private ConsultationTimeRepo consultationTimeRepo;

    public DoctorController(DoctorRepository doctorRepository, ConsultationTimeRepo consultationTimeRepo) {
        this.doctorRepository = doctorRepository;
        this.consultationTimeRepo = consultationTimeRepo;
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

//    consultation time
 /*   @GetMapping("getConsultationInfo")
    public  List<Consultation_time> getConsutationByDoctorId(long id){
        return consultationTimeRepo.findByDoctorId(1L);
    }*/


//    ------
    @GetMapping("/by-doctor")
    public List<Consultation_time> getConsultationsByDoctorId(@RequestParam Long doctorId) {
        return consultationTimeRepo.findByDoctorId(doctorId);
    }
    @GetMapping("/by-status")
    public List<Consultation_time> getConsultationsByStatus(@RequestParam String status) {
        return consultationTimeRepo.findByStatus(status);
    }
    @GetMapping("/by-status-and-doctor")
    public List<Consultation_time> getConsultationsByStatusAndDoctorId(
            @RequestParam String status,
            @RequestParam Long doctorId) {
        return consultationTimeRepo.findByStatusAndDoctorId(status, doctorId);
    }

}
