package com.lr.offer.number05;

/**
 * @author liurui
 * @date 2020/2/18 13:45
 * 请实现一个函数，把字符串 s 中的每个空格替换成"%20"。
 * <p>
 *  
 * <p>
 * 示例 1：
 * <p>
 * 输入：s = "We are happy."
 * 输出："We%20are%20happy."
 *  
 * <p>
 * 限制：
 * <p>
 * 0 <= s 的长度 <= 10000
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/ti-huan-kong-ge-lcof
 * <p>
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Solution {
    /**
     * ‘%20’对于char来说要一个个对换
     * @param s
     * @return
     */
    public String replaceSpace(String s) {
        char[] chars = s.toCharArray();
        //最差的情况就一个空格
        char[] result = new char[s.length() * 3];
        int index = 0;
        for (char c : chars) {
            if (c == ' ') {
                result[index++] = '%';
                result[index++] = '2';
                result[index++] = '0';
            } else {
                result[index++] = c;
            }
        }
        //将char数组转换为string
        return new String(result, 0, index);
    }
}
