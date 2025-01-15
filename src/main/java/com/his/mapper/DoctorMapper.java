package com.his.mapper;

import com.his.pojo.Doctor;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;

import java.util.List;

@Mapper
public interface DoctorMapper {
    List<Doctor> getDoctor(Integer dNo);
    @Options(useGeneratedKeys = true, keyProperty = "dNo")
    Doctor insertDoctor(Doctor doctor);
    Integer updateDoctor(Doctor doctor);
    Integer deleteDoctor(List<Integer> doctorIds);
}
