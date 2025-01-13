package com.icase.service;

import com.icase.pojo.Fee;

import java.util.List;

public interface FeeService {
    List<Fee> getFee(Integer pNo);
    int updateFee(Fee fee);
}
