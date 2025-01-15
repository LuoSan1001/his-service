package com.his.service.impl;

import com.his.mapper.DoctorMapper;
import com.his.pojo.Doctor;
import com.his.service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DoctorServiceImpl implements DoctorService {
    @Autowired
    private DoctorMapper doctorMapper;

    @Override
    public List<Doctor> getDoctor(Integer dNo) {
        return doctorMapper.getDoctor(dNo);
    }

    @Override
    public Doctor insertDoctor(Doctor doctor) {
        return doctorMapper.insertDoctor(doctor);
    }

    @Override
    public Integer updateDoctor(Doctor doctor) {
        return doctorMapper.updateDoctor(doctor);
    }

    @Override
    public Integer deleteDoctor(List<Integer> doctorIds) {
        return doctorMapper.deleteDoctor(doctorIds);
    }
}
