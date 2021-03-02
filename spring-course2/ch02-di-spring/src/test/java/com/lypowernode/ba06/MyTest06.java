package com.lypowernode.ba06;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest06 {

    // spring创建构造方法
    @Test
    public void test02() {

        String config = "ba06/total.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);

        // 从容器中获取Student对象
        Student student = (Student) ac.getBean("myStudent");
        System.out.println("student对象=" + student);

    }
}
