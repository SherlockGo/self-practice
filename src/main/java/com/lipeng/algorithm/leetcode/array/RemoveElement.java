package com.lipeng.algorithm.leetcode.array;

/**
 * @program: self-practice
 * @description: 给你一个数组 nums 和一个值 val，你需要 原地 移除所有数值等于 val 的元
 *               素，并返回移除后数组的新长度。
 * @author: LiPeng
 * @create: 2020-09-23 21:06
 **/
public class RemoveElement {

    public static int removeElement(int[] nums, int val) {
        int i = 0;
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != val) {
                nums[i] = nums[j];
                i++;
            }
        }
        return i;
    }


    public static void main(String[] args) {
        int[] nums = {0,1,2,2,3,0,4,2};
        int val = 2;
        System.out.println(removeElement(nums, val));
    }

}
