package com.his.mapper;

import com.his.pojo.Fee;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface FeeMapper {
    List<Fee> getFee(Integer pNo);
    int updateFee(Fee fee);
    Integer deleteFee(List<Integer> fNos);
    Integer insertFee(Fee fee);
}
