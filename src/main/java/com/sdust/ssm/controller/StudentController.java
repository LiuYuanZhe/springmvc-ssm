package com.sdust.ssm.controller;

import com.sdust.ssm.po.Student;
import com.sdust.ssm.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;

/**
 * Created by LiuYuanZhe on 17/12/17.
 */
@Controller
@RequestMapping(value = "/student")
public class StudentController {
    @Autowired
    StudentService studentService;

//    测试springmvc是否链接responsebody返回body部分可以直接用postman请求测试
    @RequestMapping(value = "/testConnection",method = {RequestMethod.POST,RequestMethod.GET})
    @ResponseBody
    public String connection(){
        System.out.println("连接成功");
        return "testConnection";
    }

    /**
     * 返回一个modelview来返回mybatis查取的信息
     * @return
     */
    @RequestMapping(value = "/getStudent",method = {RequestMethod.POST,RequestMethod.GET})
    public ModelAndView getStudent(){
        ModelAndView modelAndView = new ModelAndView();
        try {
            Student student = studentService.getStudentById();
            modelAndView.addObject("student",student);
            modelAndView.setViewName("student");
            System.out.println(student.toString());
        }catch (Exception e){
            e.printStackTrace();
        }
        return modelAndView;
    }
}
