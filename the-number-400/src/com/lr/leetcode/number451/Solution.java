package com.lr.leetcode.number451;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.PriorityQueue;

/**
 * @author liurui
 * @date 2020/1/17 16:07
 */
public class Solution {

    /**
     * 使用大根堆，大根堆盛放Map.Entry。  map的key为字母，value为频率。
     * @param s
     * @return
     */
    public String frequencySort(String s) {
        Map<Character,Integer> map = new HashMap<>();
        char[] chars = s.toCharArray();
        for(int i = 0 ;i<chars.length;i++){
            map.put(chars[i],map.getOrDefault(chars[i],0)+1);
        }

        PriorityQueue<Map.Entry<Character,Integer>> queue = new PriorityQueue<>((x,y)->y.getValue()-x.getValue());

        for(Map.Entry<Character,Integer> entry: map.entrySet()){
            queue.add(entry);
        }


        StringBuilder sb = new StringBuilder();

        while(!queue.isEmpty()){
            Map.Entry<Character,Integer> result =  queue.poll();
            for(int i = 0 ;i< result.getValue();i++){
                sb.append(result.getKey());
            }
        }



        return sb.toString();
    }
}
