package com.lipeng.algorithm.leetcode.string;

/**
 * @program: self-practice
 * @description: 给定一个字符串，你需要反转字符串中每个单词的字符顺序，同时仍保留空格和单词的初始顺序。
 * @author: LiPeng
 * @create: 2020-08-30 14:43
 **/
public class ReverseWords {
    public static String reverseWords(String s) {
        if (!s.contains(" ")){
            return reverseSingleString(s);
        } else {
            String[] strings = s.split(" ");
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < strings.length; i++){
                String s1 = reverseSingleString(strings[i]);
                if (i != strings.length-1){
                    sb.append(s1 + " ");
                } else {
                    sb.append(s1);
                }
            }
            return sb.toString();
        }
    }

    public static String reverseSingleString(String s){
        StringBuffer sb = new StringBuffer(s.length());
        sb.append(s);
        sb.reverse();
        return sb.toString();
    }

    public static void main(String[] args) {
        String s = "She went to travel yesterday";
        String s1 = reverseWords(s);
        System.out.println(s1);
    }
}
