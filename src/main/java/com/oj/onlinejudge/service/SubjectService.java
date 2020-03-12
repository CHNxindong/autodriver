package com.oj.onlinejudge.service;

import com.oj.onlinejudge.entity.Subject;
import com.oj.onlinejudge.model.SubjectModel;

import java.util.List;

/**
 * @author CHNxindong
 * @date 2020/3/11 21:10
 */
public interface SubjectService {
    List<Subject> getSubjectList();
    Subject getSubjectBySid(Integer sid);
    List<Subject> getSubjectListByUid(Integer uid);
    String submit(Integer sid, Integer uid, String answer);
    String insertSubject(SubjectModel subjectModel);
    String deleteSubjectBySid(Long sid);
}
