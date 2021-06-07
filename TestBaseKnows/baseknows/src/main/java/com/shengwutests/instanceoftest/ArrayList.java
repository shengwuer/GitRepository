package com.shengwutests.instanceoftest;

import java.util.AbstractList;
import java.util.List;
import java.util.RandomAccess;

/**
 *  TODO : 测试 instanceof
 * 
 * @Created   : by 湖南爱豆  
 * @Date      ： 2021/4/8 17:17
 * @Author    : 谢迪 
 */
public class ArrayList<E> extends AbstractList<E>  implements List<E>, RandomAccess, Cloneable, java.io.Serializable{
    @Override
    public E get(int index) {
        return null;
    }

    @Override
    public int size() {
        return 0;
    }

    public static void main(String[] args) {

//        ***********instanceof 运算符的 obj 操作数的类型必须是引用类型或空类型; 否则，会发生编译时错误**********


//        boolean result = obj instanceof Class
//                其中 obj 为一个对象，Class 表示一个类或者一个接口，当 obj 为 Class 的对象，或者是其直接或间接子类，或者是其接口的实现类，结果result 都返回 true，否则返回false。
//　　注意：编译器会检查 obj 是否能转换成右边的class类型，如果不能转换则直接报错，如果不能确定类型，则通过编译，具体看运行时定。

//        1、obj 必须为引用类型，不能是基本类型
//        int i = 0;
//        System.out.println(i instanceof Integer);//编译不通过
//        System.out.println(i instanceof Object);//编译不通过
//　　instanceof 运算符只能用作对象的判断。

//       2、obj 为 null 在 JavaSE规范 中对 instanceof 运算符的规定就是：如果 obj 为 null，那么将返回 false。
        System.out.println(null instanceof Object);// false

//        3、obj 为 class 类的实例对象
        Integer integer = new Integer(1);
        System.out.println(integer instanceof Integer); // true

//        4、obj 为 class 接口的实现类
//　　    了解Java 集合的，我们知道集合中有个上层接口 List，其有个典型实现类 ArrayList
        ArrayList arrayList = new ArrayList();
        System.out.println(arrayList instanceof List);//true

        List list = new ArrayList();
        System.out.println(list instanceof ArrayList);//true
    }

}