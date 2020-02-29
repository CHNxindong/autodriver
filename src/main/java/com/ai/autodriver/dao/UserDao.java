package com.ai.autodriver.dao;

import com.ai.autodriver.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface UserDao extends JpaRepository<User,Long> {
    @Query(value="select * from user",nativeQuery=true)
    public List<User> getUserList();
}
