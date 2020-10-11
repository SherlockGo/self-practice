package com.lipeng.algorithm.leetcode.string;

/**
 * @program: self-practice
 * @description: 给定一个仅包含大小写字母和空格 ' ' 的字符串 s，返回其最后一个单词的长度。
 * @author: LiPeng
 * @create: 2020-09-09 20:11
 **/
public class LengthOfLastWord {

    public static int lengthOfLastWord(String s) {
        String s1 = s.trim();
        int len = s1.length();
        if (len == 0 || s1.trim().isEmpty()){
            return 0;
        }
        int result = 0;
        for (int i = len - 1; i >= 0; i--){
            char c = s1.charAt(i);
            if (c != 32){
                result ++;
            } else {
                break;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        String s = "b ";
        int i = lengthOfLastWord(s);
        System.out.println(i);
    }

}
