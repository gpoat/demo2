package com.offer.util;

/**
 * Created by Administrator on 2019/6/3.
 */
public class ArrayUtil {

    public static void swap(Object[] array, int a, int b) {
        Object t = array[a];
        array[a] = array[b];
        array[b] = t;
    }

    public static void swap(int[] array, int a, int b) {
        int t = array[a];
        array[a] = array[b];
        array[b] = t;
    }
}
