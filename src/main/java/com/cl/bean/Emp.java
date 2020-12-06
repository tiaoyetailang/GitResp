package com.cl.bean;

import org.springframework.stereotype.Component;

@Component
public class Emp {
    private Integer id;

    private String name;

    private String gender;

    private String email;

    private Integer did;

    public Emp() {
        super();
    }

    public Emp(Integer id, String name, String gender, String email, Integer did) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.email = email;
        this.did = did;
    }

    private Dept dept;

    @Override
    public String toString() {
        return "Emp{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", email='" + email + '\'' +
                ", did=" + did +
                ", dept=" + dept +
                '}';
    }

    public Dept getDept() {
        return dept;
    }

    public void setDept(Dept dept) {
        this.dept = dept;
    }

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
        this.name = name == null ? null : name.trim();
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender == null ? null : gender.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public Integer getDid() {
        return did;
    }

    public void setDid(Integer did) {
        this.did = did;
    }
}