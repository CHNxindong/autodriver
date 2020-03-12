package com.oj.onlinejudge.entity;

import javax.persistence.*;

/**
 * Entity User
 *
 * @author CHNxindong
 * @date 2020/3/1
 */
@Entity
@Table(name="user")
public class User {
    private Long uid;
    private String name;
    private String sex;
    private Integer role;
    private Integer score;
    private Integer subjectNum;
    private Integer loginNum;
    private Float acRate;

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="uid",length=10)
    public Long getUid() {
        return uid;
    }

    public void setUid(Long uid) {
        this.uid = uid;
    }

    @Column(name="name",length=100)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Column(name="sex",length=25)
    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Column(name="role",length=10)
    public Integer getRole() {
        return role;
    }

    @Column(name="score",length=10)
    public Integer getScore() {
        return score;
    }

    public void setRole(Integer role) {
        this.role = role;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    @Column(name="subject_num",length=10)
    public Integer getSubjectNum() {
        return subjectNum;
    }

    @Column(name="login_num",length=10)
    public Integer getLoginNum() {
        return loginNum;
    }

    @Column(name="ac_rate",length=10)
    public Float getAcRate() {
        return acRate;
    }

    public void setSubjectNum(Integer subjectNum) {
        this.subjectNum = subjectNum;
    }

    public void setLoginNum(Integer loginNum) {
        this.loginNum = loginNum;
    }

    public void setAcRate(Float acRate) {
        this.acRate = acRate;
    }

    public User() {

    }

}
