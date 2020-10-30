package com.lipeng.algorithm.leetcode.tree;

/**
 * @program: self-practice
 * @description: 给定一个二叉树，找到最长的路径，这个路径中的每个节点具有相同值。
 *               这条路径可以经过也可以不经过根节点。
 * @author: LiPeng
 * @create: 2020-10-01 11:02
 **/
public class LongestUnivaluePath {

    int ans = 0;
    public int longestUnivaluePath(TreeNode root) {
        helper(root);
        return ans;
    }

    //递归函数：搜索以root为起点的最长同值路径
    // 要么经过左子树，要么经过右子树
    public int helper(TreeNode root){
        if (root == null){
            return 0;
        }
        int maxLength = 0;  //以root为起点的最长同值路径
        int leftLength = helper(root.left);
        int rightLength = helper(root.right);
        //当root是中间点的时候
        if (root.left != null && root.right != null
            && root.val == root.left.val && root.val == root.right.val){
            ans = Math.max(ans, leftLength + rightLength + 2);
        }
        //当root不是中间点的时候，从左右子树中选取最长同值路径
        if (root.left != null && root.left.val == root.val){
            maxLength = leftLength + 1;
        }
        if (root.right != null && root.right.val == root.val){
            maxLength = Math.max(maxLength, rightLength + 1);
        }
        ans = Math.max(ans, maxLength);
        return maxLength;
    }


}
