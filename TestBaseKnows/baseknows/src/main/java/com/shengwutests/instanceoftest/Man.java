package com.shengwutests.instanceoftest;
    /**
 *  TODO : Person子类
 * 
 * @Created   : by 湖南爱豆  
 * @Date      ： 2021/4/8 17:29
 * @Author    : 谢迪 
 */
public class Man extends Person{

//    　Man.class
        public static void main(String[] args) {
//            测试：注意第一种情况， p1 instanceof Man ，Man 是 Person 的子类，Person 不是 Man 的子类，所以返回结果为 false。
            Person p1 = new Person();
            Person p2 = new Man();
            Man m1 = new Man();
            System.out.print("p1=");
            System.out.println(p1 instanceof Man);//false
            System.out.print("p2=");
            System.out.println(p2 instanceof Man);//true
            System.out.print("p3=");
            System.out.println(m1 instanceof Man);// true
        }
        }
