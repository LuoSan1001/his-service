package com.icase.controller;

import com.icase.pojo.Diagnosis;
import com.icase.service.DiagnosisService;
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
}
