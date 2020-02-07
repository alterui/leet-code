package com.lr.leetcode.number268;

/**
 * @author liurui
 * @date 2020/2/7 22:15
 * 给定一个包含 0, 1, 2, ..., n 中 n 个数的序列，找出 0 .. n 中没有出现在序列中的那个数。
 *
 * 示例 1:
 *
 * 输入: [3,0,1]
 * 输出: 2
 * 示例 2:
 *
 * 输入: [9,6,4,2,3,5,7,0,1]
 * 输出: 8
 * 说明:
 * 你的算法应具有线性时间复杂度。你能否仅使用额外常数空间来实现?
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/missing-number
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Solution {


    /**
     * 借助数组为桶，进行收集数据
     * @param nums
     * @return
     */
    public int missingNumber(int[] nums) {
        int[] arr = new int[nums.length+1];
        for(int i = 0 ;i<nums.length;i++){
            arr[nums[i]] = 1;
        }

        for(int i = 0;i<arr.length;i++){
            if(arr[i] == 0){
                return i;
            }
        }

        return -1;
    }
}
