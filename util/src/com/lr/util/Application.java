package com.lr.util;

import java.util.*;

/**
 * @author liurui
 * @date 2020/1/17 12:31
 */
public class Application {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(4);

        list.toArray();

        System.out.println(list.toArray());
    }
}
