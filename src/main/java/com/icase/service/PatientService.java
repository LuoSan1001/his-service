package com.icase.service;

import com.icase.pojo.Patient;

import java.util.List;

public interface PatientService {
    List<Patient> getPatient(Integer pno);
    int updatePatient(Patient patient);
    Integer insertPatient(Patient patient);
}
