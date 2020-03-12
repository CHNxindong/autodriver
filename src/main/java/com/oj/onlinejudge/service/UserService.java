package com.oj.onlinejudge.service;

import com.oj.onlinejudge.entity.User;

import java.util.List;

/**
 * Service UserService
 *
 * @author CHNxindong
 * @date 2020/3/1
 */
public interface UserService {
    String userLogin(Integer uid, String name);
    String userRegister(User user);
    List<User> getUserList();
    User getUserByUid(Integer uid);
    String deleteUserByUid(Integer uid);
}
