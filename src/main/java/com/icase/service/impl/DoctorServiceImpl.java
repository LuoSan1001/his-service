package com.icase.service.impl;

import com.icase.mapper.DoctorMapper;
import com.icase.pojo.Doctor;
import com.icase.service.DoctorService;
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
    public Integer insertDoctor(Doctor doctor) {
        return doctorMapper.insertDoctor(doctor);
    }
}
