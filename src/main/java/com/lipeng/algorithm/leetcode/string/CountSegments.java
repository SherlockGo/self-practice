package com.lipeng.algorithm.leetcode.string;

/**
 * @program: self-practice
 * @description: 统计字符串中的单词个数，这里的单词指的是连续的不是空格的字符。
 * @author: LiPeng
 * @create: 2020-09-19 20:34
 **/
public class CountSegments {

    public static int countSegments(String s) {
        String s1 = s.trim();
        if ("".equals(s1)){
            return 0;
        }
        //注意split方法的使用
        String[] split = s1.split("\\s+");
        return split.length;
    }

    public static void main(String[] args) {
        String s = ", , , ,        a, eaefa";
        System.out.println(countSegments(s));
    }

}
