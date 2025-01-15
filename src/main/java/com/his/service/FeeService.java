package com.his.service;

import com.his.pojo.Fee;

import java.util.List;

public interface FeeService {
    List<Fee> getFee(Integer pNo);
    int updateFee(Fee fee);
    Integer deleteFee(List<Integer> fNos);
}
