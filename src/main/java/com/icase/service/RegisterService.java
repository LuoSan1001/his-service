package com.icase.service;

import com.icase.pojo.Register;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

public interface RegisterService {
    int insertRegister(Register register);
    List<Register> selectRegister(Integer dNo, LocalDate rfVisitTime, Integer pNo);
}
