package com.lypowernode.ba01;

import java.util.Locale;

public class Student {
    private String name;
    private String mail;
    private int age;

    public Student() {
    }

    public void setEmail(String email){

        System.out.println("setEmail()="+email);


    }

    public void setMail(String mail){

        System.out.println("setMail()="+mail);

       // 注释了赋值结果就会为空
       // this.mail = mail;

    }

    /*
       Bean property 'name' is not writable or has an invalid setter method
       */
    public void setName(String name) {

        System.out.println("调用setName()方法 : "+name);
       this.name = name.toUpperCase(Locale.ROOT);
    }

    public void setAge(int age) {

        System.out.println("调用setAge()方法 : "+age);
       this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", mail='" + mail + '\'' +
                ", age=" + age +
                '}';
    }
}
