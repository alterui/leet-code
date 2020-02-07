package com.lr.leetcode.number645;

/**
 * @author liurui
 * @date 2020/2/7 13:11
 */
public class Application {
    /**
     * 一共有n个数据,数据从1开始
     * @param nums
     * @return
     */
    public int[] findErrorNums(int[] nums) {

        //从1号桶开始盛放数据，因此需要n+1个桶
        int[] arr = new int[nums.length +1];
        int left = -1;
        int right = 1;

        for(int i = 0 ;i<nums.length;i++){
            arr[nums[i]] +=1;
        }

        for(int i = 1;i<arr.length;i++){
            if(arr[i]==2){
                left = i;
            }else if(arr[i] == 0){
                right = i;
            }
        }

        return new int[]{left,right};
    }
}
