package com.lr.leetcode.number083;

/**
 * @author liurui
 * @date 2020/1/24 22:55
 */
public class Solution {

    /**
     *
     * @param head
     * @return
     */
    public ListNode deleteDuplicates(ListNode head) {
        ListNode cur = head;
        while(cur!=null && cur.next != null){
            //如果相等则把当前值给next.next
            if(cur.val == cur.next.val){
                cur.next =  cur.next.next;
            }else{

                cur = cur.next;
            }
        }
        return head;

    }
}
