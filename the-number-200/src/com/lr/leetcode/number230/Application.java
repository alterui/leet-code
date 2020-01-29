package com.lr.leetcode.number230;

import java.util.LinkedList;

/**
 * @author liurui
 * @date 2020/1/29 18:46
 */

import java.util.*;
public class Application {
    /**
     * 使用非递归并行取值，第k次取到的值就是第k小的值。
     * @param root
     * @param k
     * @return
     */
    public int kthSmallest(TreeNode root, int k) {
        Stack<TreeNode> stack = new Stack<>();

        while(true){
            if(root!=null){
                stack.push(root);
                root = root.left;
            }else{
                root = stack.pop();
                if(--k==0){
                    return root.val;
                }
                root = root.right;
            }
        }
    }
}
