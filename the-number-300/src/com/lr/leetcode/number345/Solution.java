package com.lr.leetcode.number345;

import java.util.Arrays;
import java.util.List;

/**
 * @author liurui
 * @date 2020/1/14 18:55
 *
 * 编写一个函数，以字符串作为输入，反转该字符串中的元音字母。
 *
 * 示例 1:
 *
 * 输入: "hello"
 * 输出: "holle"
 * 示例 2:
 *
 * 输入: "leetcode"
 * 输出: "leotcede"
 * 说明:
 * 元音字母不包含字母"y"。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/reverse-vowels-of-a-string
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Solution {

    /**
     * 双指针思想，借助一个char[]数组中，使用s.charAt(i)取值放入char[]中。
     * new String(new char[]{'a','c'} = "ac"
     * list.contains(value) ---> list集合是否含有这个value
     * @param s
     * @return
     */
    public String reverseVowels(String s) {
        List<Character> list = Arrays.asList('a','e','i','o','u','A','E','I','O','U');
        int left = 0;
        int right = s.length() - 1;
        char[] result = new char[s.length()];

        while(left <= right){
            char leftValue = s.charAt(left);
            char rightValue = s.charAt(right);

            if(!list.contains(leftValue)){
                result[left++] = leftValue;
            }else if(!list.contains(rightValue)){
                result[right--] = rightValue;
            }else{
                /**
                 * 表明左指针不相等，右指针也不相等。即左右指针都相等。
                 */
                result[left++] = rightValue;
                result[right--] = leftValue;
            }

        }

        return new String(result);


    }
}
