package com.lr.leetcode.number513;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author liurui
 * @date 2020/1/28 23:30
 *
 * 给定一个二叉树，在树的最后一行找到最左边的值。
 *
 * 示例 1:
 *
 * 输入:
 *
 *     2
 *    / \
 *   1   3
 *
 * 输出:
 * 1
 *  
 *
 * 示例 2:
 *
 * 输入:
 *
 *         1
 *        / \
 *       2   3
 *      /   / \
 *     4   5   6
 *        /
 *       7
 *
 * 输出:
 * 7
 *  
 *
 * 注意: 您可以假设树（即给定的根节点）不为 NULL。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/find-bottom-left-tree-value
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Solution {
    public static void main(String[] args) {
        TreeNode node = new TreeNode(1);
        node.left = new TreeNode(2);
        node.right = new TreeNode(3);
        new Solution().findBottomLeftValue(node);
    }
    /**
     * queue先进先出，先把right节点弹出，
     * @param root
     * @return
     */
    public int findBottomLeftValue(TreeNode root) {

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            //从右往左依次弹出，因此最后一次弹出的值就是最左面的值
            root = queue.poll();


            //先放右边，再放左面
            if(root.right != null){
                queue.add(root.right);
            }

            if(root.left != null){
                queue.add(root.left);
            }

        }
        return root.val;
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


