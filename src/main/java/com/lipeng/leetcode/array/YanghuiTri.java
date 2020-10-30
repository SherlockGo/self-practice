package com.lipeng.algorithm.leetcode.array;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: self-practice
 * @description:
 * @author: LiPeng
 * @create: 2020-10-08 00:34
 **/
public class YanghuiTri {

    public static List<List<Integer>> generate(int numRows) {
        //首先生成整个triangle列表
        List<List<Integer>> triangle = new ArrayList<>();

        //第一种情况：如果numRows等于0，则返回0行
        if (numRows == 0){
            return triangle;
        }

        //第二种情况：第一行总是[1]
        triangle.add(new ArrayList<>());
        triangle.get(0).add(1);

        //外层循环：添加行
        for (int rowNum = 1; rowNum < numRows; rowNum++){
            List<Integer> row = new ArrayList<>();
            List<Integer> prevRow = triangle.get(rowNum - 1);
            //每一行第一个元素总是1
            row.add(1);
            //内层循环：添加列
            for (int j = 1; j < rowNum; j++){
                row.add(prevRow.get(j-1) + prevRow.get(j));
            }
            //每一行最后一个元素总是1
            row.add(1);
            triangle.add(row);
        }
        return triangle;
    }

    public static void main(String[] args) {
        List<List<Integer>> list = generate(5);
        for (int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }
    }

}
