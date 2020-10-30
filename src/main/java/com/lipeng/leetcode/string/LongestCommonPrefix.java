package com.lipeng.algorithm.leetcode.string;

/**
 * @program: self-practice
 * @description: 编写一个函数来查找字符串数组中的最长公共前缀。
 * @author: LiPeng
 * @create: 2020-08-30 22:49
 **/
public class LongestCommonPrefix {

    public static String longestCommonPrefix(String[] strs) {
        if (strs.length == 0)
            return "";
        String result = strs[0];
        for (int i = 1; i < strs.length; i++) {
            while (strs[i].indexOf(result) != 0){ //不包含
                result = result.substring(0, result.length() - 1);
                if (result.isEmpty())
                    return "";
            }
        }
        return result;
    }

    public static void main(String[] args) {
        String[] strs = {"flower","flow","flight"};
        System.out.println(longestCommonPrefix(strs));
    }


}
