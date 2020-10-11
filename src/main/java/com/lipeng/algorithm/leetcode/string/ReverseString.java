package com.lipeng.algorithm.leetcode.string;

import java.util.Arrays;

/**
 * @program: self-practice
 * @description: 编写一个函数，其作用是将输入的字符串反转过来。输入字符串以字符数组 char[] 的形式给出。
 * @author: LiPeng
 * @create: 2020-09-14 19:16
 **/
public class ReverseString {

    public static void reverseString(char[] s) {
        int start = 0;
        int end = s.length - 1;
        while (start < end){
            char temp = s[start];
            s[start] = s[end];
            s[end] = temp;
            start ++;
            end --;
        }
    }

    public static void main(String[] args) {
        char[] chars = {'w', 'o', 'r', 'l', 'd'};
        System.out.println("反转前："  + Arrays.toString(chars));
        reverseString(chars);
        System.out.println("反转后："  + Arrays.toString(chars));
    }


}
