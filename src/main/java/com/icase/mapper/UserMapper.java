package com.icase.mapper;

import com.icase.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface UserMapper {
    List<User> getAllUser();

    User login(User user);

    Integer register(User user);

    User update(User user);
}
