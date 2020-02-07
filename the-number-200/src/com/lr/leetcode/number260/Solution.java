package com.lr.leetcode.number260;

/**
 * @author liurui
 * @date 2020/2/7 23:08
 * <p>
 * 给定一个整数数组 nums，其中恰好有两个元素只出现一次，其余所有元素均出现两次。 找出只出现一次的那两个元素。
 * <p>
 * 示例 :
 * <p>
 * 输入: [1,2,1,3,2,5]
 * 输出: [3,5]
 * 注意：
 * <p>
 * 结果输出的顺序并不重要，对于上面的例子， [5, 3] 也是正确答案。
 * 你的算法应该具有线性时间复杂度。你能否仅使用常数空间复杂度来实现？
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/single-number-iii
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Solution {

    public int[] singleNumber(int[] nums) {
        int x = 0;
        //找出两个出现一次的数字异或之后的结果
        for (int num : nums) {
            x = x ^ num;
        }

        //得到最右面的1
        x = x & (-x);

        int[] result = new int[2];
        for (int num : nums) {
            //这个1只能来自一个，因此分组，然后再异或求出结果
            if ((x & num) == 0) {
                result[0] ^= num;
            } else {
                result[1] ^= num;
            }
        }
        return result;


    }

}
