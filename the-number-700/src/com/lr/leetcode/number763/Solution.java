package com.lr.leetcode.number763;

/**
 * @author liurui
 * @date 2020/2/9 10:55
 * 字符串 S 由小写字母组成。我们要把这个字符串划分为尽可能多的片段，同一个字母只会出现在其中的一个片段。返回一个表示每个字符串片段的长度的列表。
 * <p>
 * 示例 1:
 * <p>
 * 输入: S = "ababcbacadefegdehijhklij"
 * 输出: [9,7,8]
 * 解释:
 * 划分结果为 "ababcbaca", "defegde", "hijhklij"。
 * 每个字母最多出现在一个片段中。
 * 像 "ababcbacadefegde", "hijhklij" 的划分是错误的，因为划分的片段数较少。
 * 注意:
 * <p>
 * S的长度在[1, 500]之间。
 * S只包含小写字母'a'到'z'。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/partition-labels
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */

import java.util.*;

public class Solution {
    public List<Integer> partitionLabels(String S) {
        List<Integer> list = new ArrayList<>();
        //用于存放字母最后一次的位置
        int[] last = new int[26];

        for (int i = 0; i < S.length(); i++) {
            last[S.charAt(i) - 'a'] = i;
        }

        //用来记录当前小片段中的字母最后一个的index
        int max = 0;
        //用来记录前一小片段的结尾的index。
        int end = -1;
        for (int i = 0; i < S.length(); i++) {
            //获取字符最后一次出现的index
            int index = last[S.charAt(i) - 'a'];
            //及时更新下面的字符出现的index
            if (index > max) {
                max = index;
            }

            //表明index到了当前i的位置，表示就是最后一个小片段的了
            if (max == i) {
                list.add(max - end);
                end = max;
            }
        }

        return list;
    }
}
