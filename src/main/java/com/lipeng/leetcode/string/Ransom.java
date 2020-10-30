package com.lipeng.algorithm.leetcode.string;

import sun.security.util.Length;

import java.util.Arrays;

/**
 * @program: self-practice
 * @description: 给定一个赎金信 (ransom) 字符串和一个杂志(magazine)字符串，
 *              判断第一个字符串 ransom 能不能由第二个字符串 magazines 里面的字符构成。
 *              如果可以构成，返回 true ；否则返回 false。
 * @author: LiPeng
 * @create: 2020-09-16 19:56
 **/
public class Ransom {

    public static boolean canConstruct(String ransomNote, String magazine) {
        char[] r = ransomNote.toCharArray();
        char[] m = magazine.toCharArray();
        //排序之后按照ASCII码值递增
        Arrays.sort(r);
        Arrays.sort(m);
        int i = 0, j = 0;
        while(i < r.length && j < m.length){
            if(r[i] > m[j]) j++;
            else if (r[i] < m[j]) return false;
            else { // 一个字母只能用一次，所以当相等时，两个指针都需要移动
                i++;
                j++;
            }
        }
        //直到数组r中的每个元素都被比较过
        return i == r.length;
    }


    public static void main(String[] args) {
        System.out.println(canConstruct("abc", "kldaubuc"));

    }

}
