package com.lypowernode;

import com.lypowernode.ba02.SomeService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest02 {
    @Test
    public  void test(){

        String config ="ba02/applicationContext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);

       SomeService service = (SomeService) ac.getBean("someSevice");
       // 动态代理生成的名称 : com.sun.proxy.$Proxy8
       System.out.println("动态代理生成的名称 : " +service.getClass().getName());
       service.doSome("shengwu",20);

    }
}
