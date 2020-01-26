package com.lr.leetcode.number234;

/**
 * @author liurui
 * @date 2020/1/26 20:39
 */
public class Application {

    boolean isPalindrome(ListNode head) {
        ListNode reversed=reverseList(head);
        while (head != null && reversed != null){
            if (head.val != reversed.val){
                return false;
            }
            head=head.next;
            reversed=reversed.next;
        }
        return head == null && reversed == null;
    }

    ListNode reverseList(ListNode node){
        ListNode head=null;
        while (node != null){
            ListNode n=new ListNode(node.val);
            n.next=head;
            head=n;
            node=node.next;
        }
        return head;
    }

}

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}
