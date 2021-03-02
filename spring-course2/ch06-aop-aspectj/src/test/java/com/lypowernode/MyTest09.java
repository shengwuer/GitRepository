package com.lypowernode;


import com.lypowernode.ba09.SomeService;
import com.lypowernode.ba09.SomeServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest09 {
    @Test
    public  void test(){

        String config ="ba09/applicationContext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);

        SomeService service = (SomeService) ac.getBean("someSevice");
        // 使用CJLIB在程序执行时效率高一些 有借口spring会自动使用jdk的动态代理 , 如果有接口想使用CJLIb动态代理要在配置文件中设置为 :<aop:aspectj-autoproxy proxy-target-class="true"/>
        System.out.println("动态代理 :" +service.getClass().getName());
        service.doThird();
       // System.out.println(":"+str);

                                                                                                                                                                                                        }
}
