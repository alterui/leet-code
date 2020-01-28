package com.lr.leetcode.number101;

/**
 * @author liurui
 * @date 2020/1/28 11:51
 */
import java.util.*;
public class Solution {
    /**
     * 广度优先分析
     * @param root
     * @return
     */
    public boolean isSymmetric(TreeNode root) {
        if(root == null ){
            return true;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        //一个节点有两个孩子，左孩子和右孩子
        queue.add(root);
        queue.add(root);

        while(!queue.isEmpty()){
            TreeNode t1 = queue.poll();
            TreeNode t2 = queue.poll();

            //表明为null、或者为页节点
            if(t1 == null && t2 == null){
                continue;
            }

            // 一个节点有，一个没有节点，肯定不成立
            if(t1 == null || t2 == null){
                return false;

            }

            if(t1.val != t2.val ){
                return false;
            }

            //按照比较顺序进行放置
            queue.add(t1.left);
            queue.add(t2.right);
            queue.add(t1.right);
            queue.add(t2.left);
        }

        return true;

    }
}
