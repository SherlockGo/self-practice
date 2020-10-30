package com.lipeng.algorithm.leetcode.array;

/**
 * @program: self-practice
 * @description: 给定一个排序数组和一个目标值，在数组中找到目标值，并返回其索引。如果目标值
 *               不存在于数组中，返回它将会被按顺序插入的位置。
 *               你可以假设数组中无重复元素。
 * @author: LiPeng
 * @create: 2020-09-24 22:34
 **/
public class SearchInsert {

    public static int searchInsert(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++){
            if (nums[i] >= target){
                return i;
            }
        }
        if (nums[nums.length - 1] < target){
           return nums.length;
        }
        return 0;
    }

    public static void main(String[] args) {
        int[] nums = {1,3,5,6};
        int target = 0;
        System.out.println(searchInsert(nums, target));
    }

}
