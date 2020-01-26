package com.lr.leetcode.number019;

/**
 * @author liurui
 * @date 2020/1/26 16:02
 *
 * 给定一个链表，删除链表的倒数第 n 个节点，并且返回链表的头结点。
 *
 * 示例：
 *
 * 给定一个链表: 1->2->3->4->5, 和 n = 2.
 *
 * 当删除了倒数第二个节点后，链表变为 1->2->3->5.
 * 说明：
 *
 * 给定的 n 保证是有效的。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/remove-nth-node-from-end-of-list
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Application {
    /**
     * 使用两次遍历，第一次获取链表长度，第二次删除节点。
     * 哑结点用来简化某些极端情况，例如列表中只含有一个结点，或需要删除列表的头部
     */
    public ListNode removeNthFromEnd(ListNode head, int n) {

        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        int num = 0;

        ListNode count = head;


        while(count != null){
            ++num;
            count = count.next;
        }
        count = dummy;
        int length = num-n;

        while(length>0){
            --length;
            count = count.next;
        }

        count.next = count.next.next;

        return dummy.next;
    }
}

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}
