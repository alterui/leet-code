package com.lr.leetcode.number451;

/**
 * @author liurui
 * @date 2020/1/13 21:11
 *
 * 给定一个字符串，请将字符串里的字符按照出现的频率降序排列。
 *
 * 示例 1:
 *
 * 输入:
 * "tree"
 *
 * 输出:
 * "eert"
 *
 * 解释:
 * 'e'出现两次，'r'和't'都只出现一次。
 * 因此'e'必须出现在'r'和't'之前。此外，"eetr"也是一个有效的答案。
 * 示例 2:
 *
 * 输入:
 * "cccaaa"
 *
 * 输出:
 * "cccaaa"
 *
 * 解释:
 * 'c'和'a'都出现三次。此外，"aaaccc"也是有效的答案。
 * 注意"cacaca"是不正确的，因为相同的字母必须放在一起。
 * 示例 3:
 *
 * 输入:
 * "Aabb"
 *
 * 输出:
 * "bbAa"
 *
 * 解释:
 * 此外，"bbaA"也是一个有效的答案，但"Aabb"是不正确的。
 * 注意'A'和'a'被认为是两种不同的字符。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/sort-characters-by-frequency
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
import java.util.*;
public class Application {
    /**
     * 使用桶，桶的index表示字母出现的次数。
     * @param s
     * @return
     */
    public String frequencySort(String s) {
        Map<Character,Integer> map = new HashMap<>();
        char[] chars = s.toCharArray();
        for(int i = 0 ;i<chars.length;i++){
            map.put(chars[i],map.getOrDefault(chars[i],0)+1);
        }

        List[] buckets = new List[chars.length+1];
        for(char key : map.keySet()){
            int index = map.get(key);
            if(buckets[index]==null){
                buckets[index] = new ArrayList<>();
            }
            buckets[index].add(key);
        }

        StringBuilder sb = new StringBuilder();

        for(int i = buckets.length-1;i>=0;i--){
            if(buckets[i]==null){
                continue;
            }
            for(int j = 0 ;j<buckets[i].size();j++){
                for(int k = i;k>0;k--){
                    sb.append(buckets[i].get(j));
                }
            }
        }

        return sb.toString();
    }
}
