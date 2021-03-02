package com.lypowernode.ba01;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
public class SomeServiceImpl implements SomeService {


    @Override
    public void doSome(String name, int age) {
        // 给方法增加一个功能 ,在方法执行前增加时间
         System.out.println("========目标方法doSome()======");

    }
}
