package com.offer;

import org.junit.Test;

/**
 * Created by Administrator on 2019/5/25.
 */
public class SumSolution {

    @Test
    public void test() {
        System.out.println(sum_solution(22, 13));
    }

    /**
     * a 10110 22
     * b 01101 13
     * s 11011
     * c  1000
     * @return
     */
    private int sum_solution(int a, int b) {
        int sum, carray;
        do{
          sum = a ^ b;
          carray = (a & b) << 1;
          a = sum;
          b = carray;
            System.out.println(Integer.toBinaryString(sum));
            System.out.println(Integer.toBinaryString(carray));
        } while(carray != 0);
        return sum;
    }
}
