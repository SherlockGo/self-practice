package com.lipeng.algorithm.leetcode.string;

/**
 * @program: self-practice
 * @description: 给定一个单词，你需要判断单词的大写使用是否正确。leetcode 520
 * @author: LiPeng
 * @create: 2020-09-21 20:07
 **/
public class DetectCapitalUse {

    public static boolean detectCapitalUse(String word) {
        char[] chars = word.toCharArray();
        int length = word.length();
        char first = chars[0];
        String substring = word.substring(1, length);
        if (Character.isUpperCase(first)){
            if (substring.toUpperCase().equals(substring) ||
                substring.toLowerCase().equals(substring)){
                return true;
            } else {
                return false;
            }
        } else {
            if (substring.toLowerCase().equals(substring)){
                return true;
            } else {
                return false;
            }
        }

    }

    public static void main(String[] args) {
        String s = "ddddd";
        System.out.println(detectCapitalUse(s));
    }

}
