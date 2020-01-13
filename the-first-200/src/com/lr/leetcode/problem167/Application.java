package com.lr.leetcode.problem167;

/**
 * @author liurui
 * @date 2020/1/13 21:29
 * <p>
 * 给定一个已按照升序排列 的有序数组，找到两个数使得它们相加之和等于目标数。
 * <p>
 * 函数应该返回这两个下标值 index1 和 index2，其中 index1 必须小于 index2。
 * <p>
 * 说明:
 * <p>
 * 返回的下标值（index1 和 index2）不是从零开始的。
 * 你可以假设每个输入只对应唯一的答案，而且你不可以重复使用相同的元素。
 * 示例:
 * <p>
 * 输入: numbers = [2, 7, 11, 15], target = 9
 * 输出: [1,2]
 * 解释: 2 与 7 之和等于目标数 9 。因此 index1 = 1, index2 = 2 。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/two-sum-ii-input-array-is-sorted
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */

import java.util.*;

public class Application {

    public int[] twoSum(int[] numbers, int target) {
        //使用hashMap的key存储数组的value,hashMap的value为数据的index。
        Map<Integer, Integer> hashMap = new HashMap<>();

        /**
         * 时间复杂度为O(n）,空间复杂度为B(n).
         */
        for (int i = 0; i < numbers.length; i++) {
            if (hashMap.containsKey(target - numbers[i])) {
                return new int[]{hashMap.get(target - numbers[i]) + 1, i + 1};
            } else {
                hashMap.put(numbers[i], i);
            }
        }
        throw new RuntimeException("");
    }

    public static void main(String[] args) {
        if (1 < 2) ;
    }
}
