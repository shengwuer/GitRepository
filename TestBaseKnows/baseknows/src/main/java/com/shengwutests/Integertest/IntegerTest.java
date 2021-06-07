package com.shengwutests.Integertest;
    /**
 *  TODO : Integer 测试
 * 
 * @Created   : by 湖南爱豆  
 * @Date      ： 2021/4/8 17:55
 * @Author    : 谢迪 
 */
public class IntegerTest {

        public static void main(String[] args) {
//                        分析：
//
//              我们都知道基本类型通过==比较的是他们的值大小，而引用类型比较的是他们的引用地址
//              这里肯定你也会和我有一样的疑问为什么200的时候是false，100的时候是true，
//              应该Integer包装对象都是比较的应该是内存的地址都应该是false才对啊！这里请看源码：
//                        当我们给一个Integer赋予一个int类型的时候会调用Integer的静态方法valueOf
//            由源码我们可以看到Integer的范围是“-128～127”，当i在这个范围内是从IntegerCache中直接获取，
//            当超越这个范围才会new 一个新的Integer对象

//            一个Integer 与 int比较，先将Integer转换成int类型，再做值比较，所以返回的是true。

//            java中还有与Integer类似的是Long，它也有一个缓存，在区间[-128,127]范围内获取缓存的值，而Long与long比较的时候先转换成long类型再做值的比较

//            Double类型，它没有缓存，但是当Double与double比较的时候会先转换成double类型，再做值的比较
            Integer a = new Integer(100);
            Integer b = 100;
            int c = 100;
            Integer d = 100;
            System.out.println("a == b:"+(a == b));// false (都是Integer型 从新new一个地址就不一样了所以是false)
            System.out.println("a == c:"+(a == c));// true (一个Integer 与 int比较，先将Integer转换成int类型，再做值比较，所以返回的是true,因为Integer转换为int就是基础类型,所以a和b比较的是值,不是地址)
            System.out.println("b == c:"+(b == c));// true (一个Integer 与 int比较，先将Integer转换成int类型，再做值比较，所以返回的是true,因为Integer转换为int就是基础类型,所以b和c比较的是值,不是地址)
            System.out.println("b == d:"+(b == d));// true (b和d两个Integer类型一样,值也一样)
            // 默认的hashCode方法是根据对象的地址转换所得到的。
            //  Java如何查看对象的内存地址？Java是使用hashcode来表示对象的内存地址，两个相同的对象的hashcode是相同的，
            //  我们可以使用System.identityHashCode(传输进去的参数是一个对象)打印对象的hashcode值。
            System.out.println("a="+System.identityHashCode(a));// a=380936215
            System.out.println("a="+a);// a=100
            System.out.println("b="+System.identityHashCode(b));//  b=142638629
            System.out.println("b="+b);// b=100
            System.out.println("c="+System.identityHashCode(c));// c=142638629
            System.out.println("c="+c);// c=100
            System.out.println("d="+System.identityHashCode(d));// d=142638629
            System.out.println("d="+d);// d=100

//            分析：
//
//              我们都知道基本类型通过==比较的是他们的值大小，而引用类型比较的是他们的引用地址
//
//              这里肯定你也会和我有一样的疑问为什么200的时候是false，100的时候是true，
//              应该Integer包装对象都是比较的应该是内存的地址都应该是false才对啊！这里请看源码：
//            当我们给一个Integer赋予一个int类型的时候会调用Integer的静态方法valueOf
//            由源码我们可以看到Integer的范围是“-128～127”，当i在这个范围内是从IntegerCache中直接获取，
//            当超越这个范围才会new 一个新的Integer对象

//            一个Integer 与 int比较，先将Integer转换成int类型，再做值比较，所以返回的是true。
//
//            java中还有与Integer类似的是Long，它也有一个缓存，在区间[-128,127]范围内获取缓存的值，而Long与long比较的时候先转换成long类型再做值的比较
//
//            Double类型，它没有缓存，但是当Double与double比较的时候会先转换成double类型，再做值的比较
            Integer a1 = new Integer(200);
            Integer b1 = 200;
            int c1 = 200;
            Integer d1 = 200;
            System.out.println("a1 == b1:"+(a1 == b1));// false (都是Integer型 从新new一个地址就不一样了所以是false)
            System.out.println("a1 == c1:"+(a1 == c1));// true true (一个Integer 与 int比较，先将Integer转换成int类型，再做值比较，所以返回的是true,因为Integer转换为int就是基础类型,所以a1和b1比较的是值,不是地址)
            System.out.println("b1 == c1:"+(b1 == c1));// true (一个Integer 与 int比较，先将Integer转换成int类型，再做值比较，所以返回的是true,因为Integer转换为int就是基础类型,所以b1和c1比较的是值,不是地址)
            System.out.println("b1 == d1:"+(b1 == d1));// false(因为b1值==200大于Integer值得范围所以回自动new一个对象产生地址, d1也是一样, 所以两个的地址都是新new出来, 地址值就不一样了)
            // 默认的hashCode方法是根据对象的地址转换所得到的。
            //  Java如何查看对象的内存地址？Java是使用hashcode来表示对象的内存地址，两个相同的对象的hashcode是相同的，
            //  我们可以使用System.identityHashCode(传输进去的参数是一个对象)打印对象的hashcode值。
            System.out.println("a1="+System.identityHashCode(a1));// a1=707806938
            System.out.println("a1="+a1);// a1=200
            System.out.println("b1="+System.identityHashCode(b1));// b1=705265961
            System.out.println("b1="+b1);// b1=200
            System.out.println("c1="+System.identityHashCode(c1));// c1=428746855
            System.out.println("c1="+c1);// c1=200
            System.out.println("d1="+System.identityHashCode(d1));// d1=317983781
            System.out.println("d1="+d1);// d1=200
        }
}