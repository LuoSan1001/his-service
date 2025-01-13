package com.icase.service.impl;

import com.icase.mapper.DiagnosisMapper;
import com.icase.pojo.Diagnosis;
import com.icase.service.DiagnosisService;
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
}
