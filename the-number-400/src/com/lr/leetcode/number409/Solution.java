package com.lr.leetcode.number409;

/**
 * @author liurui
 * @date 2020/2/2 23:27
 * 给定一个包含大写字母和小写字母的字符串，找到通过这些字母构造成的最长的回文串。
 * <p>
 * 在构造过程中，请注意区分大小写。比如 "Aa" 不能当做一个回文字符串。
 * <p>
 * 注意:
 * 假设字符串的长度不会超过 1010。
 * <p>
 * 示例 1:
 * <p>
 * 输入:
 * "abccccdd"
 * <p>
 * 输出:
 * 7
 * <p>
 * 解释:
 * 我们可以构造的最长的回文串是"dccaccd", 它的长度是 7。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/longest-palindrome
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Solution {

    public int longestPalindrome(String s) {
        int[] counts = new int[128];

        for (char c : s.toCharArray()) {
            counts[c]++;
        }
        int result = 0;
        for (int count : counts) {
            //如果一个数出现的次数为v,那么最多出现的回文数字为v/2*2.
            result += count / 2 * 2;
            //这里表示中间有一个其他字符
            if (count % 2 == 1 && result % 2 == 0) {
                ++result;
            }
        }

        return result;
    }
}
