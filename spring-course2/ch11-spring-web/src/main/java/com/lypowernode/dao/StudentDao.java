package com.lypowernode.dao;

import com.lypowernode.domain.Student;

import java.util.List;

public interface StudentDao {
    int insertStudent(Student student);

    List<Student> SelcetStudents();

}
