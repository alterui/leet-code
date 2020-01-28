package com.lr.leetcode.number101;

/**
 * @author liurui
 * @date 2020/1/13 21:05
 * <p>
 * 给定一个二叉树，检查它是否是镜像对称的。
 * <p>
 * 例如，二叉树 [1,2,2,3,4,4,3] 是对称的。
 * <p>
 * 1
 * / \
 * 2   2
 * / \ / \
 * 3  4 4  3
 * 但是下面这个 [1,2,2,null,3,null,3] 则不是镜像对称的:
 * <p>
 * 1
 * / \
 * 2   2
 * \   \
 * 3    3
 * 说明:
 * <p>
 * 如果你可以运用递归和迭代两种方法解决这个问题，会很加分。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/symmetric-tree
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Application {

    /**
     * 使用深度广度分析
     * @param root
     * @return
     */
    public boolean isSymmetric(TreeNode root) {
        if (root == null) {
            return true;
        }

        /**
         * 左结点和右节点进行比较
         */
        return isSymmetric(root.left, root.right);

    }


    private boolean isSymmetric(TreeNode t1, TreeNode t2) {
        //终止条件。表明左右子树都到头了，且符合对称的条件
        if (t1 == null && t2 == null) {
            return true;
        }

        //表明左右子树深度不同
        if (t1 == null || t2 == null) {
            return false;
        }

        if (t1.val != t2.val) {
            return false;
        }

        //左节点的左子树和右节点的右子树比较，左节点的右子树和右节点的左子树比较
        return isSymmetric(t1.left, t2.right) && isSymmetric(t1.right, t2.left);


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

