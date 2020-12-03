package com.lipeng.leetcode.bit_manipulation;

import sun.applet.Main;

import java.util.Arrays;

/**
 * @author : lipeng
 * @version : 0v1.
 * @description : 给定一个非空整数数组，除了某个元素只出现一次以外，其余每个元素均出现两次。找出那个只出现了一次的元素。
 * @date : 2020/11/15 22:19
 */
public class SingleNumber {

    public static int singleNumber(int[] nums) {
        //数组中的全部元素的异或运算结果即为数组中只出现一次的数字
        int single = 0;
        for (int num : nums) {
            single ^= num;
        }
        return single;
    }

    public static void main(String[] args) {
        int[] nums ={2, 2, 1};
        System.out.println(singleNumber(nums));
    }


}
