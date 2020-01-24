package com.lr.leetcode.number021;

/**
 * @author liurui
 * @date 2020/1/24 22:00
 *
 * 将两个有序链表合并为一个新的有序链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的。 
 *
 * 示例：
 *
 * 输入：1->2->4, 1->3->4
 * 输出：1->1->2->3->4->4
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/merge-two-sorted-lists
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode p1 = new ListNode(-1);
        ListNode  result =  p1;
        if (l1 == null) return l2;
        if (l2 == null) return l1;

        while(l1!=null && l2 != null){
            if(l1.val<=l2.val){
                p1.next = l1;
                l1 = l1.next;
            }else{
                p1.next = l2;
                l2 = l2.next;
            }
            p1 = p1.next;
        }

        if(l1==null){
            p1.next = l2;
            p1 = p1.next;
        }

        if(l2==null){
            p1.next = l1;
            p1 = p1.next;
        }
        return result.next;

    }
}

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}

