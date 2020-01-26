package com.lr.leetcode.number083;

/**
 * @author liurui
 * @date 2020/1/26 15:04
 */
public class Solution1 {
    /**
     * 使用递归的方式调用
     * @param head
     * @return
     */
    public ListNode deleteDuplicates(ListNode head) {
        //找终止条件
        if(head == null || head.next == null){
            return head;
        }

        //返回去重之后的表头
        head.next = deleteDuplicates(head.next);

        //head 和 head.next  是否相等，相等则返回head.next,负责返回head.
        if(head.val == head.next.val){
            head = head.next;
        }

        return head;
    }
}
