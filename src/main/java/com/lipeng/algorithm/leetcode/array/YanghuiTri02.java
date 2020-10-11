package com.lipeng.algorithm.leetcode.array;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: self-practice
 * @description: 给定一个非负索引 k，其中 k ≤ 33，返回杨辉三角的第 k 行
 * @author: LiPeng
 * @create: 2020-10-08 01:25
 **/
public class YanghuiTri02 {

    public List<Integer> getRow(int rowIndex) {
        List<Integer> ans = new ArrayList<>();

        if (rowIndex == 0){
            ans.add(1);
            return ans;
        }

        if (rowIndex == 1){
            ans.add(1);
            ans.add(1);
            return ans;
        }

        int x;
        List<Integer> prevRow = getRow(rowIndex - 1);  // 上一行

        for (int i = 0; i <= rowIndex; i++){
            if (i == 0 || i == rowIndex){
                x = 1;
            } else {
                x = prevRow.get(i - 1) + prevRow.get(i);
            }
            ans.add(x);
        }
        return ans;
    }


}
