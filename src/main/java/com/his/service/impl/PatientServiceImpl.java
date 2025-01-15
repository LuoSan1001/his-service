package com.his.service.impl;

import com.his.mapper.PatientMapper;
import com.his.pojo.Patient;
import com.his.service.PatientService;
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

    @Override
    public Integer deletePatient(List<Integer> pnoList) {
        return patientMapper.deletePatient(pnoList);
    }

}
