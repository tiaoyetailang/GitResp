package com.cl.service;

import com.cl.bean.Dept;
import com.cl.dao.DeptMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeptService {

    @Autowired
    DeptMapper deptMapper;

    public List<Dept> getAll(){
      return   deptMapper.selectByExample(null);

    }
}
