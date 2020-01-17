package com.lr.leetcode.number215;

/**
 * @author liurui
 * @date 2020/1/17 12:04
 */
public class Solution5 {
    /**
     * 建立大顶堆，使用堆排序
     * @param nums
     * @param k
     * @return
     */
    public int findKthLargest(int[] nums, int k) {
        heapSort(nums);
        return nums[nums.length-k];
    }

    public void heapSort(int[] nums){
        //建立大顶堆
        for(int i = 0 ;i<nums.length;i++){
            heapInsert(nums,i);
        }

        int heapSize = nums.length ;

        swap(nums,0,--heapSize);

        while(heapSize>0){
            heapify(nums,0,heapSize);
            swap(nums,0,--heapSize);
        }




    }


    public void heapify(int[] nums,int index,int heapSize){
        int left = index *2 +1;
        while(left < heapSize){
            int lagerIndex = left+1<heapSize&& nums[left+1]> nums[left] ? left+1 : left;

            lagerIndex = nums[lagerIndex] > nums[index] ? lagerIndex : index;

            if(lagerIndex == index){
                break;
            }

            swap(nums,index,lagerIndex);
            index = lagerIndex;
            left = index*2+1;
        }

    }


    public void heapInsert(int[] nums,int index){
        while(nums[index] > nums[(index-1)/2]){
            swap(nums,index,(index-1)/2);
            index = (index-1)/2;
        }
    }

    public void swap(int[] nums,int i ,int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
