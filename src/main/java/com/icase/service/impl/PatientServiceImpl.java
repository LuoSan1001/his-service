package com.icase.service.impl;

import com.icase.mapper.PatientMapper;
import com.icase.pojo.Patient;
import com.icase.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PatientServiceImpl implements PatientService {

    @Autowired
    private PatientMapper patientMapper;

    @Override
    public List<Patient> getPatient(Integer pno) {
        return patientMapper.getPatient(pno);
    }

    @Override
    public int updatePatient(Patient patient) {
        return patientMapper.updatePatient(patient);
    }

    @Override
    public Integer insertPatient(Patient patient) {
        return patientMapper.insertPatient(patient);
    }
}
