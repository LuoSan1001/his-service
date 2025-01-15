package com.his.service.impl;

import com.his.mapper.FeeMapper;
import com.his.pojo.Fee;
import com.his.service.FeeService;
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

    @Override
    public Integer deleteFee(List<Integer> fNos) {
        return feeMapper.deleteFee(fNos);
    }
}
