package com.oj.onlinejudge.dao;

import com.oj.onlinejudge.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

/**
 * Dao UserDao
 *
 * @author CHNxindong
 * @date 2020/3/1
 */
public interface UserDao extends JpaRepository<User,Long> {
    @Query(value="select * from user",nativeQuery=true)
    List<User> getUserList();

    @Query(value="select * from user where uid = ?1",nativeQuery=true)
    User getUserByUid(Integer uid);

    @Query(value="select * from user where uid = ?1 and name = ?2",nativeQuery=true)
    User userLogin(Integer uid, String name);
}
