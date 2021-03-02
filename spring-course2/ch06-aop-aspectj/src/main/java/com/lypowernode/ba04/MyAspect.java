package com.lypowernode.ba04;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
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
    * 环绕通知定义方法, 方法是实现切面功能的
    *   方法定义要求 :
    *       1. 公共的方法public
    *       2. 方法必须有一个返回值 , 推荐使用Object
    *       3. 方法名称自定义
    *       4. 方法有参数的, 固定的参数 : ProceedingJoinpooint
    *
    * */

    /*
    * @Around: 环绕通知注解
    *   属性 : 1. value ,是切入点表达式 , 表示切面功能执行的位置.
    *
    *   位置 : 在方法定义的上面
    * 特点 :
    *   1. 他是最强的通知
    *   2. 他在目标方法前后都能增强功能
    *   3. 控制目标方法是否调用执行
    *   4. 修改原来的目标方法的执行结果.  影响最后的调用结果
    *
    *   环绕通知 , 等于jdk动态代理的 , InvocationHandler接口
    *
    *
    *  参数 : ProceedingJoinPoint就等同于  Method
    *         作用 : 执行目标方法的
    *   返回值 : 就是目标方法的执行结果 , 可以被修改.
    *
    *   环绕通知 : 经常做事务 ,在目标方法之前开启事务 ,执行目标方法 , 在目标方法之后提交事务
    * */



    @Around(value = "execution(public * doFirst(..))")
    public Object MyAround(ProceedingJoinPoint pjp) throws Throwable {

        String name="";

        Object [] args = pjp.getArgs();

     // Object arg = args[0];
        name = (String) args[0];

        // 环绕通知
        Object res=null;
        System.out.println("在目标方法之前输出时间 : "+ new Date());

        // 1目标方法调用
        if ("生悟".equals(name)){
            res = pjp.proceed(); // method.inVoke(); Object res =doFirst();
        }else{

        }
        System.out.println("在目标方法之后提交事务 : ");

        res="hello apsectj Aop";
        return res ;

    }
}


