package com.lr.leetcode.number406;


import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * @author liurui
 * @date 2020/1/21 21:51
 *假设有打乱顺序的一群人站成一个队列。 每个人由一个整数对(h, k)表示，其中h是这个人的身高，k是排在这个人前面且身高大于或等于h的人数。 编写一个算法来重建这个队列。
 *
 * 注意：
 * 总人数少于1100人。
 *
 * 示例
 *
 * 输入:
 * [[7,0], [4,4], [7,1], [5,0], [6,1], [5,2]]
 *
 * 输出:
 * [[5,0], [7,0], [5,2], [6,1], [4,4], [7,1]]
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/queue-reconstruction-by-height
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Solution {

    /**
     * 贪心思想。先让高个子排好，然后小个子就可以随意插队了
     * @param people
     * @return
     */
    public int[][] reconstructQueue(int[][] people) {
            Arrays.sort(people,(o1,o2)->o1[0]==o2[0] ? o1[1] - o2[1] : o2[0] - o1[0]);

            List<int[]> list = new LinkedList<>();

            for(int[] nums : people){
                list.add(nums[1],nums);
            }
            return list.toArray(new int[list.size()][2]);
        }

}
