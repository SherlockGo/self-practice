package com.lipeng.algorithm.leetcode.array;

import java.util.Arrays;

/**
 * @program: self-practice
 * @description: 给定一个已按照升序排列 的有序数组，找到两个数使得它们相加之和等于目标数。
 * @author: LiPeng
 * @create: 2020-10-15 21:56
 **/
public class TwoSum2 {

    public static int[] twoSum(int[] numbers, int target) {
        int[] res = new int[2];
        for (int i = 0; i < numbers.length; i++){
            for(int j = numbers.length - 1; j > i; j--){
                if ( target == numbers[i] + numbers[j]){
                    res[0] = i + 1;
                    res[1] = j + 1;
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] ints = twoSum(nums, target);
        System.out.println(Arrays.toString(ints));
    }

}
