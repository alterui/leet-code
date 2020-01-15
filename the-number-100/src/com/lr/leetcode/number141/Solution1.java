package com.lr.leetcode.number141;

/**
 * @author liurui
 * @date 2020/1/15 11:37
 */
public class Solution1 {
    /**
     * 龟兔赛跑问题：在一个环形跑道上，总会相遇的。
     * 使用双指针去判断。
     * 注意扣边界点。
     * @param head
     * @return
     */
    public boolean hasCycle(ListNode head) {
        if (head == null) {
            return false;
        }
        ListNode p1 = head;
        ListNode p2 = head.next;

        while (p1 != null && p2 != null && p2.next != null) {
            if (p1 == p2) {
                return true;
            }
            p1 = p1.next;
            p2 = p2.next.next;
        }
        return false;
    }
}
