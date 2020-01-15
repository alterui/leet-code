package com.lr.leetcode.number215;

/**
 * @author liurui
 * @date 2020/1/15 23:38
 */
import java.util.*;
public class Solution2 {

    /**
     * 借助PriorityQueue优先级队列，其实为小顶堆。
     * @param nums
     * @param k
     * @return
     */
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        for(int i = 0 ;i < nums.length;i++){
            queue.add(nums[i]);
            if(queue.size()>k){
                queue.poll();
            }
        }
        return queue.peek();
    }
}
