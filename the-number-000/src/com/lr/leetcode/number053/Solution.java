package com.lr.leetcode.number053;

/**
 * @author liurui
 * @date 2020/2/9 9:39
 * 给定一个整数数组 nums ，找到一个具有最大和的连续子数组（子数组最少包含一个元素），返回其最大和。
 * <p>
 * 示例:
 * <p>
 * 输入: [-2,1,-3,4,-1,2,1,-5,4],
 * 输出: 6
 * 解释: 连续子数组 [4,-1,2,1] 的和最大，为 6。
 * 进阶:
 * <p>
 * 如果你已经实现复杂度为 O(n) 的解法，尝试使用更为精妙的分治法求解
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/maximum-subarray
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Solution {
    public int maxSubArray(int[] nums) {
        int max = nums[0],cur = nums[0];

        //贪心思想，没一次都找到每一步最大的
        for(int i = 1;i<nums.length;i++){
            cur = Math.max(nums[i],nums[i]+cur);
            max = Math.max(cur,max);
        }

        return max;
    }
}
