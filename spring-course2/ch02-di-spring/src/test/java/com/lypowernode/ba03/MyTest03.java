package com.lypowernode.ba03;

import com.lypowernode.ba03.School;
import com.lypowernode.ba03.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.File;

public class MyTest03 {
   @Test
    public void test01(){

        // 有参构造方法的使用创建对象
       Student student = new com.lypowernode.ba03.Student();
        student.setName("光亭");
        student.setAge(35);

        School school = new School("耒阳第三中学","蔡子池");
        student.setSchool(school);

        System.out.println("School的值 : "+school);
        System.out.println("Student的值 : "+student);


    }
    // spring创建构造方法
    @Test
    public void test02(){

        String config = "ba03/applicationContext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);
        // 从容器中获取Student对象
        Student student = (Student) ac.getBean("myStudent3");
        System.out.println("student对象="+student);


    } // spring创建构造方法
    @Test
    public void test03(){

        String config = "ba03/applicationContext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);
        // 从容器中获取Student对象
        Student student = (Student) ac.getBean("myStudent3");
        System.out.println("student对象="+student);

         File file = (File) ac.getBean("myFile");
        System.out.println("myFile==========="+file);
        System.out.println("myFile名称==========="+file.getName());

    }

}
