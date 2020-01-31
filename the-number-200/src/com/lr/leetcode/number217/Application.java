package com.lr.leetcode.number217;

/**
 * @author liurui
 * @date 2020/1/31 19:48
 * 给定一个整数数组，判断是否存在重复元素。
 * <p>
 * 如果任何值在数组中出现至少两次，函数返回 true。如果数组中每个元素都不相同，则返回 false。
 * <p>
 * 示例 1:
 * <p>
 * 输入: [1,2,3,1]
 * 输出: true
 * 示例 2:
 * <p>
 * 输入: [1,2,3,4]
 * 输出: false
 * 示例 3:
 * <p>
 * 输入: [1,1,1,3,3,4,3,2,4,2]
 * 输出: true
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/contains-duplicate
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */

import java.util.*;

public class Application {
    /**
     * 使用hashSet保存，相同的hashcode的值去替换原来的值，或者用contains()方法判断
     *
     * @param nums
     * @return
     */
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> hashSet = new HashSet<>();
        for (int num : nums) {
            if (hashSet.contains(num)) {
                return true;
            } else {
                hashSet.add(num);
            }
        }

        return false;
    }
}
