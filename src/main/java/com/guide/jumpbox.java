package com.guide;

import org.junit.Test;

/**
 * Created by Administrator on 2019/7/4.
 */
public class jumpbox {

    @Test
    public void test() {
        System.out.println(jumFlow(6));
        System.out.println(jumFlow(6));
    }

    private int jumFlow(int n) {
        if(n <= 0) {
            return 0;
        }
        if(n == 1 || n == 2) {
            return 1;
        }
        int first = 1;
        int second = 1;
        int third = 0;
        for(int i = 3; i <= n; i++) {
            third = first + second;
            first = second;
            second = third;
        }
        return third;
    }

    private int jumpFloorII(int n) {
        if(n <= 0) {
            return 0;
        }
        return 1 << --n;
    }
}
