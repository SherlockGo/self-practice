package com.lipeng.algorithm.leetcode.array;

import java.util.Arrays;

/**
 * @program: self-practice
 * @description: 给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值
 *               的那两个整数，并返回他们的数组下标。
 *               你可以假设每种输入只会对应一个答案。但是，数组中同一个元素不能使用两遍。
 * @author: LiPeng
 * @create: 2020-09-19 21:02
 **/
public class TwoSum {

    public static int[] twoSum(int[] nums, int target) {
        int[] res = new int[2];
        for (int i = 0; i < nums.length; i++){
            for (int j = i + 1; j < nums.length; j++){
                if (nums[j] == target - nums[i]){
                    res[0] = i;
                    res[1] = j;
                    return res;
                }
            }
        }
        throw new IllegalArgumentException("无解");
    }

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] result = twoSum(nums, target);
        System.out.println(Arrays.toString(result));
    }

}
