package com.lr.util;

/**
 * @author liurui
 * @date 2020/1/16 14:34
 */
public class HeapSort {
    public static void main(String[] args) {
        int[] nums = new int[]{3,2,1};
        new HeapSort().heapSort(nums);

        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i]);

        }

        System.out.println("=======");
        for (int i : nums) {
            System.out.println(i);
        }
    }

    public void heapSort(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            heapBigInsert(nums, i);
        }

        int heapSize = nums.length;

        swap(nums, 0, --heapSize);

        while (heapSize > 0) {
            heapify(nums, 0, heapSize);
            swap(nums,0,--heapSize);
        }


    }


    public void heapify(int[] nums,int index,int heapSize){
        int left = 2 * index + 1;
        while (left < heapSize) {
            int largeIndex = left + 1 < heapSize && nums[left] < nums[left + 1] ? left+1 : left ;
            largeIndex = nums[index] > nums[largeIndex] ? index : largeIndex;
            if (largeIndex == index) {
                break;
            }
            swap(nums, largeIndex, index);
            index = largeIndex;
            left = index * 2 + 1;
        }
    }


    /**
     * 成为大顶堆
     * @param nums
     * @param index
     */
    public static void heapBigInsert(int[] nums, int index) {
        while (nums[index] > nums[(index - 1) / 2]) {
            swap(nums, index, (index - 1) / 2);
            index = (index - 1) / 2;
        }
    }

    /**
     * 成为小顶堆
     * @param nums
     * @param index
     */
    public static void heapSmallInsert(int[] nums, int index) {
        while (nums[index] < nums[(index - 1) / 2]) {
            swap(nums, index, (index - 1) / 2);
            index = (index - 1) / 2;
        }
    }



    public static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
