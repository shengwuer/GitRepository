package com.lypowernode.ba03;

import java.util.Locale;

public class Student {
    private String name;
    private int age;

    public Student() {
    }





    /*
       Bean property 'name' is not writable or has an invalid setter method
       */
    public void setName(String name) {


       this.name = name;
    }

    public void setAge(int age) {


       this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
