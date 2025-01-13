package com.icase.service.impl;

import com.icase.mapper.RegisterMapper;
import com.icase.pojo.Register;
import com.icase.service.RegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Service
public class RegisterServiceImpl implements RegisterService {
    @Autowired
    private RegisterMapper registerMapper;

    @Override
    public int insertRegister(Register register) {
        return registerMapper.insertRegister(register);
    }

    @Override
    public List<Register> selectRegister(Integer dNo, LocalDate rfVisitTime, Integer pNo) {
        return registerMapper.selectRegister(dNo, rfVisitTime, pNo);
    }
}
