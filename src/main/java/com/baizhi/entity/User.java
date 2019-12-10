package com.baizhi.entity;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class User {

    private  String  username;  //接收用户名
    private  String  password;  //接收密码
    private  Integer age;       //接收年龄
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private  Date    birthdate;
    private  Address address;

    public User(String username, String password, Integer age, Date birthdate, Address address) {
        this.username = username;
        this.password = password;
        this.age = age;
        this.birthdate = birthdate;
        this.address = address;
    }

    public User() {
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Date getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", age=" + age +
                ", birthdate=" + birthdate +
                ", address=" + address +
                '}';
    }
}
