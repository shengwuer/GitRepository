package com.lypowernode;

import com.lypowernode.ba04.SomeService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest04 {
    @Test
    public  void test(){

        String config ="ba04/applicationContext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);

        SomeService service = (SomeService) ac.getBean("someSevice");

        // 通过代理的对象执行方法 ,实现目标方法执行事 , 增强功能
        String str = service.doFirst("生悟",20); // myAround()  doFirst()等于myAround()
        System.out.println(":"+str);

                                                                                                                                                                                                        }
}
