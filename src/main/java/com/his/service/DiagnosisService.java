package com.his.service;

import com.his.pojo.Diagnosis;

import java.util.List;

public interface DiagnosisService {
    List<Diagnosis> getDiagnosis(Integer pNo, Integer dNo);
    Integer updateDiagnosis(Diagnosis diagnosis);
    Integer deleteDiagnosis(List<Integer> dgNos);
}
