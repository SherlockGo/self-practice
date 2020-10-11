package com.lipeng.algorithm.leetcode.string;

/**
 * @program: self-practice
 * @description: 根据二叉树创建字符串
 * @author: LiPeng
 * @create: 2020-09-26 23:25
 **/
public class TreeToString {

    /**
     * 递归法
     * @param t
     * @return
     */
    public String tree2str(TreeNode t) {
        if (t == null){
            return "";
        }
        if (t.left == null && t.right == null){
            return t.value + "";
        }
        if (t.right == null){
            return t.value +"("+tree2str(t.left)+")";
        }
        return t.value + "(" + tree2str(t.left) + ")(" + tree2str(t.right) + ")";
    }

}

class TreeNode{
    int value;
    TreeNode left;
    TreeNode right;
    public TreeNode(int x) {
        this.value = x;
    }
}
