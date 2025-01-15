package com.his.mapper;

import com.his.pojo.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {
    List<User> getAllUser();

    User login(User user);

    Integer register(User user);

    Integer update(User user);

    Integer delete(List<Integer> idList);
}
