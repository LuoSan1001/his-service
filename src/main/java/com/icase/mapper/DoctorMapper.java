package com.icase.mapper;

import com.icase.pojo.Doctor;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface DoctorMapper {
    List<Doctor> getDoctor(Integer dNo);
    Integer insertDoctor(Doctor doctor);
}
