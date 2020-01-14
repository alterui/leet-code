package com.lr.leetcode.number088;

/**
 * @author liurui
 * @date 2020/1/13 22:34
 * 给定两个有序整数数组 nums1 和 nums2，将 nums2 合并到 nums1 中，使得 num1 成为一个有序数组。
 *
 * 说明:
 *
 * 初始化 nums1 和 nums2 的元素数量分别为 m 和 n。
 * 你可以假设 nums1 有足够的空间（空间大小大于或等于 m + n）来保存 nums2 中的元素。
 * 示例:
 *
 * 输入:
 * nums1 = [1,2,3,0,0,0], m = 3
 * nums2 = [2,5,6],       n = 3
 *
 * 输出: [1,2,2,3,5,6]
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/merge-sorted-array
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Application {

    /**
     * 新建一个数组，然后用两个指针分别指向num1和num2的最左边。当有一个数组到末尾，另外一个数组的值直接复制到新数组。
     *
     * 坑点：题目是返回的num1，所以需要把新数组的值复制到num1中。
     * 可以使用System.arraycopy()方法
     *
     *      * @param      src      the source array.
     *      * @param      srcPos   starting position in the source array.
     *      * @param      dest     the destination array.
     *      * @param      destPos  starting position in the destination data.
     *      * @param      length   the number of array elements to be copied.
     *      void arraycopy(Object src,  int  srcPos,Object dest, int destPos, int length);
     *
     *
     * @param nums1
     * @param m
     * @param nums2
     * @param n
     */
    public void merge(int[] nums1, int m, int[] nums2, int n) {


        int[] nums3 = new int[m + n];
        int i = 0, j = 0, z = 0;
        while (i < m && j < n) {
            if (nums1[i] <= nums2[j]) {
                nums3[z++] = nums1[i++];
            } else {
                nums3[z++] = nums2[j++];
            }
        }

        if (i == m) {
            for (int k = j; k < n; k++) {
                nums3[z++] = nums2[k];
            }
        } else {

            for (int k = i; k < m; k++) {
                nums3[z++] = nums1[k];
            }

        }
        System.arraycopy(nums3, 0, nums1, 0, z);
    }
}
