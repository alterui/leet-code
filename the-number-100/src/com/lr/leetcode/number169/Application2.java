package com.lr.leetcode.number169;

/**
 * @author liurui
 * @date 2021/2/3 5:16 下午
 */
public class Application2 {

    /**
     * 使用的投票法，因为总有一个是最多的。
     * 实时进行消减，最终vote就是众数
     * @param nums
     * @return
     */
    public int majorityElement(int[] nums) {
        int vote = nums[0];
        int count = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == vote) {
                count++;
            } else {
                count--;
                if (count == 0) {
                    vote = nums[i];
                    count = 1;
                }
            }
        }
        return vote;
    }

}
