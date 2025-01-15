package com.his.service;

import com.his.pojo.Patient;

import java.util.List;

public interface PatientService {
    List<Patient> getPatient(Integer pno);
    int updatePatient(Patient patient);
    Integer insertPatient(Patient patient);
    Integer deletePatient(List<Integer> pnoList);
}
