package com.lr.leetcode.number324;

/**
 * @author liurui
 * @date 2020/2/8 16:33
 * 给定一个整数 (32 位有符号整数)，请编写一个函数来判断它是否是 4 的幂次方。
 *
 * 示例 1:
 *
 * 输入: 16
 * 输出: true
 * 示例 2:
 *
 * 输入: 5
 * 输出: false
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/power-of-four
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Solution {
    public boolean isPowerOfFour(int num) {
        if(num<=0){
            return false;
        }

        while(num%4==0){
            num/=4;
        }

        return num==1;
    }
}
