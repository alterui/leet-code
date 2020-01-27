package com.lr.leetcode.number110;

/**
 * @author liurui
 * @date 2020/1/27 16:45
 * 给定一个二叉树，判断它是否是高度平衡的二叉树。
 * <p>
 * 本题中，一棵高度平衡二叉树定义为：
 * <p>
 * 一个二叉树每个节点 的左右两个子树的高度差的绝对值不超过1。
 * <p>
 * 示例 1:
 * <p>
 * 给定二叉树 [3,9,20,null,null,15,7]
 * <p>
 * 3
 * / \
 * 9  20
 * /  \
 * 15   7
 * 返回 true 。
 * <p>
 * 示例 2:
 * <p>
 * 给定二叉树 [1,2,2,3,3,null,null,4,4]
 * <p>
 * 1
 * / \
 * 2   2
 * / \
 * 3   3
 * / \
 * 4   4
 * 返回 false 。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/balanced-binary-tree
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Solution {
    public boolean isBalanced(TreeNode root) {
        return deep(root) != -1;
    }

    private int deep(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int leftDepth = deep(root.left);
        if (leftDepth == -1) {
            return -1;
        }
        int rightDepth = deep(root.right);
        if (rightDepth == -1) {
            return -1;
        }

        return Math.abs(leftDepth - rightDepth) > 1 ? -1 : Math.max(leftDepth, rightDepth) + 1;

    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}

