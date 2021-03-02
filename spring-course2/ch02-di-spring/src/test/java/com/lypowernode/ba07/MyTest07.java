package com.lypowernode.ba07;

import com.lypowernode.ba07.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest07 {

    // spring创建构造方法
    @Test
    public void test02() {

        String config = "ba07/total.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);

        // 从容器中获取Student对象
        Student student = (Student) ac.getBean("myStudent");
        System.out.println("student对象=" + student);

    }
}
