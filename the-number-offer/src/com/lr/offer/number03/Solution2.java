package com.lr.offer.number03;

/**
 * @author liurui
 * @date 2020/2/14 14:21
 */
public class Solution2 {
    /**
     * 借用桶
     * @param nums
     * @return
     */
    public int findRepeatNumber(int[] nums) {
        int[] buckets = new int[nums.length];
        for(int num:nums){
            buckets[num]++;
            if(buckets[num]==2){
                return num;
            }
        }
        return -1;
    }
}
