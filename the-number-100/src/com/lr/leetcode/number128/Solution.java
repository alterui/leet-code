package com.lr.leetcode.number128;

/**
 * @author liurui
 * @date 2020/1/31 22:26
 * <p>
 * 给定一个未排序的整数数组，找出最长连续序列的长度。
 * <p>
 * 要求算法的时间复杂度为 O(n)。
 * <p>
 * 示例:
 * <p>
 * 输入: [100, 4, 200, 1, 3, 2]
 * 输出: 4
 * 解释: 最长连续序列是 [1, 2, 3, 4]。它的长度为 4。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/longest-consecutive-sequence
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */

import java.util.*;

public class Solution {
    /**
     * 时间复杂度为排序算法的时间复杂度(nlogn)
     * @param nums
     * @return
     */
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        Arrays.sort(nums);

        int curLength = 1, maxLength = 1;
        for (int i = 1; i < nums.length; i++) {
            //如果相等表明 如1123，这个也是连续的，虽然是4个数组，但是只有123连续，因此如果遇到相等的不计次数。
            if (nums[i] != nums[i - 1]) {
                //表示连续，及时更新maxLength
                if (nums[i] == nums[i - 1] + 1) {
                    curLength++;
                    maxLength = Math.max(curLength, maxLength);
                } else {
                    //表明断了，继续寻找下个最长的
                    curLength = 1;
                }
            }

        }

        return maxLength;

    }
}
