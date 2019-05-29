package com.offer;

import org.junit.Test;

/**
 * Created by Administrator on 2019/5/27.
 */
public class Sum1n {

    @Test
    public void test() {
        System.out.println(sum1n(4));
    }

    private int sum1n(int n) {
        int sum = n;
        boolean b = (n > 0) && (sum += sum1n(sum - 1)) > 0;
        return sum;
    }
}
