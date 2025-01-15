package com.his.controller;

import com.his.pojo.Doctor;
import com.his.service.DoctorService;
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
        Doctor doctor1 = doctorService.insertDoctor(doctor);
        if (doctor1 != null) {
            return "doctor" + doctor1.getDNo();
        } else {
            return "fail";
        }
    }

    @PutMapping
    public String updateDoctor(@RequestBody Doctor doctor) {
        if (doctorService.updateDoctor(doctor) >= 1) {
            return "success";
        } else {
            return "fail";
        }
    }

    @DeleteMapping("/{doctorIds}")
    public String deleteDoctor(@PathVariable List<Integer> doctorIds) {
        if (doctorService.deleteDoctor(doctorIds) >= 1) {
            return "success";
        } else {
            return "fail";
        }
    }

}
