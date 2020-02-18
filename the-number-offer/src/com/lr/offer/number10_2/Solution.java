package com.lr.offer.number10_2;

/**
 * @author liurui
 * @date 2020/2/18 21:52
 * 面试题10- II. 青蛙跳台阶问题
 * 一只青蛙一次可以跳上1级台阶，也可以跳上2级台阶。求该青蛙跳上一个 n 级的台阶总共有多少种跳法。
 *
 * 答案需要取模 1e9+7（1000000007），如计算初始结果为：1000000008，请返回 1。
 *
 * 示例 1：
 *
 * 输入：n = 2
 * 输出：2
 * 示例 2：
 *
 * 输入：n = 7
 * 输出：21
 * 提示：
 *
 * 0 <= n <= 100
 */
public class Solution {
    /**
     * 动态规划
     * @param n
     * @return
     */
    public int numWays(int n) {
        if(n<2){
            return 1;
        }

        int begin = 1,end = 1;

        for(int i = 2;i<=n;i++){
            int temp = begin +end;
            begin = end;
            end = temp % 1000000007;
        }

        return end;
    }
}
