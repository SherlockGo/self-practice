package com.lipeng.algorithm.leetcode.stack;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * @program: self-practice
 * @description: 给定两个 没有重复元素 的数组 nums1 和 nums2 ，其中nums1 是 nums2 的子集。
 *               找到 nums1 中每个元素在 nums2 中的下一个比其大的值。
 * @author: LiPeng
 * @create: 2020-10-14 20:20
 **/
public class NextGreaterElement {

    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> stack = new Stack<>();
        Map<Integer, Integer> map = new HashMap<>();
        int[] res = new int[nums1.length];

        for (int i = 0; i < nums2.length; i++){
            while (!stack.isEmpty() && nums2[i] > stack.peek()){
                int pop = stack.pop();
                map.put(pop, nums2[i]);
            }
            stack.push(nums2[i]);
        }

        while (!stack.isEmpty()){
            map.put(stack.pop(), -1);
        }

        for (int i = 0; i < nums1.length; i++){
            res[i] = map.get(nums1[i]);
        }

        return res;
    }

}
