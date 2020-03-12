package com.oj.onlinejudge.entity;

import javax.persistence.*;

/**
 * @author CHNxindong
 * @date 2020/3/12 12:40
 */
@Entity
@Table(name="testcase")
public class TestCase {
    private Long tid;
    private Long sid;
    private String caseName;
    private String caseResult;

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="tid",length=10)
    public Long getTid() {
        return tid;
    }

    @Column(name="sid",length=10)
    public Long getSid() {
        return sid;
    }

    @Column(name="case_name",length=500)
    public String getCaseName() {
        return caseName;
    }

    @Column(name="case_result",length=500)
    public String getCaseResult() {
        return caseResult;
    }

    public void setTid(Long tid) {
        this.tid = tid;
    }

    public void setSid(Long sid) {
        this.sid = sid;
    }

    public void setCaseName(String caseName) {
        this.caseName = caseName;
    }

    public void setCaseResult(String caseResult) {
        this.caseResult = caseResult;
    }

    public TestCase() {
    }
}
