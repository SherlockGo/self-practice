package com.lipeng.javase.lambda;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: self-practice
 * @description: Consumer 接口的使用
 * @author: LiPeng
 * @create: 2020-09-19 23:35
 **/
public class Java8Tester2 {
    public static void main(String[] args) {
        List names = new ArrayList();
        names.add("Google");
        names.add("Runoob");
        names.add("Taobao");
        names.add("Baidu");
        names.add("Sina");
        names.forEach(System.out :: println);

    }
}
