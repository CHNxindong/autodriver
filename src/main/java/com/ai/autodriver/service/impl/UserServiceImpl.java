package com.ai.autodriver.service.impl;

import com.ai.autodriver.dao.UserDao;
import com.ai.autodriver.entity.User;
import com.ai.autodriver.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserDao userDao;

    @Override
    public List<User> getUserList() {
        List<User> userList = userDao.getUserList();

        return userList;
    }
}
