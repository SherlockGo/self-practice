package com.lipeng.algorithm.leetcode.string;

/**
 * @program: self-practice
 * @description: 给定一个字符串，验证它是否是回文串，只考虑字母和数字字符，可以忽略字母的大小写。
 * @author: LiPeng
 * @create: 2020-09-13 20:33
 **/
public class Palindrome {

    public static boolean isPalindrome(String s) {
        char[] chars = s.toCharArray();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < chars.length; i++){
            if (Character.isLetterOrDigit(chars[i])){
                sb.append(chars[i]);
            }
        }
        System.out.println("sb = " + sb.toString());
        String origin = sb.toString().toLowerCase();
        StringBuilder reverse = sb.reverse();
        String result = reverse.toString().toLowerCase();
        System.out.println("reverse = " + reverse.toString());

        if (origin.equals(result)){
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        String s1 = "race a car";

        boolean palindrome = isPalindrome(s1);
        System.out.println(palindrome);

    }

}
