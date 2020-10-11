package com.lipeng.algorithm.leetcode.array;

import java.util.Arrays;

/**
 * @program: self-practice
 * @description: 给你两个有序整数数组 nums1 和 nums2，请你将 nums2 合并到 nums1 中，
 *               使 nums1 成为一个有序数组。
 * @author: LiPeng
 * @create: 2020-10-02 23:39
 **/
public class Merge {

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        System.arraycopy(nums2, 0, nums1, m, n);
        Arrays.sort(nums1);
    }

    public static void main(String[] args) {
        int[] nums1 = {1,2,3,0,0,0,0};
        int[] nums2 = {2,4,6};
        int m = 3, n = 3;
        System.out.println("合并前：" + Arrays.toString(nums1));
        merge(nums1, m, nums2, n);
        System.out.println("合并后： " + Arrays.toString(nums1));
    }

}
