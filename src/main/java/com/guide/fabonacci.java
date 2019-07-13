package com.guide;

import org.junit.Test;

/**
 * Created by Administrator on 2019/7/4.
 */
public class fabonacci {

    @Test
    public void test() {
        System.out.println(fibonacciFast(6));
        System.out.println(fibonacciSlow(6));
    }

    /**
     * 1 1 2 3 5 8
     * @param n
     * @return
     */
    private int fibonacciFast(int n) {
        if(n <= 0) {
            return  0;
        }
        if(n == 1|| n == 2) {
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

    private int fibonacciSlow(int n) {
        if(n <= 0) {
            return 0;
        }
        if(n == 1 || n == 2) {
            return 1;
        }
        return fibonacciSlow(n - 1) + fibonacciSlow(n - 2);

    }
}
