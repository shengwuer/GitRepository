package com.lypowernode;

import com.lypowernode.domain.SysUser;
import com.lypowernode.service.UserService;
import com.lypowernode.service.impl.UserServiceImpl;
import javafx.application.Application;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.lang.reflect.Constructor;

public class MyApp<user> {
    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserService service = (UserService) ac.getBean("userService");

        // 创建SysUser的对象
        SysUser user = new SysUser();
        //用对象user调用SysUser类的方法赋值
        user.setName("培我");
        user.setAge(32);
        service.addUser(user);

        String name = service.getClass().getName();
        System.out.println("使用的类名 : "+name);
        Constructor<?>[] constructors = service.getClass().getConstructors();
        for (Constructor<?> constructor : constructors){
            System.out.println("使用的构造方法 :　"+constructor);
        }

    }
}
