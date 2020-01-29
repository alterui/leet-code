package com.lr.leetcode.number144;

/**
 * @author liurui
 * @date 2020/1/29 15:44
 */
import java.util.*;
public class Solution {
    /**
     * 非递归的方式遍历
     * @param root
     * @return
     */
    public List<Integer> preorderTraversal(TreeNode root) {

        List<Integer> result = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);

        while(!stack.isEmpty()){
            TreeNode node = stack.pop();
            if(node == null){
                continue;
            }

            result.add(node.val);
            //先放入right节点，再放入left节点，使用栈可以保证先将左节点先输出
            stack.push(node.right);
            stack.push(node.left);
        }

        return result;
    }
}


