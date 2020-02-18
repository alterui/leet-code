package com.lr.offer.number07;

/**
 * @author liurui
 * @date 2020/2/18 17:16
 * <p>
 * 输入某二叉树的前序遍历和中序遍历的结果，请重建该二叉树。假设输入的前序遍历和中序遍历的结果中都不含重复的数字。
 * <p>
 *  
 * <p>
 * 例如，给出
 * <p>
 * 前序遍历 preorder = [3,9,20,15,7]
 * 中序遍历 inorder = [9,3,15,20,7]
 * 返回如下的二叉树：
 * <p>
 * 3
 * / \
 * 9  20
 * /  \
 * 15   7
 *  
 * <p>
 * 限制：
 * <p>
 * 0 <= 节点个数 <= 5000
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/zhong-jian-er-cha-shu-lcof
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */

import java.util.*;

public class Solution {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < inorder.length; i++) {
            map.put(inorder[i], i);
        }
        return helper(map, preorder, 0, 0, inorder.length - 1);


    }

    private TreeNode helper(Map<Integer, Integer> map, int[] preorder, int rootIndex, int left, int right) {
        if (left > right) {
            return null;
        }
        int rootValue = preorder[rootIndex];
        TreeNode root = new TreeNode(rootValue);
        //去map查中序中的root的值
        int index = map.get(rootValue);

        //中序遍历树 以 index 分成三部分， 左子树 | index | 右子树
        //前序遍历树 rootIndex | 左子树 | 右子树，而index - left的长度就是左子树的长度，因此可以通过这个长度找到右子树的rootIndex
        root.left = helper(map, preorder, rootIndex + 1, left, index - 1);
        root.right = helper(map, preorder, index - left + rootIndex + 1, index + 1, right);
        return root;
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




