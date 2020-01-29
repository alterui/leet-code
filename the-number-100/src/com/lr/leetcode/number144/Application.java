package com.lr.leetcode.number144;

/**
 * @author liurui
 * @date 2020/1/29 14:51
 * 给定一个二叉树，返回它的 前序 遍历。
 *
 *  示例:
 *
 * 输入: [1,null,2,3]
 *    1
 *     \
 *      2
 *     /
 *    3
 *
 * 输出: [1,2,3]
 * 进阶: 递归算法很简单，你可以通过迭代算法完成吗？
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/binary-tree-preorder-traversal
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
import java.util.*;
public class Application {
    /**
     * 递归方式，比较简单
     * @param root
     * @return
     */
    public List<Integer> preorderTraversal(TreeNode root) {

        List<Integer> list = new ArrayList<>();
        dfs(root,list);
        return list;
    }

    private void dfs(TreeNode root,List<Integer> list){
        if(root == null){
            return;
        }

        /**
         * 根据前序遍历的方式来就可以了
         */
        list.add(root.val);
        dfs(root.left,list);
        dfs(root.right,list);
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

