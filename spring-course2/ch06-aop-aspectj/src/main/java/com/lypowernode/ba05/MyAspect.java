package com.lypowernode.ba05;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

import java.util.Date;
/*
* @Aspect : 是aspectj框架中的注解.
*       作用 : 表示当前类是切面类
*       切面类 : 是用来给业务方法增加功能的类 , 在这个类中有切面的功能代码
*       位置 : 在类定义的上面
* */

@Aspect
public class MyAspect {
    /*
    * 异常通知定义方法, 方法是实现切面功能的
    *   方法定义要求 :
    *       1. 公共的方法public
    *       2. 没有返回值
    *       3. 方法名称自定义
    *       4. 方法有一个参数Exception, 如果还有的参数就是 : Joinpooint
    * */

    /*
    * @AfterThrowing: 异常通知注解
    *   属性 : 1. value ,是切入点表达式 , 表示切面功能执行的位置.
    *         2. throwing 自定义的变量 , 表示目标方法抛出的异常对象
    *            变量名必须和方法的参数名一样
    *   位置 : 在方法定义的上面
    * 特点 :
    *   1. 在目标方法抛出异常时执行
    *   2. 可以做异常的监控程序 , 监控目标方法执行时是不是有异常.
    *       如果有异常 , 可以发送邮件 ,短信进行通知
    *
    *  执行就是 :
    * try{
    *       SomeserviceImpl.doSecond(..)
    * }catch(Exception ex){
    *       myAfterThrowing(ex)
    * }
    * */

    @AfterThrowing(value = "execution(public * doSecond(..))",throwing = "ex")
    public void myAfterThrowing(Exception ex) {
        System.out.println("异常通知 : 方法发生异常时 ,执行" + ex.getMessage());
        // 发送邮件通知开发人员
    }

}


