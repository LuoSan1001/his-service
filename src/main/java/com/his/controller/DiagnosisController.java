package com.his.controller;

import com.his.pojo.Diagnosis;
import com.his.service.DiagnosisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/api/diagnosis")
public class DiagnosisController {
    @Autowired
    private DiagnosisService diagnosisService;

    @GetMapping
    public List<Diagnosis> getDiagnosis(@RequestParam(required = false) Integer pNo,
                                        @RequestParam(required = false) Integer dNo) {
        return diagnosisService.getDiagnosis(pNo, dNo);
    }

    @DeleteMapping("/{dgNoList}")
    public String deleteDiagnosis(@PathVariable List<Integer> dgNoList) {
        if (diagnosisService.deleteDiagnosis(dgNoList) >=1) {
            return "success";
        } else {
            return "fail";
        }
    }

    @PutMapping
    public String updateDiagnosis(@RequestBody Diagnosis diagnosis) {
        if (diagnosisService.updateDiagnosis(diagnosis) >=1) {
            return "success";
        } else {
            return "fail";
        }
    }
}
