package com.lr.leetcode.number653;

/**
 * @author liurui
 * @date 2020/1/29 22:51
 *
 * 给定一个二叉搜索树和一个目标结果，如果 BST 中存在两个元素且它们的和等于给定的目标结果，则返回 true。
 *
 * 案例 1:
 *
 * 输入:
 *     5
 *    / \
 *   3   6
 *  / \   \
 * 2   4   7
 *
 * Target = 9
 *
 * 输出: True
 *  
 *
 * 案例 2:
 *
 * 输入:
 *     5
 *    / \
 *   3   6
 *  / \   \
 * 2   4   7
 *
 * Target = 28
 *
 * 输出: False
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/two-sum-iv-input-is-a-bst
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */

import java.util.*;
public class Solution {

    /**
     * 使用非递归的方式将二叉搜索树进行中序排序放到list中，list为有序集合。
     * 然后使用双指针的进行遍历
     * @param root
     * @param k
     * @return
     */
    public boolean findTarget(TreeNode root, int k) {
        if(root==null){
            return false;
        }

        List<Integer> list = new ArrayList<>();

        dfs(root,list);

        int i = 0 ;
        int j = list.size()-1;

        while(i<j){
            if(list.get(i)+ list.get(j)== k){
                return true;
            }else if(list.get(i)+ list.get(j)< k){
                i++;
            }else{
                j--;
            }
        }
        return false;

    }

    //中序遍历的值是有序的
    private void dfs(TreeNode root,List<Integer> list){
        Stack<TreeNode> stack = new Stack<>();
        while(root != null || !stack.isEmpty()){
            if(root != null){
                stack.push(root);
                root = root.left;
            }else{
                root =   stack.pop();
                list.add(root.val);
                root = root.right;
            }
        }
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