package com.lipeng.javase.serializable;

import java.io.*;

/**
 * @program: self-practice
 * @description:
 * @author: LiPeng
 * @create: 2020-09-19 11:01
 **/
public class SerializableTest {

    public static void main(String[] args) throws Exception {
//        serializeFlyPig();
        FlyPig pig = deserializeFlyPig();
        System.out.println(pig.toString());
    }

    /**
     * 序列化
     * @throws Exception
     */
    private static void serializeFlyPig() throws Exception {
        FlyPig flyPig = new FlyPig();
        flyPig.setColor("black");
        flyPig.setName("riemann");
        flyPig.setCar("audi");
        //对象输出流
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(new File("c:/Users/Mac/flypig.txt")));
        oos.writeObject(flyPig);
        System.out.println("FlyPig 对象序列化成功！");
        oos.close();
    }

    /**
     * 反序列化
     * @throws Exception
     */
    private static FlyPig deserializeFlyPig() throws Exception{
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(new File("c:/Users/Mac/flypig.txt")));
        FlyPig pig = (FlyPig) ois.readObject();
        System.out.println("FlyPig 对象反序列化成功！");
        return pig;
    }

}
