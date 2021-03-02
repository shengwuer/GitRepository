package com.lypowernode.ba08;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
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
    *       4. 方法没有参数, 如果有参数就是 : Joinpooint
    * */

    /*
    * @AfterThrowing: 异常通知注解
    *   属性 : 1. value ,是切入点表达式 .
    *   位置 : 在方法定义的上面
    * 特点 :
    *   1. 总是会被执行
    *   2. 在目标方法之后执行的
    *
    * 最终通知类似于 :
    *      try{
    *            doThird(..)
    * }catch(Exception ex){
    *
    * }finally{
    *            myAfter()
    * }
    * */

    @After(value = "myPointcut()")
    public void myAfter() {
        System.out.println("最终执行通知 , 总是会被执行的代码 ");
        // 一般做资源清除工作的
    }
    @Before(value = "myPointcut()")
    public void myBefore() {
        System.out.println("最终执行通知 , 总是会被执行的代码 ");
        // 一般做资源清除工作的
    }
    @Pointcut(value = "execution(public * doThird(..))")
    private void myPointcut(){
        //无须代码 , 因为不是功能的 , 只是一个别名

    }

}


