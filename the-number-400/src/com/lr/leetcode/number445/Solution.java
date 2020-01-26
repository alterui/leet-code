package com.lr.leetcode.number445;

import java.util.Stack;

/**
 * @author liurui
 * @date 2020/1/26 20:11
 * <p>
 * 给定两个非空链表来代表两个非负整数。数字最高位位于链表开始位置。它们的每个节点只存储单个数字。将这两数相加会返回一个新的链表。
 * <p>
 *  
 * <p>
 * 你可以假设除了数字 0 之外，这两个数字都不会以零开头。
 * <p>
 * 进阶:
 * <p>
 * 如果输入链表不能修改该如何处理？换句话说，你不能对列表中的节点进行翻转。
 * <p>
 * 示例:
 * <p>
 * 输入: (7 -> 2 -> 4 -> 3) + (5 -> 6 -> 4)
 * 输出: 7 -> 8 -> 0 -> 7
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/add-two-numbers-ii
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Solution {

    /**
     * 用两个栈去盛放链表的数据。
     * stack api    pop and push
     *
     * @param l1
     * @param l2
     * @return
     */
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        Stack<Integer> stack1 = buildStack(l1);
        Stack<Integer> stack2 = buildStack(l2);

        ListNode dummy = new ListNode(0);

        int carry = 0;
        while (!stack1.isEmpty() || !stack2.isEmpty() || carry != 0) {
            int x = stack1.isEmpty() ? 0 : stack1.pop();
            int y = stack2.isEmpty() ? 0 : stack2.pop();

            int num = x + y + carry;
            ListNode node = new ListNode(num % 10);

            node.next = dummy.next;
            dummy.next = node;

            carry = num / 10;

        }

        return dummy.next;
    }

    private Stack<Integer> buildStack(ListNode head) {
        Stack<Integer> stack = new Stack<>();
        while (head != null) {
            stack.push(head.val);
            head = head.next;
        }
        return stack;
    }


}

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}
