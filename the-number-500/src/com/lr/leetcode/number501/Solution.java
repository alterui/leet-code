package com.lr.leetcode.number501;

/**
 * @author liurui
 * @date 2020/1/30 10:23
 * <p>
 * 给定一个有相同值的二叉搜索树（BST），找出 BST 中的所有众数（出现频率最高的元素）。
 * <p>
 * 假定 BST 有如下定义：
 * <p>
 * 结点左子树中所含结点的值小于等于当前结点的值
 * 结点右子树中所含结点的值大于等于当前结点的值
 * 左子树和右子树都是二叉搜索树
 * 例如：
 * 给定 BST [1,null,2,2],
 * <p>
 * 1
 * \
 * 2
 * /
 * 2
 * 返回[2].
 * <p>
 * 提示：如果众数超过1个，不需考虑输出顺序
 * <p>
 * 进阶：你可以不使用额外的空间吗？（假设由递归产生的隐式调用栈的开销不被计算在内）
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/find-mode-in-binary-search-tree
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */

import java.util.*;

public class Solution {
    int curNum = 1;
    int maxNum = 1;
    TreeNode pre = null;

    public int[] findMode(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        dfs(root, list);
        int[] result = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }

        return result;
    }

    /**
     * 采用中序遍历，因为正序遍历是有序的
     * @param root
     * @param list
     */
    private void dfs(TreeNode root, List<Integer> list) {
        if (root == null) {
            return;
        }

        dfs(root.left, list);

        //如果前一个节点不为空，且和root相等，表明这个数就会出现两次。
        if (pre != null && pre.val == root.val) {
            curNum++;
        } else {
            curNum = 1;
        }

        //当前数出现的次数比最多的次数还多，那就应该把list集合清空，将现在的众数添加上去。
        if (curNum > maxNum) {
            maxNum = curNum;
            list.clear();
            list.add(root.val);

            //可能有多个众数
        } else if (curNum == maxNum) {
            list.add(root.val);
        }

        //继续移动下面节点
        pre = root;

        dfs(root.right, list);
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

