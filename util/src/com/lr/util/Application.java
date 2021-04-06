package com.lr.util;

import java.util.*;

/**
 * @author liurui
 * @date 2020/1/17 12:31
 */
public class Application {

    public static void main(String[] args) {
        int[] arr = new int[]{3, 1, 5, 2, 6, 3, 9, 3, 9, 22, 12, 3, 7, 8};
        quickSort(arr, 0, arr.length - 1);
        for (int i : arr) {
            System.out.print(i+ " ");
        }
    }

    public static void quickSort(int[] arr, int begin, int end) {
        if (begin < end) {
            int[] partition = partition(arr, begin, end);
            quickSort(arr,begin,partition[0]-1);
            quickSort(arr, partition[1] + 1, end);

        }
    }

    public static int[] partition(int[] arr, int begin, int end) {
        int less = begin -1;
        int more = end;
        while (begin < more) {
            if (arr[begin] < arr[end]) {
                swap(arr,++less,begin++);
            } else if (arr[begin] > arr[end]) {
                swap(arr, begin, --more);
            }else {
                begin++;
            }
        }
        //swap
        swap(arr,more,end);
        return new int[]{less + 1, more};
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }


}
