package com.lr.leetcode.number530;

/**
 * @author liurui
 * @date 2020/1/29 23:11
 * 给定一个所有节点为非负值的二叉搜索树，求树中任意两节点的差的绝对值的最小值。
 * <p>
 * 示例 :
 * <p>
 * 输入:
 * <p>
 * 1
 * \
 * 3
 * /
 * 2
 * <p>
 * 输出:
 * 1
 * <p>
 * 解释:
 * 最小绝对差为1，其中 2 和 1 的差的绝对值为 1（或者 2 和 3）。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/minimum-absolute-difference-in-bst
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Solution {
    int min = Integer.MAX_VALUE;
    TreeNode pre = null;

    /**
     * 中序遍历是有序的，因此绝对值出现最小的时候，肯定是相连的节点。
     * @param root
     * @return
     */
    public int getMinimumDifference(TreeNode root) {
        getMin(root);
        return min;
    }

    private void getMin(TreeNode root){
        if(root == null){
            return;
        }

        getMin(root.left);
        if(pre != null){
            min = Math.min(root.val-pre.val,min);
        }
        pre = root;
        getMin(root.right);
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
