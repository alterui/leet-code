package com.lr.leetcode.number024;

/**
 * @author liurui
 * @date 2020/1/26 18:59
 *
 * 给定一个链表，两两交换其中相邻的节点，并返回交换后的链表。
 *
 * 你不能只是单纯的改变节点内部的值，而是需要实际的进行节点交换。
 *
 *  
 *
 * 示例:
 *
 * 给定 1->2->3->4, 你应该返回 2->1->4->3.
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/swap-nodes-in-pairs
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Solution {
    /**
     * 使用递归算法:
     *   1.终止条件
     *   2.找返回值
     *   3.本级递归应该完成的任务。
     * @param head
     * @return
     */
    public ListNode swapPairs(ListNode head) {
        //终止条件
        if(head == null || head.next ==null){
            return head;
        }
        //head 的下一个指针
        ListNode tempNext =  head.next;

        //head 的指向已经处理好的，业绩是head的next的next指针，即tempNext的next指针。
        head.next = swapPairs(tempNext.next);
        tempNext.next = head;
        //返回给上一级的是当前已经完成交换后，即处理好了的链表部分
        return tempNext;
    }
}
class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}

