package com.lr.leetcode.number687;

/**
 * @author liurui
 * @date 2020/1/28 21:11
 * <p>
 * 给定一个二叉树，找到最长的路径，这个路径中的每个节点具有相同值。 这条路径可以经过也可以不经过根节点。
 * <p>
 * 注意：两个节点之间的路径长度由它们之间的边数表示。
 * <p>
 * 示例 1:
 * <p>
 * 输入:
 * <p>
 * 5
 * / \
 * 4   5
 * / \   \
 * 1   1   5
 * 输出:
 * <p>
 * 2
 * 示例 2:
 * <p>
 * 输入:
 * <p>
 * 1
 * / \
 * 4   5
 * / \   \
 * 4   4   5
 * 输出:
 * <p>
 * 2
 * 注意: 给定的二叉树不超过10000个结点。 树的高度不超过1000。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/longest-univalue-path
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Solution {
    int result = 0;

    public int longestUnivaluePath(TreeNode root) {
        getLongest(root);
        return result;
    }

    public int getLongest(TreeNode root) {
        if (root == null) {
            return 0;
        }

        //left子节点获取到的最长的路径长度
        int leftLongest = getLongest(root.left);
        int rightLongest = getLongest(root.right);

        //计算left到root节点的最长路径,这里只是计算的是父节点和左节点之间的长度，因此不存在则返回0;
        int leftPath = root.left != null && root.left.val == root.val ? leftLongest + 1 : 0;
        int rightPath = root.right != null && root.right.val == root.val ? rightLongest + 1 : 0;

        result = Math.max(result, leftPath + rightPath);
        return Math.max(leftPath, rightPath);
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
