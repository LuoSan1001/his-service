package com.his.mapper;

import com.his.pojo.Register;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.time.LocalDate;
import java.util.List;

@Mapper
public interface RegisterMapper {
    int insertRegister(Register register);
    List<Register> selectRegister(@Param("dNo") Integer dNo,
                                  @Param("rfVisitTime") LocalDate rfVisitTime,
                                  @Param("pNo") Integer pNo);
    Integer updateRegister(Register register);
    Integer deleteRegister(Register register);
}
