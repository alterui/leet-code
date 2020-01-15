package com.lr.util;

import java.util.Arrays;

/**
 * @author liurui
 * @date 2020/1/15 21:32
 */
public class QuickSort {
    public void quickSort(int[] nums, int begin, int end) {

        if (begin < end) {
            swap(nums, end, begin + (int) (Math.random() * (end - begin + 1)));
            int[] partitions = partition(nums, begin, end);
            quickSort(nums, begin, partitions[0] - 1);
            quickSort(nums, partitions[1] + 1, end);

        }
    }

    public int[] partition(int[] nums, int begin, int end) {

        int less = begin - 1;
        int more = end;

        while (begin < more) {
            if (nums[begin] < nums[end]) {
                swap(nums, ++less, begin++);
            } else if (nums[begin] > nums[end]) {
                swap(nums, begin, --more);
            } else {
                begin++;
            }

        }
        swap(nums, more, end);

        return new int[]{less + 1, more};
    }

    public void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }


    public static void main(String[] args) {
        int[] arr = {2, 1, 4, 7, 3, 9, 6};
        new QuickSort().quickSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }
}
