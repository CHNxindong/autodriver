package com.oj.onlinejudge.entity;

import javax.persistence.*;
import java.util.List;

/**
 * @author CHNxindong
 * @date 2020/3/11 21:04
 */
@Entity
@Table(name="subject")
public class Subject {
    private Long sid;
    private String title;
    private String describle;
    private Integer difficulty;
    private Integer submitNum;
    private Integer acNum;

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="sid",length=10)
    public Long getSid() {
        return sid;
    }

    @Column(name="title",length=100)
    public String getTitle() {
        return title;
    }

    @Column(name="describle",length=1000)
    public String getDescrible() {
        return describle;
    }

    public void setSid(Long sid) {
        this.sid = sid;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescrible(String describle) {
        this.describle = describle;
    }

    @Column(name="difficulty",length=10)
    public Integer getDifficulty() {
        return difficulty;
    }

    @Column(name="submit_num",length=10)
    public Integer getSubmitNum() {
        return submitNum;
    }

    @Column(name="ac_num",length=10)
    public Integer getAcNum() {
        return acNum;
    }

    public void setDifficulty(Integer difficulty) {
        this.difficulty = difficulty;
    }

    public void setSubmitNum(Integer submitNum) {
        this.submitNum = submitNum;
    }

    public void setAcNum(Integer acNum) {
        this.acNum = acNum;
    }

    public Subject() {
    }
}
