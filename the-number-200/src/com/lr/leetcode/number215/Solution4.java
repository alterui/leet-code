package com.lr.leetcode.number215;

/**
 * @author liurui
 * @date 2020/1/16 17:00
 */
public class Solution4 {

    public int findKthLargest(int[] nums, int k) {
        //用于保证堆的数目小于k
        int heapSize = 0;
        for (int i = 0; i < nums.length; i++) {

            if (heapSize < k) {
                heapSize = heapInsert(nums, i, heapSize);
            } else {
                nums[k] = nums[i];
                heapSize = heapInsert(nums, k, heapSize);

            }

            if (heapSize > k) {
                //弹出0，然后变成小顶堆
                swap(nums, 0, --heapSize);
                heapify(nums, 0, heapSize);

            }
        }
        return nums[0];


    }

    public void heapify(int[] nums, int index, int heapSize) {
        int left = 2 * index + 1;
        while (left < heapSize) {
            int smallIndex = left + 1 < heapSize && nums[left + 1] < nums[left] ? left + 1 : left;
            smallIndex = nums[smallIndex] < nums[index] ? smallIndex : index;
            if (smallIndex == index) {
                break;
            }

            swap(nums, index, smallIndex);
            index = smallIndex;
            left = 2 * index + 1;

        }

    }


    //建立小根堆,并返回堆的size
    public int heapInsert(int[] nums, int index, int heapSize) {
        ++heapSize;
        while (nums[index] < nums[(index - 1) / 2]) {
            swap(nums, index, (index - 1) / 2);
            index = (index - 1) / 2;
        }
        return heapSize;
    }

    public void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
