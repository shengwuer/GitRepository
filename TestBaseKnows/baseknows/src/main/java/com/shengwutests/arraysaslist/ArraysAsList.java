package com.shengwutests.arraysaslist;
import java.util.Arrays;
import java.util.List;

/**
 * TODO : Arrays.AsList
 *
 * @Created : by 湖南爱豆
 * @Date ： 2021/4/25 16:04
 * @Author : 谢迪
 */


/**
 *  　首先，该方法是将数组转化为list。有以下几点需要注意：
 *
 * 　　（1）该方法不适用于基本数据类型（byte,short,int,long,float,double,boolean）
 *
 * 　　（2）该方法将数组与列表链接起来，当更新其中之一时，另一个自动更新
 *
 * 　　（3）不支持add和remove方法
 *
 */
public class ArraysAsList {
    public static void main(String[] args) {
        /**
         * 基本数据类型 char  int  boolean  double  
         */
        char[] a = { 'a', 'b' };
        int[] b = { 1, 23, 6, 9, 36, 68 };
        boolean[] c = { true, false };
        double[] d = { 1.1, 2.3, 5.6, 6.8 };
        System.out.println("char----->" + Arrays.asList(a));
        System.out.println("int---->" + Arrays.asList(b));
        System.out.println("boolean---->" + Arrays.asList(c));
        System.out.println("double---->" + Arrays.asList(d));

        /**
         * 包装数据类型    Character  Integer  Boolean  Double
         */
        Character[] m = { 'a', 'b' };
        Integer[] n = { 1, 23, 6, 9, 36, 68 };
        Boolean[] s = { true, false };
        Double[] t = { 1.1, 2.3, 5.6, 6.8};
        System.out.println("Character----->" + Arrays.asList(m));
        System.out.println("Integer---->" + Arrays.asList(n));
        System.out.println("Boolean---->" + Arrays.asList(s));
        System.out.println("Double---->" + Arrays.asList(t));

        /**
         * 引用数据类型     String  
         */
        String k[] = { "至尊宝", "紫霞仙子", "千年之狐" };
        System.out.println("String---->" + Arrays.asList(k));


        // Arrays.asList() 转换的list 在添加或者删除的时候会报错
//        String k1[] = { "至尊宝", "紫霞仙子", "千年之狐" };
//        List<String> list = Arrays.asList(k1);
//        list.add("ss");     //java.lang.UnsupportedOperationException

    }
}
// 输出结果如下:
//        char----->[[C@59690aa4]
//        int---->[[I@6842775d]
//        boolean---->[[Z@574caa3f]
//        double---->[[D@64cee07]
//        Character----->[a, b]
//        Integer---->[1, 23, 6, 9, 36, 68]
//        Boolean---->[true, false]
//        Double---->[1.1, 2.3, 5.6, 6.8]
//        String---->[至尊宝, 紫霞仙子, 千年之狐]


/**
 * 总结:
 *          此集合是根据k[]获得的，长度已经固定，不能改变；
 *         在使用Arrays.asList()后调用add，remove这些method时出现  java.lang.UnsupportedOperationException异常。
 *         这是由于Arrays.asList() 返回java.util.Arrays.ArrayList， 而不是java.util.ArrayList。
 *         Arrays.ArrayList和util.ArrayList都是继承AbstractList，
 *         remove，add等 method在AbstractList中是默认throw UnsupportedOperationException而且不作任何操作。
 *         util.ArrayList override这些method来对list进行操作，但是Arrays.ArrayList没有override remove()，add()等，
 *         所以throw UnsupportedOperationException
 */