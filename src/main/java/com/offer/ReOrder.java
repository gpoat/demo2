package com.offer;

import org.junit.Test;

import java.util.Arrays;

/**
 * Created by Administrator on 2019/5/30.
 */
public class ReOrder {

    @Test
    public void test() {
        System.out.println(4 % 2);
        System.out.println(5 & 1);
        int[] array = {1,2,3,4,5,6};
        reOrder(array);
        System.out.println(Arrays.toString(array));
    }

    /**
     *
     * @param array
     */
    private void reOrder(int[] array) {

        if(array == null) {
            return;
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
            if(start < end) {
                int temp = array[start];
                array[start] = array[end];
                array[end] = temp;
            }
        }

    }

    /**
     *
     * @param n
     * @return true:even
     */
    private boolean isEven(int n) {
        return (n & 1) == 0;
    }


}
