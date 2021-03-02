package com.lypowernode.ba01;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import java.util.Date;
/*
* @Aspect : 是aspectj框架中的注解.
*       作用 : 表示当前类是切面类
*       切面类 : 是用来给业务方法增加功能的类 , 在这个类中有切面的功能代码
*       位置 : 在类定义的上面
* */
@Component
@Aspect
public class MyAspect {
    /*
    * 前置通知 :
    *   定义方法 , 方法实现切面功能的
    *   方法定义要求 :
    *       1. 公共的方法public
    *       2. 方法没有返回值
    *       3. 方法名称自定义
    *       4. 方法可以有参数 , 也可以没参数.
    *               如果有参数 , 参数不是自定义的 , 有几个参数类型可以使用.
    * */

    /*
    * @Before : 前置通知注解
    *   属性 : value ,是切入点表达式 , 表示切面功能执行的位置.
    *   位置 : 在方法的上面
    * 特点 :
    *   1. 在目标方法之前先执行的
    *   2. 不会改变目标方法的执行结果
    *   3. 不会影响目标方法的执行
    * */
    @Before(value = "execution(public * *(..))")
    public void MyBefore(){
        // 这就是切面要执行的代码
        System.out.println("前置通知 , 切面功能 : 在方法执行前 输出执行时间 : "+ new Date());
    }
}
