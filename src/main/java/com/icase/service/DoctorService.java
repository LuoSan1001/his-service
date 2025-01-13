package com.icase.service;

import com.icase.pojo.Doctor;

import java.util.List;

public interface DoctorService {
    List<Doctor> getDoctor(Integer dNo);
    Integer insertDoctor(Doctor doctor);
}
