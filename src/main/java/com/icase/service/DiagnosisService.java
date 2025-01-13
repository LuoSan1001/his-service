package com.icase.service;

import com.icase.pojo.Diagnosis;

import java.util.List;

public interface DiagnosisService {
    List<Diagnosis> getDiagnosis(Integer pNo, Integer dNo);
}
