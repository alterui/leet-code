package com.lr.leetcode.number543;

/**
 * @author liurui
 * @date 2020/1/27 19:35
 * <p>
 * 给定一棵二叉树，你需要计算它的直径长度。一棵二叉树的直径长度是任意两个结点路径长度中的最大值。这条路径可能穿过根结点。
 * <p>
 * 示例 :
 * 给定二叉树
 * <p>
 * 1
 * / \
 * 2   3
 * / \
 * 4   5
 * 返回 3, 它的长度是路径 [4,2,1,3] 或者 [5,2,1,3]。
 * <p>
 * 注意：两结点之间的路径长度是以它们之间边的数目表示。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/diameter-of-binary-tree
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Solution {
    int res = 0;

    //使用递归，然后算left和right和最大值
    public int diameterOfBinaryTree(TreeNode root) {
        deep(root);
        return res;

    }

    private int deep(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int left = deep(root.left);
        int right = deep(root.right);
        res = Math.max(res, left + right);
        return Math.max(left, right) + 1;
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
