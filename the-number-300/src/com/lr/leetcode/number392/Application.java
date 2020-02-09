package com.lr.leetcode.number392;

/**
 * @author liurui
 * @date 2020/2/8 20:19
 */
public class Application {
    public boolean isSubsequence(String s, String t) {
        int index = -1;
        for (char c : s.toCharArray()) {
            //从index+1开始找，如果找到了就返回c的位置，没找到就返回-1；
            index = t.indexOf(c, index + 1);
            if (index == -1) {
                return false;
            }
        }

        return true;
    }
}
