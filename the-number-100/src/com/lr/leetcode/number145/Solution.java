package com.lr.leetcode.number145;

import java.util.LinkedList;
import java.util.List;

/**
 * @author liurui
 * @date 2020/1/29 16:01
 * 给定一个二叉树，返回它的 后序 遍历。
 *
 * 示例:
 *
 * 输入: [1,null,2,3]
 *    1
 *     \
 *      2
 *     /
 *    3
 *
 * 输出: [3,2,1]
 * 进阶: 递归算法很简单，你可以通过迭代算法完成吗？
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/binary-tree-postorder-traversal
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
import java.util.*;
public class Solution {
    /**
     * 非递归的后序遍历
     * @param root
     * @return
     */
    public List<Integer> postorderTraversal(TreeNode root) {

        /**
         * 前序遍历的顺序为   root->left->right
         * 后序遍历的顺序为   left->right->root
         * 如果把前序遍历变成 root->right->left  则前序的逆序则为后序遍历，因此可以在前序遍历的基础上修改。
         */
        LinkedList<Integer> result = new LinkedList<>();
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while(!stack.isEmpty()){
            TreeNode node = stack.pop();
            if(node==null){
                continue;
            }
            //addFirst 使得先进后出
            //或者使用Collections.reverse(list)进行逆序。
            result.addFirst(node.val);
            stack.push(node.left);
            stack.push(node.right);

        }

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

