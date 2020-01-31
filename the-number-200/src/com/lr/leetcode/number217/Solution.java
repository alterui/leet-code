package com.lr.leetcode.number217;

/**
 * @author liurui
 * @date 2020/1/31 19:54
 */


import java.util.*;
public class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> hashSet = new HashSet<>();
        for(int num : nums){
            hashSet.add(num);
        }

        return nums.length > hashSet.size();
    }
}
