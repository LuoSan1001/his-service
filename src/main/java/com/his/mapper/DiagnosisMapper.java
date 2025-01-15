package com.his.mapper;

import com.his.pojo.Diagnosis;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface DiagnosisMapper {
    List<Diagnosis> selectDiagnosis(@Param("pNo") Integer pNo, @Param("dNo") Integer dNo);
    Integer insertDiagnosis(Diagnosis diagnosis);
    Integer updateDiagnosis(Diagnosis diagnosis);
    Integer deleteDiagnosis(List<Integer> dgNos);
}
