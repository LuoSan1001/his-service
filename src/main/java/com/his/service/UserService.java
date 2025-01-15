package com.his.service;

import com.his.pojo.User;

import java.util.List;

public interface UserService {
//    User getUserCountByAccountAndPassword(UserLoginInfo userLoginInfo);
    List<User> getAllUser();

    User login(User user);

    Integer register(User user);

    Integer update(User user);

    Integer delete(List<Integer> idList);
}
