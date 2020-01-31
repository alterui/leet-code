package com.lr.leetcode.number503;

/**
 * @author liurui
 * @date 2020/1/31 15:55
 * 给定一个循环数组（最后一个元素的下一个元素是数组的第一个元素），输出每个元素的下一个更大元素。
 * 数字 x 的下一个更大的元素是按数组遍历顺序，这个数字之后的第一个比它更大的数，这意味着你应该循环地搜索它的下一个更大的数。
 * 如果不存在，则输出 -1。
 * <p>
 * 示例 1:
 * <p>
 * 输入: [1,2,1]
 * 输出: [2,-1,2]
 * 解释: 第一个 1 的下一个更大的数是 2；
 * 数字 2 找不到下一个更大的数；
 * 第二个 1 的下一个最大的数需要循环搜索，结果也是 2。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/next-greater-element-ii
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */


import java.util.*;

public class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        //先将返回的结果集赋值-1
        Arrays.fill(result, -1);

        //用于存放当前数组的index
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < 2 * n; i++) {
            //因为该数组是循环数组，因为需要用2n表示，因此index 就 i%n
            int index = i % n;
            //如果当前值比stack的值还大，那结果就是当前的值
            while (!stack.isEmpty() && nums[stack.peek()] < nums[index]) {
                result[stack.pop()] = nums[index];
            }

            //保证数组的界限
            if (i < n) {
                stack.add(i);
            }
        }

        return result;
    }
}
