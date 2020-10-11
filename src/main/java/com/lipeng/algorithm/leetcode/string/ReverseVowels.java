package com.lipeng.algorithm.leetcode.string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @program: self-practice
 * @description: 编写一个函数，以字符串作为输入，反转该字符串中的元音字母。
 * @author: LiPeng
 * @create: 2020-09-15 22:22
 **/
public class ReverseVowels {

    //双指针法
    public static String reverseVowels(String s) {
        char[] chars = s.toCharArray();
        int len = chars.length;
        int i = 0;
        int j = len - 1;
        while (i < j){
            while (i < j && !isVowel(chars[i])){
                i ++;
            }
            while (j >= 0 && !isVowel(chars[j])){
                j --;
            }
            if (i >= j){
                break;
            }
            swap(chars, i, j);
            i ++;
            j --;
        }
        return new String(chars);

    }

    public static void swap(char[] chars, int a, int b){
        char tmp = chars[a];
        chars[a] = chars[b];
        chars[b] = tmp;
    }

    public static boolean isVowel(char c){
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'
                || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U';
    }

    public static void main(String[] args) {
        String s = "leetcode";
        System.out.println(reverseVowels(s));

    }


}
