package com.lypowernode.ba02;

public class SomeServiceImpl implements SomeService {


    @Override
    public void doSome(String name, int age) {
        // 给方法增加一个功能 ,在方法执行前增加时间
         System.out.println("========目标方法doSome()======");

    }
}
