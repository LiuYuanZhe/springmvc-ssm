package com.sdust.ssm.mapper;

import com.sdust.ssm.po.Student;

import java.util.List;

/**
 * Created by LiuYuanZhe on 17/12/17.
 */
/*
因为使用spring-mybatis所以mapper的xml配置文件和class类要放在同一个目录下.
 */
public interface StudentMapper {
    public Student getStudentById() throws Exception;
    public List<Student> getAllStudent() throws Exception;
    public void addStudent(Student student) throws Exception;
    public void deleteStudent(int id) throws Exception;
}
