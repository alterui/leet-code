package com.lr.leetcode.number024;

/**
 * @author liurui
 * @date 2020/1/26 19:25
 */
public class Application {
    //需要一个哑节点，这样便于交换
    public ListNode swapPairs(ListNode head) {

        //需要一个哑节点
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode res = dummy;

        while(head != null && head.next != null){

            //swap
            dummy.next = head.next;
            head.next = head.next.next;
            dummy.next.next = head;

            //move pointer
            dummy = head;
            head = head.next;


        }
        return res.next;
    }
}
