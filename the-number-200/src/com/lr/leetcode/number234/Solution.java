package com.lr.leetcode.number234;

/**
 * @author liurui
 * @date 2020/1/26 23:05
 */
public class Solution {

    public static void main(String[] args) {
        ListNode listNode = new ListNode(1);
        listNode.next =  new ListNode(2);
        listNode.next.next =  new ListNode(3);
        listNode.next.next.next =  new ListNode(4);
        listNode.next.next.next.next =  new ListNode(5);
        listNode.next.next.next.next.next =  new ListNode(6);
        listNode.next.next.next.next.next.next =  new ListNode(7);
        new  Solution().isPalindrome(listNode);
    }
    public boolean isPalindrome(ListNode head) {
        // 要实现 O(n) 的时间复杂度和 O(1) 的空间复杂度，需要翻转后半部分
        if (head == null || head.next == null) {
            return true;
        }
        ListNode fast = head;
        ListNode slow = head;
        // 根据快慢指针，找到链表的中点
        while(fast.next != null && fast.next.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        slow = reverse(slow.next);
        while(slow != null) {
            if (head.val != slow.val) {
                return false;
            }
            head = head.next;
            slow = slow.next;
        }
        return true;
    }

    private ListNode reverse(ListNode head){

        ListNode res = null;

        while(head!= null){
            ListNode tempNext = head.next;
            head.next = res;
            res = head;
            head = tempNext;
        }
        return res;
    }
}
