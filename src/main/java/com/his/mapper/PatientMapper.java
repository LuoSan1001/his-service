package com.his.mapper;

import com.his.pojo.Patient;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface PatientMapper {
    List<Patient> getPatient(Integer pno);
    int updatePatient(Patient patient);
    Integer insertPatient(Patient patient);
    Integer deletePatient(List<Integer> pnoList);
}
