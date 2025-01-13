package com.icase.mapper;

import com.icase.pojo.Diagnosis;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface DiagnosisMapper {
    List<Diagnosis> selectDiagnosis(@Param("pNo") Integer pNo, @Param("dNo") Integer dNo);
}
