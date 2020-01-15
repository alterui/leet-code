package com.lr.leetcode.number524;

import java.util.Arrays;
import java.util.List;

/**
 * @author liurui
 * @date 2020/1/13 21:11
 *
 * 给定一个字符串和一个字符串字典，找到字典里面最长的字符串，该字符串可以通过删除给定字符串的某些字符来得到。如果答案不止一个，返回长度最长且字典顺序最小的字符串。如果答案不存在，则返回空字符串。
 *
 * 示例 1:
 *
 * 输入:
 * s = "abpcplea", d = ["ale","apple","monkey","plea"]
 *
 * 输出:
 * "apple"
 * 示例 2:
 *
 * 输入:
 * s = "abpcplea", d = ["a","b","c"]
 *
 * 输出:
 * "a"
 * 说明:
 *
 * 所有输入的字符串只包含小写字母。
 * 字典的大小不会超过 1000。
 * 所有输入的字符串长度不会超过 1000。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/longest-word-in-dictionary-through-deleting
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Application {

    /**
     * 使用双指针，用s和d比较，如果d到头了，说明d在s里面。
     * 使用string.compareTo(str)  比较 两个字符那个更小，如果小则返回负数。
     * @param s
     * @param d
     * @return
     */
    public String findLongestWord(String s, List<String> d) {
        String maxStr = "";

        for (String str : d) {
            int j = 0;
            for (int i = 0; i < s.length()   && j < str.length() ; i++) {
                if (str.charAt(j) == s.charAt(i)) {
                    j++;
                }
            }

            if (j == str.length()) {
                if (str.length() > maxStr.length() || ((maxStr.length() == str.length()) && (str.compareTo(maxStr) < 0))) {
                    maxStr = str;
                }
            }

        }

        return maxStr;
    }
}
