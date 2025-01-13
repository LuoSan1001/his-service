package com.icase.service.impl;

import com.icase.mapper.UserMapper;
import com.icase.pojo.User;
import com.icase.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> getAllUser() {
        return userMapper.getAllUser();
    }

    @Override
    public User login(User user) {
        return userMapper.login(user);
    }

    @Override
    public Integer register(User user) {
        return userMapper.register(user);
    }

    @Override
    public User update(User user) {
        return userMapper.update(user);
    }
}
