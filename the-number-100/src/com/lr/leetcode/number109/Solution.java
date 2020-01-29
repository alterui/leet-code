package com.lr.leetcode.number109;

/**
 * @author liurui
 * @date 2020/1/29 22:35
 *
 * 给定一个单链表，其中的元素按升序排序，将其转换为高度平衡的二叉搜索树。
 *
 * 本题中，一个高度平衡二叉树是指一个二叉树每个节点 的左右两个子树的高度差的绝对值不超过 1。
 *
 * 示例:
 *
 * 给定的有序链表： [-10, -3, 0, 5, 9],
 *
 * 一个可能的答案是：[0, -3, 9, -10, null, 5], 它可以表示下面这个高度平衡二叉搜索树：
 *
 *       0
 *      / \
 *    -3   9
 *    /   /
 *  -10  5
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/convert-sorted-list-to-binary-search-tree
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Solution {
    /**
     * 递归思想
     * 首先找到链表中点的前一个点，让pre断离链表。min装入root接地。一次进行left和right
     * @param head
     * @return
     */
    public TreeNode sortedListToBST(ListNode head) {

        if(head == null){
            return null;
        }

        if(head.next == null){
            return new TreeNode(head.val);
        }

        ListNode pre =  getPreMid(head);
        ListNode mid = pre.next;
        pre.next = null;
        TreeNode root = new TreeNode(mid.val);
        root.left = sortedListToBST(head);
        root.right = sortedListToBST(mid.next);

        return root;

    }


    /**
     * 找到链表的mid的前面的一个链表。
     * @param head
     * @return
     */
    private ListNode getPreMid(ListNode head){
        ListNode slow = head;
        ListNode pre = head;
        ListNode fast = head;

        while(fast!= null && fast.next!=null){
            pre = slow;
            slow = slow.next;
            fast = fast.next.next;

        }

        return pre;
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
class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}
