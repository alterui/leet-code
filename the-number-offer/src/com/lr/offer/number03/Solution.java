package com.lr.offer.number03;

/**
 * @author liurui
 * @date 2020/2/14 14:11
 */
public class Solution {
    /**
     * 原地桶原则
     * @param nums
     * @return
     */
    public int findRepeatNumber(int[] nums) {
        for(int i = 0;i<nums.length;i++){
            while(nums[i] != i){
                if(nums[i] == nums[nums[i]]){
                    return nums[i];
                }

                int temp = nums[i];
                nums[i] = nums[temp];
                nums[temp] = temp;
            }
        }
        return -1;
    }
}
