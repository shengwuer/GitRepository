package com.lypowernode;

import com.lypowernode.ba01.SomeService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest01 {
    @Test
    public  void test(){

        String config ="ba01/applicationContext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);

       SomeService service = (SomeService) ac.getBean("someServiceImpl");
       // 动态代理生成的名称 : com.sun.proxy.$Proxy8
       System.out.println("动态代理生成的名称 : " +service.getClass().getName());
       service.doSome("生悟",20);

    }
}
