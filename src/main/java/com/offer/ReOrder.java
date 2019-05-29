package com.offer;

import org.junit.Test;

/**
 * Created by Administrator on 2019/5/30.
 */
public class ReOrder {

    @Test
    public void test() {
        System.out.println(4 % 2);
        System.out.println(5 & 1);
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
            while(start < end ) {

            }
        }

    }

    private boolean isEven(int n) {
        return (n & 1) == 0;
    }


}
