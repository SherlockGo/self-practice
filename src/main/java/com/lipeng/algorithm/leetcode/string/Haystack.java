package com.lipeng.algorithm.leetcode.string;

/**
 * @program: self-practice
 * @description:给定一个 haystack 字符串和一个 needle 字符串，在 haystack 字符串中找出
 *      needle 字符串出现的第一个位置 (从0开始)。如果不存在，则返回  -1。
 * @author: LiPeng
 * @create: 2020-09-03 21:02
 **/
public class Haystack {

    public int strStr(String haystack, String needle) {
        if ("".equals(needle)){
            return 0;
        }
        int L1 = haystack.length();
        int L2 = needle.length();
        for (int i = 0; i < L1-L2+1; i++){
            if (haystack.substring(i, i+L2).equals(needle)){
                return i;
            }
        }
        return -1;
    }

}
