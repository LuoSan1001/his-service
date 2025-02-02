package com.his.controller;

import com.his.pojo.Patient;
import com.his.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/api/patient")
public class PatientController {
    @Autowired
    private PatientService patientService;

    @GetMapping
    public List<Patient> getPatient(@RequestParam(required = false) Integer pno) {
        return patientService.getPatient(pno);
    }

    @PutMapping
    public String updatePatient(@RequestBody Patient patient) {
        if (patientService.updatePatient(patient) == 1) {
            return "success";
        } else {
            return "fail";
        }
    }

    @PostMapping
    public String addPatient(@RequestBody Patient patient) {
        if (patientService.insertPatient(patient) == 1) {
            return "success";
        } else {
            return "fail";
        }
    }

    @DeleteMapping("/{pnoList}")
    public String deletePatient(@PathVariable List<Integer> pnoList) {
        if (patientService.deletePatient(pnoList) >= 1) {
            return "success";
        } else {
            return "fail";
        }
    }
}
