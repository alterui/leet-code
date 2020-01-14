package com.lr.leetcode.number633;

/**
 * @author liurui
 * @date 2020/1/14 18:11
 */


/**
 * 使用双指针的思想，要注意边界值。
 */
public class Solution1 {
    public boolean judgeSquareSum(int c) {
        int left = 0;
        int right = (int) Math.sqrt(c);

        while (left <= right) {
            int result = left * left + right * right;
            if (result == c) {
                return true;
            } else if (result < c) {
                ++left;
            } else {
                --right;
            }
        }

        return false;

    }
}
