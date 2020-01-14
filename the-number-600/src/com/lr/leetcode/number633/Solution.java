package com.lr.leetcode.number633;


/**
 * @author liurui
 * @date 2020/1/14 16:40
 * <p>
 * 给定一个非负整数 c ，你要判断是否存在两个整数 a 和 b，使得 a2 + b2 = c。
 * <p>
 * 示例1:
 * <p>
 * 输入: 5
 * 输出: True
 * 解释: 1 * 1 + 2 * 2 = 5
 *  
 * <p>
 * 示例2:
 * <p>
 * 输入: 3
 * 输出: False
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/sum-of-square-numbers
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */


/**
 * 主要借助Math.sqrt()方法，该方法是数学上面的开根，如Math.sqrt(9) = 3、
 */
public class Solution {
    public boolean judgeSquareSum(int c) {
        for (long i = 0; i * i <= c; i++) {

            if (Math.sqrt(c - i * i) % 1 == 0) {
                return true;
            }

        }
        return false;
    }

}
