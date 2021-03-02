package com.lypowernode.ba02;

import java.util.Locale;

public class Student {
    private String name;
    private int age;
    private School school;

    public Student() {

    }

    /*
       Bean property 'name' is not writable or has an invalid setter method
       */
    public void setName(String name) {

        System.out.println("调用setName()方法 : "+name);
       this.name = name.toUpperCase(Locale.ROOT);
        System.out.println("name=========================================================");
        System.out.println();
    }

    public void setAge(int age) {

        System.out.println("调用setAge()方法 : "+age);
        System.out.println("age===============================================================");
        System.out.println();
       this.age = age;
    }

    public void setSchool(School school) {
        System.out.println("调用setSchool()方法 : "+school);
        System.out.println("school1=====================================================================");
        System.out.println();
        this.school = school;
        System.out.println("调用setSchool()方法 : "+school);
        System.out.println("school2========================================================");
        System.out.println();

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
