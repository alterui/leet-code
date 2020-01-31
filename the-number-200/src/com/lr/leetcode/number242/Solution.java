package com.lr.leetcode.number242;

/**
 * @author liurui
 * @date 2020/1/31 22:54
 *
 * 给定两个字符串 s 和 t ，编写一个函数来判断 t 是否是 s 的字母异位词。
 *
 * 示例 1:
 *
 * 输入: s = "anagram", t = "nagaram"
 * 输出: true
 * 示例 2:
 *
 * 输入: s = "rat", t = "car"
 * 输出: false
 * 说明:
 * 你可以假设字符串只包含小写字母。
 *
 * 进阶:
 * 如果输入字符串包含 unicode 字符怎么办？你能否调整你的解法来应对这种情况？
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/valid-anagram
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
import java.util.*;
public class Solution {
    /**
     * 借助Arrays.sort()排序
     * @param s
     * @param t
     * @return
     */
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }

        char[] chars = s.toCharArray();
        char[] chart = t.toCharArray();
        Arrays.sort(chars);
        Arrays.sort(chart);

        int i = 0;
        int j = 0;
        while(i<s.length()){
            if(chars[i] == chart[j]){
                i++;
                j++;
            }else{
                return false;
            }
        }
        return true;
    }
}
