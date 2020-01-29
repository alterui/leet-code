package com.lr.leetcode.number538;

/**
 * @author liurui
 * @date 2020/1/29 19:24
 * 给定一个二叉搜索树（Binary Search Tree），把它转换成为累加树（Greater Tree)，使得每个节点的值是原来的节点值加上所有大于它的节点值之和。
 *
 * 例如：
 *
 * 输入: 二叉搜索树:
 *               5
 *             /   \
 *            2     13
 *
 * 输出: 转换为累加树:
 *              18
 *             /   \
 *           20     13
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/convert-bst-to-greater-tree
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Solution {
    int sum = 0  ;
    public TreeNode convertBST(TreeNode root) {
        add(root);
        return root;

    }

    private void add(TreeNode root){
        if(root == null){
            return;
        }

        add(root.right);

        //二叉搜索树的根节点比左子树大，比右子树小。因此从最右的右子树开始遍历，然后一次累加。
        root.val += sum;
        sum = root.val;
        add(root.left);
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

