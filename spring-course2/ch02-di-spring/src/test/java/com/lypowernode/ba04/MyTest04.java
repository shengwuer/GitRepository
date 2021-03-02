package com.lypowernode.ba04;

import com.lypowernode.ba04.School;
import com.lypowernode.ba04.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.File;

public class MyTest04 {

    // spring创建构造方法
    @Test
    public void test02() {

        String config = "ba04/applicationContext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);
        // 从容器中获取Student对象
        Student student = (Student) ac.getBean("myStudent");
        System.out.println("student对象=" + student);


    }
}
