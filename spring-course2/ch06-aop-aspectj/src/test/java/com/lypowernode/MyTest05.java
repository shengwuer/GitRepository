package com.lypowernode;

import com.lypowernode.ba05.SomeService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest05 {
    @Test
    public  void test(){

        String config ="ba05/applicationContext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);

        SomeService service = (SomeService) ac.getBean("someSevice");

        service.doSecond();
       // System.out.println(":"+str);

                                                                                                                                                                                                        }
}
