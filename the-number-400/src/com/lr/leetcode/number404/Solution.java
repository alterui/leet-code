package com.lr.leetcode.number404;

/**
 * @author liurui
 * @date 2020/1/28 17:58
 * <p>
 * 计算给定二叉树的所有左叶子之和。
 * <p>
 * 示例：
 * <p>
 * 3
 * / \
 * 9  20
 * /  \
 * 15   7
 * <p>
 * 在这个二叉树中，有两个左叶子，分别是 9 和 15，所以返回 24
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/sum-of-left-leaves
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Solution {
    int res = 0;

    /**
     * 所有左叶子节点的和
     * @param root
     * @return
     */
    public int sumOfLeftLeaves(TreeNode root) {

        if (root == null) {
            return 0;
        }

        //判断是左节点 +  叶子节点
        if (root.left != null && root.left.left == null && root.left.right == null) {
            res += root.left.val;
        }

        /**
         * 左树和右数都有左子树
         */
        sumOfLeftLeaves(root.left);
        sumOfLeftLeaves(root.right);

        return res;
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
