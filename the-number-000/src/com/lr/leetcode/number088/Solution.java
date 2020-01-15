package com.lr.leetcode.number088;

/**
 * @author liurui
 * @date 2020/1/15 10:45
 */
public class Solution {

    /**
     * 使用两个指针，位置分别为nums1和nums2的尾部，从后往前遍历，这样就可以节省额外的空间去存储排序过后的数组。
     * @param nums1
     * @param m
     * @param nums2
     * @param n
     */
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int p1 = m - 1;
        int p2 = n - 1;
        int p3 = m + n - 1;

        while (p1 >= 0 && p2 >= 0) {
            nums1[p3--] = nums1[p1] >= nums2[p2] ? nums1[p1--] : nums2[p2--];
        }

        System.arraycopy(nums2, 0, nums1, 0, p2 + 1);

    }
}
