package com.lr.leetcode.number242;

/**
 * @author liurui
 * @date 2020/1/31 23:10
 */
public class Application {
    /**
     * 借助哈希表
     * 'c' - 'a' = 2
     *
     * 遍历'ssafsad' 把-a得到index的数组的value++
     * 然后再遍历另外一个string，把对应index的value--
     * 如果新数组的值全部都为0就是true
     * @param s
     * @param t
     * @return
     */
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        int[] counts = new int[26];

        for (int i = 0; i < s.length(); i++) {
            counts[s.charAt(i) - 'a']++;
        }

        for (int i = 0; i < t.length(); i++) {
            counts[t.charAt(i) - 'a']--;
        }

        for (int count : counts) {
            if (count != 0) {
                return false;
            }
        }

        return true;

    }
}
