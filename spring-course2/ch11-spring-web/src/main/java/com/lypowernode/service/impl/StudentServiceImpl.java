package com.lypowernode.service.impl;

import com.lypowernode.dao.StudentDao;
import com.lypowernode.domain.Student;
import com.lypowernode.service.StudentService;

import java.util.List;

public class StudentServiceImpl implements StudentService {
    // addStudent(),queryStudents()两个方法必须访问dao才行 , 所以一定会使用一个引用类型的dao
    // 引用类型
    private StudentDao studentDao;
    // 引用需要注入(赋值)没有注解就需要set方法
    public void setStudentDao(StudentDao studentDao) {
        this.studentDao = studentDao;
    }

    @Override
    public int addStudent(Student student) {
        int nums = studentDao.insertStudent(student);
        return nums;
    }

    @Override
    public List<Student> queryStudents() {
        List<Student> students = studentDao.SelcetStudents();
        return students;
    }
}
