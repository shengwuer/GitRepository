package com.lypowernode;

import com.lypowernode.ba07.SomeService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest07 {
    @Test
    public  void test(){

        String config ="ba07/applicationContext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);

        SomeService service = (SomeService) ac.getBean("someSevice");
        // jdk的动态代理 :com.sun.proxy.$Proxy12
        System.out.println("jdk的动态代理 :" +service.getClass().getName());
        service.doThird();
       // System.out.println(":"+str);

                                                                                                                                                                                                        }
}
