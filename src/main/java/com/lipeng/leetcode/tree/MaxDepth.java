package com.lipeng.algorithm.leetcode.tree;

/**
 * @program: self-practice
 * @description: 给定一个二叉树，找出其最大深度。
 * @author: LiPeng
 * @create: 2020-10-19 20:13
 **/
public class MaxDepth {

    public int maxDepth(TreeNode root) {
        if (root == null){
            return 0;
        }
        int leftDepth = maxDepth(root.left);
        int rightDepth = maxDepth(root.right);

        return Math.max(leftDepth, rightDepth) + 1;
    }

}

