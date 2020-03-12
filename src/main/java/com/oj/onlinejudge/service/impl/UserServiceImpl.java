package com.oj.onlinejudge.service.impl;

import com.oj.onlinejudge.dao.UserDao;
import com.oj.onlinejudge.entity.User;
import com.oj.onlinejudge.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author CHNxindong
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserDao userDao;

    @Override
    public String userLogin(Integer uid, String name) {
        User user = userDao.userLogin(uid, name);

        if(user != null){
            user.setLoginNum(user.getLoginNum() + 1);
            userDao.save(user);
            return "ok";
        }else{
            return "error";
        }
    }

    @Override
    public String userRegister(User user) {
        userDao.save(user);

        return "ok";
    }

    @Override
    public List<User> getUserList() {
        List<User> userList = userDao.getUserList();

        return userList;
    }

    @Override
    public User getUserByUid(Integer uid) {
        User user = userDao.getUserByUid(uid);

        return user;
    }

    @Override
    public String deleteUserByUid(Integer uid) {
        userDao.delete(uid.longValue());

        return "ok";
    }
}
