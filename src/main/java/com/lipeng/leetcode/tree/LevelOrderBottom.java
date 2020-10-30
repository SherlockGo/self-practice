package com.lipeng.algorithm.leetcode.tree;

import java.util.*;

/**
 * @program: self-practice
 * @description: 给定一个二叉树，返回其节点值自底向上的层次遍历。
 * @author: LiPeng
 * @create: 2020-10-19 20:55
 **/
public class LevelOrderBottom {

    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        if (root == null){
            return new ArrayList<List<Integer>>();
        }

        //用来存放最终结果
        ArrayList<List<Integer>> res = new ArrayList<>();

        //创建一个队列，用来存放某一层的节点
        Queue<TreeNode> queue = new LinkedList<>();
        //首先从第一层开始，把根节点入队
        queue.offer(root);
        //当队列非空时，进行遍历
        while (!queue.isEmpty()){
            //每次遍历的数量为队列的长度
            int size = queue.size();
            //临时数组，用来存放某一层每个节点的值
            ArrayList<Integer> temp = new ArrayList<>();
            //遍历某一层的所有节点，把节点的值加入到临时数组中，并把每个节点的子节点加入队列
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                temp.add(node.val);
                if (node.left != null){
                    queue.offer(node.left);
                }
                if (node.right != null){
                    queue.offer(node.right);
                }
            }
            res.add(temp);
        }
        Collections.reverse(res);
        return res;
    }

    public static void main(String[] args) {
//        ArrayList<List<Integer>> lists = new ArrayList<>();
//        System.out.println(lists);
    }


}
