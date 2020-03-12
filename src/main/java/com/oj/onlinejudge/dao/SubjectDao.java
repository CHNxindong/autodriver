package com.oj.onlinejudge.dao;

import com.oj.onlinejudge.entity.Subject;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

/**
 * @author CHNxindong
 * @date 2020/3/11 21:07
 */
public interface SubjectDao extends JpaRepository<Subject,Long> {
    @Query(value="select * from subject",nativeQuery=true)
    List<Subject> getSubjectList();

    @Query(value="select * from subject where sid = ?1",nativeQuery=true)
    Subject getSubjectBySid(Integer sid);

    @Query(value="select * from subject where uid = ?1",nativeQuery=true)
    List<Subject> getSubjectListByUid(Integer uid);
}
