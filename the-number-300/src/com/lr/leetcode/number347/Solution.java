package com.lr.leetcode.number347;

import java.util.*;


/**
 * @author liurui
 * @date 2020/1/16 23:22
 */
public class Solution {
    public List<Integer> topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int value : nums) {
            map.put(value, map.getOrDefault(value, 0) + 1);
        }
        //构建一个list桶，桶的位置的index表示出现该数的频率
        List[] buckets = new List[nums.length + 1];

        for (int key : map.keySet()) {
            int index = map.get(key);
            if (buckets[index] == null) {
                buckets[index] = new ArrayList<>();
            }
            buckets[index].add(key);
        }

        List<Integer> result = new ArrayList<>();

        //从后往前遍历
        for (int i = buckets.length - 1; i >= 0 && result.size() < k; i--) {
            if (buckets[i] == null) {
                continue;
            }
            result.addAll(buckets[i]);
        }

        return result;


    }
}
