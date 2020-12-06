package com.cl.bean;

import org.springframework.stereotype.Component;

@Component
public class Dept {
    private Integer deptid;

    @Override
    public String toString() {
        return "Dept{" +
                "deptid=" + deptid +
                ", deptname='" + deptname + '\'' +
                '}';
    }

    private String deptname;
    public Dept(Integer deptid, String deptname) {
        this.deptid = deptid;
        this.deptname = deptname;
    }

    public Dept() {
        super();
    }

    public Integer getDeptid() {
        return deptid;
    }

    public void setDeptid(Integer deptid) {
        this.deptid = deptid;
    }

    public String getDeptname() {
        return deptname;
    }

    public void setDeptname(String deptname) {
        this.deptname = deptname == null ? null : deptname.trim();
    }
}