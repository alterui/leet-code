package com.lr.leetcode.number671;

/**
 * @author liurui
 * @date 2020/1/28 22:31
 *
 * 给定一个非空特殊的二叉树，每个节点都是正数，并且每个节点的子节点数量只能为 2 或 0。如果一个节点有两个子节点的话，那么这个节点的值不大于它的子节点的值。 
 *
 * 给出这样的一个二叉树，你需要输出所有节点中的第二小的值。如果第二小的值不存在的话，输出 -1 。
 *
 * 示例 1:
 *
 * 输入:
 *     2
 *    / \
 *   2   5
 *      / \
 *     5   7
 *
 * 输出: 5
 * 说明: 最小的值是 2 ，第二小的值是 5 。
 * 示例 2:
 *
 * 输入:
 *     2
 *    / \
 *   2   2
 *
 * 输出: -1
 * 说明: 最小的值是 2, 但是不存在第二小的值。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/second-minimum-node-in-a-binary-tree
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Solution {
    public int findSecondMinimumValue(TreeNode root) {
        if(root == null){
            return -1;
        }

        //没有孩子的话，肯定没有第二小的值
        if(root.left == null && root.right == null){
            return -1;
        }

        int leftVal = root.left.val;
        int rightVal = root.right.val;

        //如果孩子节点和父节点的值相等，则看孩子节点有没有孩子几点，如果没有就说明没有第二小的值。
        if(root.val == leftVal){
            leftVal = findSecondMinimumValue(root.left);
        }

        if(root.val == rightVal){
            rightVal = findSecondMinimumValue(root.right);
        }

        //子节点都有各自的子节点，那第二小的值肯定是这两个中间最小的值。
        if(leftVal != -1 &&rightVal != -1){
            return Math.min(leftVal,rightVal);
        }

        if(leftVal != -1){
            return leftVal;
        }

        // 不存在或者rightVal != -1
        return rightVal;


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

