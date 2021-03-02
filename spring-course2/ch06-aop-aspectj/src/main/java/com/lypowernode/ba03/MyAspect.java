package com.lypowernode.ba03;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

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
    * 后置通知定义方法, 方法是实现切面功能的
    *   方法定义要求 :
    *       1. 公共的方法public
    *       2. 方法没有返回值
    *       3. 方法名称自定义
    *       4. 方法可以有参数的, 建议使用Object , 参数名自定义
    *
    * */

    /*
    * @AfterReturning : 后置通知注解
    *   属性 : 1. value ,是切入点表达式 , 表示切面功能执行的位置.
    *         2. returning 自定义的变量 , 表示目标方法的返回值的.
    *           自定义变量名必须和通知方法的形参名一样.
    *   位置 : 在方法定义的上面
    * 特点 :
    *   1. 在目标方法之后先执行的
    *   2. 能够获取都目标方法的返回值 ,可以根据这个返回值做不同的处理功能
    *   Object res = doOther();
    *   3. 可以修改这个返回值
    *
    * 后置通知的执行
    * Object res = doOther();
    * MyAfterReturning( res)
    *
    *
    * */

    /*
    * 指定通知方法中的参数 : JoinPoint
    * JoinPoint : 业务方法 ,要加入切面功能的业务方法
    *       作用是 : 可以在通知方法中获取方法执行时的信息 , 例如方法名称 , 方法的实参.
    *       如果你的切面功能中需要用到方法的信息 ,就加入JoinPoint.
    * `     这个JoinPoint参数的值是有框架赋予的 , 必须是第一个位置的参数
    * */

    @AfterReturning(value = "execution(public * doOther(..))",returning = "res")
    public void MyAfterReturning(JoinPoint jp,Object res){
        // Object res是目标方法执行后的返回值 , 可以根据返回值做你的切面功能处理

        System.out.println("方法的标签(定义) : "+jp.getSignature());
        System.out.println("执行的方法名称 : "+jp.getSignature().getName());
        Object [] args= jp.getArgs();
        for (Object arg : args){
            System.out.println("参数 : "+arg);
        }

        if ("abcd".equals(res)){
            //做一些功能
            // 这就是切面要执行的代码

            System.out.println("后置通知 , 切面功能 : 在方法执行前 输出执行时间 : "+ new Date());
        }else{
            System.out.println("提交事务!");


        }



    }
/*    @AfterReturning(value = "execution(public * doOther(..))",returning = "res")
    public void MyAfterReturning2(JoinPoint jp,Object res){
        // Object res是目标方法执行后的返回值 , 可以根据返回值做你的切面功能处理
        System.out.println("后置通知返回的值 : "+res);

            // 这就是切面要执行的代码
            System.out.println("后置通知 , 切面功能 : 在方法执行前 输出执行时间 : "+ new Date());






    }*/
}
