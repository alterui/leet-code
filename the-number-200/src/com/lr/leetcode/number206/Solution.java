package com.lr.leetcode.number206;

/**
 * @author liurui
 * @date 2020/1/24 15:37
 *
 * 反转一个单链表。
 *
 * 示例:
 *
 * 输入: 1->2->3->4->5->NULL
 * 输出: 5->4->3->2->1->NULL
 */
public class Solution {

    /**
     * 使用双指针叠代
     * 首先申请一个结果返回列表，获取到下一个指针之后，让当前指针指向结果。然后结果链表指向cur，cur指向tempNext.
     * @param head
     * @return
     */
    public ListNode reverseList(ListNode head) {
        ListNode result = null;
        while(head != null){
            ListNode tempNext = head.next;
            head.next = result;
            result= head;
            head = tempNext;
        }

        return result;
    }

}


class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}