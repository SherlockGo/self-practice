package com.lipeng.algorithm.leetcode.array;

import java.util.HashMap;
import java.util.Map;

/**
 * @program: self-practice
 * @description: 给定一个大小为 n 的数组，找到其中的多数元素。多数元素是指在数组中出现次数大于 ⌊ n/2 ⌋ 的元素。
 * @author: LiPeng
 * @create: 2020-10-17 21:34
 **/
public class MajorityElement {

    public static int majorityElement(int[] nums) {
        int len = nums.length;
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < len; i++) {
            if (null == map.get(nums[i])){
                map.put(nums[i], 1);
            } else {
                map.put(nums[i], map.get(nums[i]) + 1);
            }
        }

        int maxCount = 0;
        int res = nums[0];
        for(int i : map.keySet()){
            if (map.get(i) > maxCount){
                maxCount = map.get(i);
                res = i;
            }
        }
        return res;
    }

    public static void main(String[] args) {
//        String s1 = "abc";
//        String s2 = "abc";
//        System.out.println(s1 == s2);
        int nums[] = {2,2,1,1,1,2,2};
        System.out.println(majorityElement(nums));
    }

}
