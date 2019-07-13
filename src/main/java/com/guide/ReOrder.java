package com.guide;

import org.junit.Test;

import java.util.Arrays;

/**
 * Created by Administrator on 2019/7/4.
 */
public class ReOrder {

    @Test
    public void test() {
        int[] array = {1,2,3,4,5,6,7,8};
        System.out.println(Arrays.toString(reOrder(array)));
    }

    /**
     * 1 2 3 4 5 6 7 8
     * @param array
     * @return
     */
    private int[] reOrder(int[] array) {
        if(array == null || array.length == 0) {
            return null;
        }
        int start = 0;
        int end = array.length - 1;
        while(start < end) {
            while(start < end && !isEven(array[start])) {
                start++;
            }
            while(start < end && isEven(array[end])) {
                end--;
            }
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;
        }
        return array;
    }

    private boolean isEven(int i) {
        return (i & 1) == 0;
    }
}
