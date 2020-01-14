package com.lr.leetcode.number680;

/**
 * @author liurui
 * @date 2020/1/14 21:56
 *
 * 给定一个非空字符串 s，最多删除一个字符。判断是否能成为回文字符串。
 *
 * 示例 1:
 *
 * 输入: "aba"
 * 输出: True
 * 示例 2:
 *
 * 输入: "abca"
 * 输出: True
 * 解释: 你可以删除c字符。
 * 注意:
 *
 * 字符串只包含从 a-z 的小写字母。字符串的最大长度是50000。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/valid-palindrome-ii
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Solution {

    /**
     * 用str.toCharArray()代替str.charAt()可以提高执行效率。
     * @param s
     * @return
     */
    public boolean validPalindrome(String s) {
        int i = 0, j = s.length() - 1;
        char[] chars = s.toCharArray();
        while (i < j) {
            if (chars[i] == chars[j]) {
                i++;
                j--;
            } else {

                return isValid(chars, i + 1, j) || isValid(chars, i, j - 1);
            }
        }
        return true;
    }

    /**
     * 只要出现一个不相等就返回false，要判断多有的。
     * @param chars
     * @param i
     * @param j
     * @return
     */
    private boolean isValid(char[] chars, int i, int j) {
        while (i < j) {
            if (chars[i++] != chars[j--]) {
                return false;
            }
        }
        return true;
    }

}
