package com.icase.mapper;

import com.icase.pojo.Patient;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface PatientMapper {
    List<Patient> getPatient(Integer pno);
    int updatePatient(Patient patient);
    Integer insertPatient(Patient patient);
}
