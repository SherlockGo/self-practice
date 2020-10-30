package com.lipeng.algorithm.leetcode.array;

/**
 * @program: self-practice
 * @description: 给定一个整数数组 nums ，找到一个具有最大和的连续子数组（子数组最少包含
 *               一个元素），返回其最大和。
 * @author: LiPeng
 * @create: 2020-09-27 19:52
 **/
public class MaxSubArray {

    /**
     * 动态规划
     * @param nums
     * @return
     */
    public int maxSubArray(int[] nums) {
        int pre = 0, maxAns = nums[0];
        for (int x : nums) {
            pre = Math.max(pre + x, x);
            maxAns = Math.max(maxAns, pre);
        }
        return maxAns;
    }

    public static void main(String[] args) {

    }

}
