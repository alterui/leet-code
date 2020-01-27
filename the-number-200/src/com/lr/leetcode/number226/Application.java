package com.lr.leetcode.number226;

import java.util.LinkedList;
import java.util.List;

/**
 * @author liurui
 * @date 2020/1/27 20:06
 */
public class Application {

    /**
     * 广度优先遍历---->  借用LinkedList api  add  poll
     * @param root
     * @return
     */
    public TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return null;
        }


        LinkedList<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            TreeNode temp = queue.poll();

            TreeNode left = temp.left;

            temp.left = temp.right;
            temp.right = left;

            if (temp.left != null) {
                queue.add(temp.left);
            }

            if (temp.right != null) {
                queue.add(temp.right);
            }
        }

        return root;

    }
}
