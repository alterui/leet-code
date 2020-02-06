package com.lr.leetcode.number647;

/**
 * @author liurui
 * @date 2020/2/6 11:22
 * 给定一个字符串，你的任务是计算这个字符串中有多少个回文子串。
 * <p>
 * 具有不同开始位置或结束位置的子串，即使是由相同的字符组成，也会被计为是不同的子串。
 * <p>
 * 示例 1:
 * <p>
 * 输入: "abc"
 * 输出: 3
 * 解释: 三个回文子串: "a", "b", "c".
 * 示例 2:
 * <p>
 * 输入: "aaa"
 * 输出: 6
 * 说明: 6个回文子串: "a", "a", "a", "aa", "aa", "aaa".
 * 注意:
 * <p>
 * 输入的字符串长度不会超过1000。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/palindromic-substrings
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Solution {
    public int countSubstrings(String s) {
        int result = 0;

        for(int i = 0 ;i < s.length();i++){
            //以i点作用回文数的中间点
            result += getCount(s,i,i);
            //以i,i+1作为回文数的中间点
            result += getCount(s,i,i+1);
        }

        return result;
    }

    private int getCount(String s,int start,int end){
        int count = 0;

        while(start>=0 && end < s.length()&&s.charAt(start--)==s.charAt(end++)){
            ++count;
        }

        return count;
    }
}
