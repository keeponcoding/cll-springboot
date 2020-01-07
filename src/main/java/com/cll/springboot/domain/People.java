package com.cll.springboot.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.Date;

/**
 * @ClassName People
 * @Description TODO
 * @Author cll
 * @Date 2020-01-06 20:30
 * @Version 1.0
 **/
public class People {

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL) // 如果该数据为空不展示
    private Integer age;

    @JsonIgnore // 不做展示
    private String password;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss") // 格式化
    private Date birthday;

    public People() {
    }

    public People(String name, Integer age, String password, Date birthday) {
        this.name = name;
        this.age = age;
        this.password = password;
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "People{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", password='" + password + '\'' +
                ", birthday=" + birthday +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }
}
