package com.lr.offer.number06;

/**
 * @author liurui
 * @date 2020/2/18 14:13
 * 输入一个链表的头节点，从尾到头反过来返回每个节点的值（用数组返回）。
 *
 * 示例 1：
 *
 * 输入：head = [1,3,2]
 * 输出：[2,3,1]
 */
import java.util.*;
public class Solution {
    /**
     * 利用栈的特性进行存储
     * @param head
     * @return
     */
    public int[] reversePrint(ListNode head) {
        Stack<Integer> stack = new Stack<>();
        while(head!=null){
            stack.push(head.val);
            head = head.next;
        }

        int[] result = new int[stack.size()];
        int index = 0;

        while(!stack.isEmpty()){
            result[index++] = stack.pop();
        }
        return result;

    }
}

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}
