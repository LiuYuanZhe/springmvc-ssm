package com.sdust.ssm.service.impl;

import com.sdust.ssm.mapper.StudentMapper;
import com.sdust.ssm.po.Student;
import com.sdust.ssm.service.StudentService;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by LiuYuanZhe on 17/12/17.
 */
@Component
public class StudentServiceImpl implements StudentService {
    @Resource
    StudentMapper studentMapper;

    public Student getStudentById() throws Exception {
        Student student = studentMapper.getStudentById();
        return student;
    }

    public List<Student> getAllStudent() throws Exception {
        return studentMapper.getAllStudent();
    }

    public void deleteStudent(int id) throws Exception {
        studentMapper.deleteStudent(id);
    }

    public void addStudent(Student student) throws Exception {
        studentMapper.addStudent(student);
    }
}
