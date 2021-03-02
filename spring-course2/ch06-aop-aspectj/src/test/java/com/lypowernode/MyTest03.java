package com.lypowernode;

import com.lypowernode.ba03.SomeService;
import com.lypowernode.ba03.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest03 {
    @Test
    public  void test(){

        String config ="ba03/applicationContext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);

       SomeService service = (SomeService) ac.getBean("someSevice");
       // 动态代理生成的名称 : com.sun.proxy.$Proxy8
       System.out.println("动态代理生成的名称 : " +service.getClass().getName());

       String str = service.doOther("生悟",20);
        System.out.println(str);

                                                                                                                                                                                                        }
}
