package com.his.service;

import com.his.pojo.Register;

import java.time.LocalDate;
import java.util.List;

public interface RegisterService {
    int insertRegister(Register register);
    List<Register> selectRegister(Integer dNo, LocalDate rfVisitTime, Integer pNo);
}
