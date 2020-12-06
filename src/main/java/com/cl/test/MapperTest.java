package com.cl.test;

import com.cl.bean.Dept;
import com.cl.bean.Emp;
import com.cl.dao.DeptMapper;
import com.cl.dao.EmpMapper;
import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;
import java.util.UUID;

public class MapperTest {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext ioc = new ClassPathXmlApplicationContext("applicationContext.xml");
        EmpMapper bean = ioc.getBean(EmpMapper.class);

        for(int i=0;i<100;i++){
            int a=(int)(Math.random()*3+1);

            String substring = UUID.randomUUID().toString().substring(0, 5);
            bean.insertSelective(new Emp(null,substring,"M","haha",a));

        }
        ioc.close();




    }


}
