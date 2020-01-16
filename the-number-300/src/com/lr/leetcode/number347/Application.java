package com.lr.leetcode.number347;

import java.util.*;


/**
 * @author liurui
 * @date 2020/1/13 21:10
 * <p>
 * 给定一个非空的整数数组，返回其中出现频率前 k 高的元素。
 * <p>
 * 示例 1:
 * <p>
 * 输入: nums = [1,1,1,2,2,3], k = 2
 * 输出: [1,2]
 * 示例 2:
 * <p>
 * 输入: nums = [1], k = 1
 * 输出: [1]
 * 说明：
 * <p>
 * 你可以假设给定的 k 总是合理的，且 1 ≤ k ≤ 数组中不相同的元素的个数。
 * 你的算法的时间复杂度必须优于 O(n log n) , n 是数组的大小。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/top-k-frequent-elements
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Application {
    public List<Integer> topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> hashMap = new HashMap<>();
        for (int value : nums) {
            hashMap.put(value, hashMap.getOrDefault(value, 0) + 1);
        }

        PriorityQueue<Integer> queue = new PriorityQueue<>((x, y) -> hashMap.get(x) - hashMap.get(y));
        for (int key : hashMap.keySet()) {
            queue.add(key);
            if (queue.size() > k) {
                queue.poll();
            }
        }

        List<Integer> list = new LinkedList<>();

        while (!queue.isEmpty()) {
            list.add(queue.poll());
        }

        Collections.reverse(list);
        return list;


    }
}
