package com.lypowernode;

import com.lypowernode.ba07.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mytest07 {

    @Test
    public void test01(){
        String config = "ba07/applicationContext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);

       Student student = (Student) ac.getBean("student");
        System.out.println(student);

    }
}
