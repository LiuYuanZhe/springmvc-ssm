package com.sdust.ssm.service;

import com.sdust.ssm.po.Student;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by LiuYuanZhe on 17/12/17.
 */
public interface StudentService {
    public Student getStudentById() throws Exception;
    public List<Student> getAllStudent() throws Exception;
    public void deleteStudent(int id) throws Exception;
    public void addStudent(Student student) throws Exception;
}
