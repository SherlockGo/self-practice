package com.lipeng.algorithm.leetcode.array;

/**
 * @program: self-practice
 * @description: 给定一个排序数组，你需要在 原地 删除重复出现的元素，使得每个元素只出现
 *               一次，返回移除后数组的新长度。
 * @author: LiPeng
 * @create: 2020-09-22 23:50
 **/
public class RemoveDuplicates {

    public static int removeDuplicates(int[] nums) {
        if (nums.length == 0){
            return 0;
        }
        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j];
            }
        }
        return i + 1;
    }

    public static void main(String[] args) {
        int[] nums = {1,1,1,2,2,3,3,4,5,5};
        System.out.println(removeDuplicates(nums));
    }

}
