package com.lr.leetcode.number128;

/**
 * @author liurui
 * @date 2020/1/31 22:46
 */

import java.util.*;

public class Application {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }

        int maxLength = 0;

        for (int num : nums) {
            //表示到最小值了
            if (!set.contains(num - 1)) {
                int curNum = num;
                int curLength = 0;

                //开始从最小值开始计数
                while (set.contains(curNum++)) {
                    ++curLength;

                }
                maxLength = Math.max(curLength, maxLength);
            }
        }
        return maxLength;
    }
}
