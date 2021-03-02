package com.lypowernode;

import com.lypowernode.service.impl.SomeServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Date;

public class MyTest {
    @Test
    public void test(){

        // 主动方式
        SomeService service = new SomeServiceImpl();
        service.doSome();

    }

    /*
    * spring在默认创建对象的时间 : 在创建spring的容器时 , 会创建配置文件中的所有的对象.
    * */

    @Test
    public void test01(){
        // 使用spring容器创建的对象
        // 1. 指定spring配置文件的名称
        String config = "applicationContext.xml";
        // 2. 创建表示spring容器的对象 ， AppliacationContext
        // ApplicationContext就是 Spring容器 ， 通过容器获取对象了
        // ClassPathXmlApplicationContext ; 表示从类路径中加载spring的配置文件
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);

        // 从容器中获取某个对象 ，你要调用对象的方法
        // 调用getBean("配置文件的bean的id值");
        SomeService service = (SomeService) ac.getBean("someService" );

        // 使用spring创建好的对象 ， 调用SomeServiceImpl类的方法
        service.doSome();


    }
    @Test
    public void test02(){

        String config = "applicationContext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);
        // 使用spring提供的方法 , 获取容器中定义的对象的数量
        int nums = ac.getBeanDefinitionCount();
        System.out.println("容器中定义的对象数量 : "+nums);
        // 容器中每个定义的对象的名称
        String[] names = ac.getBeanDefinitionNames();
        for(String name :names){
            System.out.println("容器中定义的对象的名称 : "+name);
        }
    }

    @Test
    public void test03(){
        // 获取一个非自定义的类对象
        String config = "applicationContext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);
        Date myDate = (Date) ac.getBean("myDate");
        System.out.println("系统当前的时间 :　"+myDate);
    }
}

