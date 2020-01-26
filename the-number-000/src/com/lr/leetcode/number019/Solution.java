package com.lr.leetcode.number019;

/**
 * @author liurui
 * @date 2020/1/26 16:53
 */
public class Solution {
    /**
     * 使用快指针和慢指针。
     * 再添加哑节点的基础上，使得两个指针的距离为n+1，画图分析。
     * @param head
     * @param n
     * @return
     */
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(-1);
        dummy.next = head;

        ListNode fast = dummy;
        ListNode slow = dummy;


        while(n-->=0){
            fast = fast.next;
        }


        while(fast!= null){
            slow = slow.next;
            fast = fast.next;
        }

        slow.next = slow.next.next;
        return dummy.next;

    }
}
