package com.icase.mapper;

import com.icase.pojo.Fee;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface FeeMapper {
    List<Fee> getFee(Integer pNo);
    int updateFee(Fee fee);
}
