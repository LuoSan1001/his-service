package com.his.service;

import com.his.pojo.Doctor;

import java.util.List;

public interface DoctorService {
    List<Doctor> getDoctor(Integer dNo);
    Doctor insertDoctor(Doctor doctor);
    Integer updateDoctor(Doctor doctor);
    Integer deleteDoctor(List<Integer> doctorIds);
}
