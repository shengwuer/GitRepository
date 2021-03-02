package com.lypowernode.ba02;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest02 {
   @Test
    public void test01(){

        // 无参构造方法的使用创建对象
        Student student = new Student();
        student.setName("lisi");
        student.setAge(20);

        School school = new School();
        school.setName("耒阳第一中学");
        school.setAddress("梅桥");
        student.setSchool(school);

        System.out.println("School的值 : "+school);
        System.out.println("Student的值 : "+student);


    }
    // spring创建构造方法
    @Test
    public void test02(){

        String config = "ba02/applicationContext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);
        // 从容器中获取Student对象
        Student student = (Student) ac.getBean("myStudent");
        System.out.println("student对象="+student);


    }

}
