package com.lipeng.algorithm.leetcode.array;

import java.util.HashMap;
import java.util.Map;

/**
 * @program: self-practice
 * @description: 给定一个整数数组，判断是否存在重复元素。
 * @author: LiPeng
 * @create: 2020-10-17 22:25
 **/
public class ContainsDuplicate {

    public static boolean containsDuplicate(int[] nums) {
        int len = nums.length;
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < len; i++) {
            int key = nums[i];
            if (null == map.get(key)){
                map.put(key, 1);
            } else {
                map.put(key, map.get(key) + 1);
            }
        }

        for (int count : map.values()){
            if (count > 1){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5};
        System.out.println(containsDuplicate(nums));
    }

}
