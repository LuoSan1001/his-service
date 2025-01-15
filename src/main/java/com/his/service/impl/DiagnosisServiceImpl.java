package com.his.service.impl;

import com.his.mapper.DiagnosisMapper;
import com.his.pojo.Diagnosis;
import com.his.service.DiagnosisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DiagnosisServiceImpl implements DiagnosisService {
    @Autowired
    private DiagnosisMapper diagnosisMapper;

    @Override
    public List<Diagnosis> getDiagnosis(Integer pNo, Integer dNo) {
        return diagnosisMapper.selectDiagnosis(pNo, dNo);
    }

    @Override
    public Integer updateDiagnosis(Diagnosis diagnosis) {
        return diagnosisMapper.updateDiagnosis(diagnosis);
    }

    @Override
    public Integer deleteDiagnosis(List<Integer> dgNos) {
        return diagnosisMapper.deleteDiagnosis(dgNos);
    }
}
