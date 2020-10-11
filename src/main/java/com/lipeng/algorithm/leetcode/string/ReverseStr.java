package com.lipeng.algorithm.leetcode.string;

/**
 * @program: self-practice
 * @description: 给定一个字符串 s 和一个整数 k，你需要对从字符串开头算起的每隔 2k 个字符
 *               的前 k 个字符进行反转。
 * @author: LiPeng
 * @create: 2020-10-03 00:28
 **/
public class ReverseStr {

    //双指针法
    public static String reverseStr(String s, int k) {
        char[] ch = s.toCharArray();
        int len = ch.length;
        for (int i = 0; i < len; i += 2*k){
            int left = i;
            int right = (i + k - 1 < len) ? i + k - 1 : len - 1;
            while (left <= right){
                char temp = ch[left];
                ch[left] = ch[right];
                ch[right] = temp;
                left ++;
                right --;
            }
        }
        String str = new String(ch);
        return str;
    }

    public static void main(String[] args) {
        String s = "abcdefg";
        int k = 2;
        System.out.println(reverseStr(s, k));
    }

}
