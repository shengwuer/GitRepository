package com.cspowernode;

import com.cspowernode.ba07.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest07 {
    @Test
    public void test01(){
String config="applicationContext.xml";
        ApplicationContext ac=new ClassPathXmlApplicationContext(config);
      Student stu= (Student) ac.getBean("myStudent");
        System.out.println(stu);
    }
}
