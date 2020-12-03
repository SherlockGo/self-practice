package com.lipeng.leetcode.array;

/**
 * @author : lipeng
 * @version : 0v1.
 * @description : 724. 寻找数组的中心索引
 * @date : 2020/12/3 20:29
 */
public class PivotIndex {

    public static int pivotIndex(int[] nums){
        int totalSum = 0, leftSum = 0;
        for (int i = 0; i < nums.length; i++){
            totalSum += nums[i];
        }
        for (int j = 0; j < nums.length; j++){
            if (leftSum * 2 == totalSum - nums[j]){
                return j;
            }
            leftSum += nums[j];
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {1,7,3,6,5,6};
        int result = pivotIndex(nums);
        System.out.println(result);

    }


}
