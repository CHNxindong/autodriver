package com.ai.autodriver.entity;

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
    private Integer userId;
    private String username;
    private String password;
    private String tag1;
    private Double tag1Rate;
    private String tag2;
    private Double tag2Rate;
    private String tag3;
    private Double tag3Rate;
    private Integer uploadNum;
    private Integer tagNum;
    private Integer listenNum;
    private String sex;
    private String age;
    private String telephone;
    private String signature;
    private String img;

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="user_id",length=10)
    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    @Column(name="username",length=500)
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Column(name="password",length=500)
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Column(name="tag1",length=500)
    public String getTag1() {
        return tag1;
    }

    public void setTag1(String tag1) {
        this.tag1 = tag1;
    }

    @Column(name="tag1_rate",length=10)
    public Double getTag1Rate() {
        return tag1Rate;
    }

    public void setTag1Rate(Double tag1Rate) {
        this.tag1Rate = tag1Rate;
    }

    @Column(name="tag2",length=500)
    public String getTag2() {
        return tag2;
    }

    public void setTag2(String tag2) {
        this.tag2 = tag2;
    }

    @Column(name="tag2_rate",length=10)
    public Double getTag2Rate() {
        return tag2Rate;
    }

    public void setTag2Rate(Double tag2Rate) {
        this.tag2Rate = tag2Rate;
    }

    @Column(name="tag3",length=500)
    public String getTag3() {
        return tag3;
    }

    public void setTag3(String tag3) {
        this.tag3 = tag3;
    }

    @Column(name="tag3_rate",length=10)
    public Double getTag3Rate() {
        return tag3Rate;
    }

    public void setTag3Rate(Double tag3Rate) {
        this.tag3Rate = tag3Rate;
    }

    @Column(name="upload_num",length=10)
    public Integer getUploadNum() {
        return uploadNum;
    }

    public void setUploadNum(Integer uploadNum) {
        this.uploadNum = uploadNum;
    }

    @Column(name="tag_num",length=10)
    public Integer getTagNum() {
        return tagNum;
    }

    public void setTagNum(Integer tagNum) {
        this.tagNum = tagNum;
    }

    @Column(name="listen_num",length=10)
    public Integer getListenNum() {
        return listenNum;
    }

    public void setListenNum(Integer listenNum) {
        this.listenNum = listenNum;
    }

    @Column(name="sex",length=500)
    public String getSex() {
        return sex;
    }
    public void setSex(String sex) {
        this.sex = sex;
    }

    @Column(name="age",length=500)
    public String getAge() {
        return age;
    }
    public void setAge(String age) {
        this.age = age;
    }

    @Column(name="telephone",length=500)
    public String getTelephone() {
        return telephone;
    }
    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    @Column(name="signature",length=500)
    public String getSignature() {
        return signature;
    }
    public void setSignature(String signature) {
        this.signature = signature;
    }

    @Column(name="img",length=500)
    public String getImg() {
        return img;
    }
    public void setImg(String img) {
        this.img = img;
    }

    public User() {

    }

}
