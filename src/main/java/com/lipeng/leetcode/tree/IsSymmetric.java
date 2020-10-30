package com.lipeng.algorithm.leetcode.tree;

/**
 * @program: self-practice
 * @description: 给定一个二叉树，检查它是否是镜像对称的。
 * @author: LiPeng
 * @create: 2020-10-01 09:54
 **/
public class IsSymmetric {

    public static boolean isSymmetric(TreeNode root) {
        return isSymmetric(root, root);
    }

    public static boolean isSymmetric(TreeNode a, TreeNode b){
        if (a == null && b == null){
            return true;
        } else if (a == null || b == null){
            return false;
        }
        return a.val == b.val && isSymmetric(a.left, b.right)
                && isSymmetric(a.right, b.left);
    }

    public static void main(String[] args) {
        TreeNode left = new TreeNode(2, null, null);
        TreeNode right = new TreeNode(3, null, null);
        TreeNode root = new TreeNode(1, left, right);
        System.out.println(isSymmetric(root));
    }
}

