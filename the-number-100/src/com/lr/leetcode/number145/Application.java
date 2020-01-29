package com.lr.leetcode.number145;

/**
 * @author liurui
 * @date 2020/1/29 16:13
 */

import  java.util.*;
public class Application {
    /**
     * 递归的方法，很简单。
     * @param root
     * @return
     */
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        dfs(root,list);
        return list;
    }

    private void dfs(TreeNode root,List<Integer> list){
        if(root == null){
            return;
        }

        dfs(root.left,list);
        dfs(root.right,list);
        list.add(root.val);
    }
}
