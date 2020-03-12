package com.oj.onlinejudge.model;

import com.oj.onlinejudge.entity.Subject;
import com.oj.onlinejudge.entity.TestCase;

import java.util.List;

/**
 * @author CHNxindong
 * @date 2020/3/12 13:47
 */
public class SubjectModel {
    private Subject subject;
    private List<TestCase> testcaseList;

    public Subject getSubject() {
        return subject;
    }

    public List<TestCase> getTestcaseList() {
        return testcaseList;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    public void setTestcaseList(List<TestCase> testcaseList) {
        this.testcaseList = testcaseList;
    }
}
