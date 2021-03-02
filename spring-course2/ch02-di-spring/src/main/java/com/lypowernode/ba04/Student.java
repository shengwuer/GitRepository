package com.lypowernode.ba04;

import java.util.Locale;

public class Student {
    private String name;
    private int age;
    private School school;

    public Student() {

    }

    public Student(String name, int age, School school) {

        this.name = name;
        this.age = age;
        this.school = school;
    }

    /*
           Bean property 'name' is not writable or has an invalid setter method
           */
    public void setName(String name) {

       this.name = name.toUpperCase(Locale.ROOT);

    }

    public void setAge(int age) {

       this.age = age;
    }

    public void setSchool(School school) {
        System.out.println("setSchool : "+school);
        this.school = school;

    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", school=" + school +
                '}';
    }
}
