package com.lipeng.algorithm.leetcode.string;

/**
 * @program: self-practice
 * @description: 给定一个罗马数字，将其转换成整数。输入确保在 1 到 3999 的范围内。
 * @author: LiPeng
 * @create: 2020-08-30 14:51
 **/
public class RomanToInt {
    public int romanToInt(String s) {
        char[] chars = s.toCharArray();
        int result = 0;

        int preRes = getNum(chars[0]);
        for (int i=1; i<chars.length; i++){
            int res = getNum(chars[i]);
            if (preRes < res){
                result -= preRes;
            } else {
                result += preRes;
            }
            preRes = res;
        }
        result += preRes;
        return result;
    }

    public int getNum(char c){
        switch (c){
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                return 0;
        }
    }

}
