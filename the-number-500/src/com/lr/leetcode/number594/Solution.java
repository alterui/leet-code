package com.lr.leetcode.number594;

/**
 * @author liurui
 * @date 2020/1/31 20:23
 * 和谐数组是指一个数组里元素的最大值和最小值之间的差别正好是1。
 * <p>
 * 现在，给定一个整数数组，你需要在所有可能的子序列中找到最长的和谐子序列的长度。
 * <p>
 * 示例 1:
 * <p>
 * 输入: [1,3,2,2,5,2,3,7]
 * 输出: 5
 * 原因: 最长的和谐数组是：[3,2,2,2,3].
 * 说明: 输入的数组长度最大不超过20,000.
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/longest-harmonious-subsequence
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */

import java.util.*;

public class Solution {
    public int findLHS(int[] nums) {
        /**
         * 使用HashMap key -> 存储 nums的num, value->  存储num出现的次数。
         */
        Map<Integer, Integer> hashMap = new HashMap<>();
        for (int num : nums) {
            hashMap.put(num, hashMap.getOrDefault(num, 0) + 1);
        }

        int result = 0;
        /**
         * 因为只求相差一的值
         */

        for (int num : nums) {
            if (hashMap.containsKey(num + 1)) {
                result = Math.max(result, hashMap.get(num) + hashMap.get(num + 1));
            }
        }

        return result;
    }
}
