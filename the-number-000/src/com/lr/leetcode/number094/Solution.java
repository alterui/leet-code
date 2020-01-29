package com.lr.leetcode.number094;

/**
 * @author liurui
 * @date 2020/1/29 16:51
 */
import java.util.*;
public class Solution {

    /**
     * 非递归的方式。
     * 如果当前节点为空，则弹出，并将弹出节点的right赋值给root。不为空，则入栈。
     * @param root
     * @return
     */
    public List<Integer> inorderTraversal(TreeNode root) {
        if(root == null){
            return new ArrayList<>();
        }

        List<Integer> result = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();

        while(!stack.isEmpty() || root!=null){
            if(root != null){
                stack.push(root);
                root = root.left;
            }else{
                TreeNode node = stack.pop();
                result.add(node.val);
                root = node.right;
            }
        }

        return result;
    }
}
