package com.lr.leetcode.number739;

/**
 * @author liurui
 * @date 2020/1/30 21:01
 */

import java.util.*;

public class Solution {
    /**
     * 在一组数据中，找一个数比当前数大的要遍历的次数。
     * 用栈把数据存储起来，如果当前数据比栈顶数据还大，那么说明比栈顶数据大的下面一个数就是当前数据。
     * @param T
     * @return
     */
    public int[] dailyTemperatures(int[] T) {
        Stack<Integer> stack = new Stack<>();
        int length = T.length;
        int[] result = new int[length];

        for (int i = 0; i < length; i++) {
            while (!stack.isEmpty() && T[i] > T[stack.peek()]) {
                int pre = stack.pop();
                result[pre] = i - pre;
            }
            stack.add(i);

        }
        return result;
    }
}
