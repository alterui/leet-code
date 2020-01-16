package com.lr.leetcode.number215;

/**
 * @author liurui
 * @date 2020/1/16 16:30
 */
public class Solution3 {

    /**
     * 使用堆排序，小顶堆
     * @param nums
     * @param k
     * @return
     */
    public int findKthLargest(int[] nums, int k) {
        heapSort(nums);
        return nums[k - 1];
    }


    public void heapSort(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            //建立小顶堆
            heapSamllInsert(nums, i);
        }

        int heapSize = nums.length;
        swap(nums, 0, --heapSize);
        /**
         * 依次取出每个最大的元素
         */
        while (heapSize > 0) {
            heapify(nums, 0, heapSize);
            swap(nums, 0, --heapSize);
        }

    }

    public void heapify(int[] nums, int i, int heapSize) {
        int left = 2 * i + 1;

        while (left < heapSize) {
            int smallIndex = left + 1 < heapSize && nums[left + 1] < nums[left] ? left + 1 : left;
            smallIndex = nums[i] < nums[smallIndex] ? i : smallIndex;
            if (i == smallIndex) {
                break;
            }

            swap(nums, i, smallIndex);
            i = smallIndex;
            left = 2 * i - 1;

        }


    }

    /**
     * 建立小顶堆
     * @param nums
     * @param i
     */
    public void heapSamllInsert(int[] nums, int i) {
        //
        while (nums[i] < nums[(i - 1) / 2]) {
            swap(nums, i, (i - 1) / 2);
            i = (i - 1) / 2;
        }
    }

    public void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;

    }
}
