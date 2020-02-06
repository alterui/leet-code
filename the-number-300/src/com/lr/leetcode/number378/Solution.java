package com.lr.leetcode.number378;

/**
 * @author liurui
 * @date 2020/2/6 22:27
 */
public class Solution {
    /**
     * 使用二分法
     * @param matrix
     * @param k
     * @return
     */
    public int kthSmallest(int[][] matrix, int k) {
        int m = matrix.length, n = matrix[0].length;
        int min = matrix[0][0], max = matrix[m - 1][n - 1];

        while (min <= max) {
            int time = 0;
            //这里注意越界
            int mid = min + (max - min) / 2;

            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    if (matrix[i][j] <= mid) {
                        time++;
                    }
                }
            }

            if (time < k) {
                min = mid + 1;
            } else {
                max = mid - 1;
            }
        }

        return min;
    }
}
