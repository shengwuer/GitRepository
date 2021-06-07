package com.shengwutests.serializabletest;

import java.io.*;

/**
 *  TODO : SerializableTest
 * 
 * @Created   : by 湖南爱豆  
 * @Date      ： 2021/4/9 14:59
 * @Author    : 谢迪 
 */

public class SerializableTest {
    public static void main(String[] args) throws Exception {
//        serializeFlyPig();
        FlyPig flyPig = deserializeFlyPig();
        System.out.println(flyPig.toString());

    }

    /**
     * 序列化
     */
    private static void serializeFlyPig() throws IOException {
        FlyPig flyPig = new FlyPig();
        flyPig.setColor("black");
        flyPig.setName("naruto");
        flyPig.setCar("0000");
        // ObjectOutputStream 对象输出流，将 flyPig 对象存储到D盘的 flyPig.txt 文件中，完成对 flyPig 对象的序列化操作
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(new File("d:/flyPig.txt")));
        oos.writeObject(flyPig);
        System.out.println("FlyPig 对象序列化成功！");
        oos.close();
    }

    /**
     * 反序列化
     */
    private static FlyPig deserializeFlyPig() throws Exception {
        // ObjectInputStream代表对象输入流：
        //它的readObject()方法从一个源输入流中读取字节序列，再把它们反序列化为一个对象，并将其返回。
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(new File("d:/flyPig.txt")));
        FlyPig person = (FlyPig) ois.readObject();
        System.out.println("FlyPig 对象反序列化成功！");
        return person;
    }
}