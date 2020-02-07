package com.lr.leetcode.number268;

/**
 * @author liurui
 * @date 2020/2/7 22:18
 */
public class Application {
    //异或思想
    public int missingNumber(int[] nums) {
        int result = 0;
        for(int i  = 0 ;i<nums.length;i++){
            result = result ^ i ^ nums[i];
        }

        return result ^ nums.length;
    }
}
