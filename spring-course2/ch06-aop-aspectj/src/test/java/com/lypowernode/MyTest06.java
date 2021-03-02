package com.lypowernode;

import com.lypowernode.ba06.SomeService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest06 {
    @Test
    public  void test(){

        String config ="ba06/applicationContext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);

        SomeService service = (SomeService) ac.getBean("someSevice");

        service.doThird();
       // System.out.println(":"+str);

                                                                                                                                                                                                        }
}
