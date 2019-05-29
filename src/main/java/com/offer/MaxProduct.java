package com.offer;

import org.junit.Test;

/**
 * Created by Administrator on 2019/4/3.
 */
public class MaxProduct {

    @Test
    public void test() {

    }

    private int maxProduct(int length) {

        if(length <= 0) {
            throw new IllegalArgumentException("invalid input");
        }

        if(length == 1) {
            return 0;
        }

        if(length == 2) {
            return 1;
        }

        if(length == 3) {
            return 2;
        }
        int[] products = new int[length + 1];
        products[0] = 0;
        products[1] = 1;

        return 0;
    }

}
