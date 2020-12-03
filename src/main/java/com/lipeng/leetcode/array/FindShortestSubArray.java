package com.lipeng.leetcode.array;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
/**
 * @program: self-practice
 * @description: 697. 数组的度
 * @author: LiPeng
 * @create: 2020-11-10 07:10
 **/
public class FindShortestSubArray {

    public int findShortestSubArray(int[] nums) {
        Map<Integer, Integer> left = new HashMap<>(),
            right = new HashMap<>(),
            count = new HashMap<>();

        for (int i = 0; i < nums.length; i++){
            int x = nums[i];
            if (left.get(x) == null){
                left.put(x, i);
            }
            right.put(x, i);
            count.put(x, count.getOrDefault(x, 0) + 1);
        }

        int ans = nums.length;
        int degree = Collections.max(count.values());
        for (int x : count.keySet()){
            if (count.get(x) == degree){
                ans = Math.min(ans, right.get(x) - left.get(x) + 1);
            }
        }
        return ans;
    }
}
