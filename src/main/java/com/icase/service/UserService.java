package com.icase.service;

import com.icase.pojo.User;

import java.util.List;

public interface UserService {
//    User getUserCountByAccountAndPassword(UserLoginInfo userLoginInfo);
    List<User> getAllUser();

    User login(User user);

    Integer register(User user);

    User update(User user);
}
