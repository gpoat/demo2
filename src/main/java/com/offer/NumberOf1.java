package com.offer;

import org.junit.Test;

/**
 * Created by Administrator on 2019/4/3.
 */
public class NumberOf1 {

    @Test
    public void test() {
        System.out.println(9 & 8);
        System.out.println(numberOf1Slow(9));
    }

    /**
     * 1001
     * 1100
     * 1011
     * 1010
     * 1010
     *
     * 1010
     * 1001
     * 1000
     * @param number
     * @return
     */
    private int numberOf1Slow(int number) {

        int count = 0;
        while(number != 0) {
            count++;
            number = number & (number - 1);
        }

        return count;
    }

}
