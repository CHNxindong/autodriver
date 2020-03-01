package com.ai.autodriver.dao;

import com.ai.autodriver.entity.User;
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
    public List<User> getUserList();
}
