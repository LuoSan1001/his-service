package com.icase.controller;

import com.icase.pojo.Doctor;
import com.icase.service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/api/doctor")
public class DoctorController {
    @Autowired
    private DoctorService doctorService;

    @GetMapping
    public List<Doctor> getDoctor(@RequestParam(required = false) Integer dNo) {
        return doctorService.getDoctor(dNo);
    }

    @PostMapping
    public String addDoctor(@RequestBody Doctor doctor) {
        if (doctorService.insertDoctor(doctor) != null) {
            return "success";
        } else {
            return "fail";
        }
    }
}
