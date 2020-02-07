package com.lr.leetcode.number153;

/**
 * @author liurui
 * @date 2020/2/7 19:30
 * 假设按照升序排序的数组在预先未知的某个点上进行了旋转。
 * <p>
 * ( 例如，数组 [0,1,2,4,5,6,7] 可能变为 [4,5,6,7,0,1,2] )。
 * <p>
 * 请找出其中最小的元素。
 * <p>
 * 你可以假设数组中不存在重复元素。
 * <p>
 * 示例 1:
 * <p>
 * 输入: [3,4,5,1,2]
 * 输出: 1
 * 示例 2:
 * <p>
 * 输入: [4,5,6,7,0,1,2]
 * 输出: 0
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/find-minimum-in-rotated-sorted-array
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Solution {

    /**
     * 二分法
     * @param nums
     * @return
     */
    public int findMin(int[] nums) {
        int left = 0;
        int right = nums.length-1;

        //这里如果等于的话，left还要移动
        while(left< right){

            int mid = left + (right-left)/2;

            if(nums[mid] >= nums[right]){
                //中间值比最右还要大，因此当前的中间值肯定不是最小值，因此可以右移一位。
                left = mid+1;
            }else{
                right = mid;
            }
        }

        return nums[left];
    }

}
