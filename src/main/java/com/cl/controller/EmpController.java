package com.cl.controller;

import com.cl.bean.Dept;
import com.cl.bean.Emp;
import com.cl.bean.Msg;
import com.cl.dao.EmpMapper;
import com.cl.service.DeptService;
import com.cl.service.EmpService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
public class EmpController {

    @Autowired
    EmpService empService;
    @Autowired
    DeptService  deptService;




    @RequestMapping("/emps")
    @ResponseBody
    public Msg getEMp(@RequestParam(value = "pn",defaultValue = "1")Integer pn){

        PageHelper.startPage(pn,5);

        List<Emp> emps = empService.getAll();
        PageInfo page=new PageInfo(emps,5);




        return Msg.success().add("pageInfo",page);

    }

    @RequestMapping("/depts")
    @ResponseBody
    public Msg getDept(){
        List<Dept> list = deptService.getAll();


        return Msg.success().add("depts",list);
    }



    @RequestMapping(value = "/emp",method = RequestMethod.POST)
    @ResponseBody
    public Msg Save(Emp emp){
        empService.save(emp);


        return Msg.success();
    }


    @RequestMapping(value = "/check")
    @ResponseBody
    public Msg check(Emp emp){
        empService.save(emp);


        return Msg.success();
    }

    @RequestMapping(value="/emp/{id}",method=RequestMethod.GET)
    @ResponseBody
    public Msg getEmp(@PathVariable("id") Integer id){
        Emp emp = empService.getEmp(id);


        return Msg.success().add("emp",emp);
    }

    @RequestMapping(value="/emp/{id}",method=RequestMethod.PUT)
    @ResponseBody
    public Msg saveEmp(Emp emp){
        System.out.println(emp);
        empService.updateEmp(emp);


        return Msg.success();
    }
    @RequestMapping(value="/emp/{id}",method=RequestMethod.DELETE)
    @ResponseBody
    public Msg delete(@PathVariable("id")String id){
        if(id.contains("-")){
               String[] ids=id.split("-");
            List<Integer> list=new ArrayList<>();
            for(String s:ids){
                list.add(Integer.parseInt(s));
            }
        }else{

            empService.delete(Integer.parseInt(id));

        }


        return Msg.success();
    }



    @RequestMapping("/baba")
    public String  show(@RequestParam(value = "pn",defaultValue = "1")Integer pn, Model model, HttpServletRequest request){
        if(pn<1){
            pn=1;
        }
        PageHelper.startPage(pn,5);

       List<Emp> emps = empService.getAll();
        PageInfo page=new PageInfo(emps,5);

        model.addAttribute("pageInfo",page);
        System.out.println(emps);
        HttpSession session = request.getSession();
        session.setAttribute("baba","baba");


        return "list";

    }

}
