package com.cl.service;

import com.cl.bean.Emp;
import com.cl.bean.EmpExample;
import com.cl.dao.EmpMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpService {

    @Autowired
EmpMapper empMapper;


public List<Emp> getAll(){
    return empMapper.selectByExamplewithDept(null);
}


public void save(Emp emp){
empMapper.insertSelective(emp);

}

public Emp getEmp(Integer id){
    Emp emp = empMapper.selectByPrimaryKey(id);
    return emp;

}
    public void updateEmp(Emp emp){
        empMapper.updateByPrimaryKeySelective(emp);


    }

    public void delete(Integer id) {
          empMapper.deleteByPrimaryKey(id);

    }

    public void deleteall(List<Integer> id) {

        EmpExample empExample = new EmpExample();
        EmpExample.Criteria criteria = empExample.createCriteria();
        criteria.andIdIn(id);
        empMapper.deleteByExample(empExample);


    }
}


