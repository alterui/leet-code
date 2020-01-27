package com.lr.leetcode.number437;

/**
 * @author liurui
 * @date 2020/1/27 22:34
 * 给定一个二叉树，它的每个结点都存放着一个整数值。
 *
 * 找出路径和等于给定数值的路径总数。
 *
 * 路径不需要从根节点开始，也不需要在叶子节点结束，但是路径方向必须是向下的（只能从父节点到子节点）。
 *
 * 二叉树不超过1000个节点，且节点数值范围是 [-1000000,1000000] 的整数。
 *
 * 示例：
 *
 * root = [10,5,-3,3,2,null,11,3,-2,null,1], sum = 8
 *
 *       10
 *      /  \
 *     5   -3
 *    / \    \
 *   3   2   11
 *  / \   \
 * 3  -2   1
 *
 * 返回 3。和等于 8 的路径有:
 *
 * 1.  5 -> 3
 * 2.  5 -> 2 -> 1
 * 3.  -3 -> 11
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/path-sum-iii
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Solution {

    public int pathSum(TreeNode root, int sum) {
        if(root == null){
            return 0;
        }
        // root + left+ right
        return getSum(root,sum)  + pathSum(root.left, sum) + pathSum(root.right, sum);
    }

    //root
    public int getSum(TreeNode root, int sum){
        if(root == null){
            return 0;
        }
        int result = 0;
        if(root.val == sum){
            result++;
        }

        result += getSum(root.left,sum-root.val) + getSum(root.right,sum-root.val);
        return result;
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

