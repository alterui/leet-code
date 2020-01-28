package com.lr.leetcode.number637;

/**
 * @author liurui
 * @date 2020/1/28 23:05
 * 给定一个非空二叉树, 返回一个由每层节点平均值组成的数组.
 *
 * 示例 1:
 *
 * 输入:
 *     3
 *    / \
 *   9  20
 *     /  \
 *    15   7
 * 输出: [3, 14.5, 11]
 * 解释:
 * 第0层的平均值是 3,  第1层是 14.5, 第2层是 11. 因此返回 [3, 14.5, 11].
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/average-of-levels-in-binary-tree
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
import java.util.*;
public class Solution {

    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> list = new ArrayList<>();

        //用queue队列，存储node节点，可以使用add()和poll()api
        Queue<TreeNode> queqe = new LinkedList<>();

        //先把root节点放上去
        queqe.add(root);

        while(!queqe.isEmpty()){
            int size = queqe.size();
            double num = 0;

            for(int i = 0;i<size;i++){
                //依次弹出node节点
                TreeNode node =  queqe.poll();
                num += node.val;

                //将孩子节点放进去
                if(node.left!=null){
                    queqe.add(node.left);
                }

                if(node.right != null){
                    queqe.add(node.right);
                }
            }
            list.add(num/size);
        }

        return list;
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

