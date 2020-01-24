package com.lr.leetcode.number206;

/**
 * @author liurui
 * @date 2020/1/24 16:52
 */
public class Application {
    /**
     * 使用递归的方式
     * @param head
     * @return
     */
    public ListNode reverseList(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }

        ListNode cur =  reverseList(head.next);

        head.next.next = head;
        head.next = null;

        return cur;
    }
}
