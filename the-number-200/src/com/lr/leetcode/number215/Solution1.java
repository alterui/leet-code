package com.lr.leetcode.number215;

/**
 * @author liurui
 * @date 2020/1/15 23:36
 */

import java.util.*;

/**
 * 使用JDK API排序
 */
public class Solution1 {
    public int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        return nums[nums.length-k];
    }
}
