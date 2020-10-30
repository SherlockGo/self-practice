package com.lipeng.algorithm.leetcode.tree;

/**
 * @program: self-practice
 * @description: 给定两个二叉树，编写一个函数来检验它们是否相同。
 *               如果两个树在结构上相同，并且节点具有相同的值，则认为它们是相同的。
 * @author: LiPeng
 * @create: 2020-09-30 22:52
 **/
public class IsSameTree {

    public static boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null){
            return true;
        } else if (p == null || q == null){
            return false;
        } else if (p.val != q.val){
            return false;
        } else {
            return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
        }
    }

    public static void main(String[] args) {
        TreeNode pl = new TreeNode(2, null, null);
        TreeNode pr = new TreeNode(3, null, null);
        TreeNode p = new TreeNode(1, pl, pr);

        TreeNode ql = new TreeNode(2, null, null);
        TreeNode qr = new TreeNode(3, null, null);
        TreeNode q = new TreeNode(1, ql, qr);

        System.out.println(isSameTree(p, q));

    }

}

class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;

    public TreeNode() {
    }

    public TreeNode(int val) {
        this.val = val;
    }

    public TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
