package com.lr.util;

import java.util.ArrayList;
import java.util.List;

/**
 * @author liurui
 * @date 2020/1/17 12:31
 */
public class Application {
    public static void main(String[] args) {
        String nums = "adfs";
        int[] list = new int[40];
        list[2] = 'a';
        int i = list[2];
        System.out.println(i);

        System.out.println(++i);

        System.out.println(nums.charAt(2));
    }



}
