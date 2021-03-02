package com.lypowernode.ba03;

public class SomeServiceImpl implements SomeService {


    @Override
    public void doSome(String name, int age) {
        // 给方法增加一个功能 ,在方法执行前增加时间
         System.out.println("========目标方法doSome()======");

    }

    @Override
    public String doOther(String name, int age) {
        System.out.println("========目标方法doOther()======");
        return "abcd";
    }

    @Override
    public Student doOther2(String name, int age) {
        Student student = new Student() ;
        student.setName("lisi");
        student.setAge(29);
        return student;
    }
}
