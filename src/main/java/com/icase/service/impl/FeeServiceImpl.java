package com.icase.service.impl;

import com.icase.mapper.FeeMapper;
import com.icase.pojo.Fee;
import com.icase.service.FeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FeeServiceImpl implements FeeService {
    @Autowired
    private FeeMapper feeMapper;

    @Override
    public List<Fee> getFee(Integer pNo) {
        return feeMapper.getFee(pNo);
    }

    @Override
    public int updateFee(Fee fee) {
        return feeMapper.updateFee(fee);
    }
}
