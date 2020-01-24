package com.lr.leetcode.number160;

/**
 * @author liurui
 * @date 2020/1/24 18:14
 */
public class Application {
    /**
     *  使用双指针，若相同的部分为c。则a+C = B+C
     * @param headA
     * @param headB
     * @return
     */
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode p1 = headA;
        ListNode p2 = headB;
        while(p1!=p2){
            p1 = p1 == null ? headB : p1.next;
            p2 = p2 == null ? headA : p2.next;
        }
        return p1;

    }
}
