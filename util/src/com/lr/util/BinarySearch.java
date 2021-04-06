package com.lr.util;

import java.util.Arrays;

/**
 * @author liurui
 * @date 2021/3/19 11:07 上午
 */
public class BinarySearch {

    public static void main(String[] args) {
        int[] arr = new int[]{2, 34, 1, 5, 32, 6, 4, 7, 3, 8, 5, 9, 11, 43};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int i = binarySearch(arr, 3);
        System.out.println(i);
    }

    public static int binarySearch(int[] arr, int num) {
        int left = 0;
        int right = arr.length -1;

        while (left <= right) {
            int mid = (left+right)/2;
            if (arr[mid] < num) {
                left = mid +1;
            } else if (arr[mid] > num) {
                right = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
