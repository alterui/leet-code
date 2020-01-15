package com.lr.leetcode.number215;

/**
 * @author liurui
 * @date 2020/1/15 23:29
 * 在未排序的数组中找到第 k 个最大的元素。请注意，你需要找的是数组排序后的第 k 个最大的元素，而不是第 k 个不同的元素。
 * <p>
 * 示例 1:
 * <p>
 * 输入: [3,2,1,5,6,4] 和 k = 2
 * 输出: 5
 * 示例 2:
 * <p>
 * 输入: [3,2,3,1,2,4,5,5,6] 和 k = 4
 * 输出: 4
 * 说明:
 * <p>
 * 你可以假设 k 总是有效的，且 1 ≤ k ≤ 数组的长度。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/kth-largest-element-in-an-array
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Solution {

    /**
     * 先把数组进行排序，这里使用的是快排。
     *
     * @param nums
     * @param k
     * @return
     */
    public int findKthLargest(int[] nums, int k) {
        quickSort(nums, 0, nums.length - 1);
        return nums[nums.length - k];
    }


    public void quickSort(int[] nums, int begin, int end) {

        if (begin < end) {
            /**
             * 随机获取一个index，和end交换，从概率学上面来说，可以提高排序的速度。
             */
            swap(nums, end, begin + (int) (Math.random() * (end - begin + 1)));
            /**
             * 找到和end索引所在值相等的区间范围。
             */
            int[] partitions = partition(nums, begin, end);
            quickSort(nums, begin, partitions[0] - 1);
            quickSort(nums, partitions[1] + 1, end);

        }
    }

    public int[] partition(int[] nums, int begin, int end) {

        /**
         * less的范围表示都是小于end索引下的值。
         */
        int less = begin - 1;
        /**
         * more表示的范围是大于end索引下的值而且(包含一个end索引下的值)。
         */
        int more = end;

        /**
         * begin表示数组的当前值，在不断移动，指针在等于的时候也要右移
         */
        while (begin < more) {

            /**
             * 当前值小于num[end],less的范围变大，当前begin指针也要游戏
             */
            if (nums[begin] < nums[end]) {
                swap(nums, ++less, begin++);

            } else if (nums[begin] > nums[end]) {
                /**
                 * 当前值大于nums[end],more的范围变大，但是由于不知道换来的值的大小，所以当前指针没有移动，还需再次判断。
                 */
                swap(nums, begin, --more);
            } else {
                /**
                 * 相等的情况下，当前指针begin继续移动
                 */
                begin++;
            }

        }

        /**
         * 将num[end]的值和more位置的值交换，让相等的值都在一起
         */
        swap(nums, more, end);

        /**
         * 返回和nums[end]值相等的index区间范围
         */
        return new int[]{less + 1, more};
    }

    public void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

}
