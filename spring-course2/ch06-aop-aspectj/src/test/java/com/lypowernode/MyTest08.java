package com.lypowernode;


import com.lypowernode.ba08.SomeServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest08 {
    @Test
    public  void test(){

        String config ="ba08/applicationContext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);

        SomeServiceImpl service = (SomeServiceImpl) ac.getBean("someSevice");
        // 没接口spring自动使用CJLIB动态代理 :com.lypowernode.ba08.SomeServiceImpl$$EnhancerBySpringCGLIB$$dbc0c586
        System.out.println("动态代理 :" +service.getClass().getName());
        service.doThird();
       // System.out.println(":"+str);

                                                                                                                                                                                                        }
}
