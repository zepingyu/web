package com.pojo;

import java.util.Date;

/**
 * Created by yzp on 17-7-31.
 */
public class User {

    private static final long serialVersionUID = 1L;
    private Integer id; // id
    private String name; // name
    private String pwd; // pwd
    private Integer age; // age
    private Date creatTime; // creatTime

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Date getCreatTime() {
        return creatTime;
    }

    public void setCreatTime(Date creatTime) {
        this.creatTime = creatTime;
    }
}

