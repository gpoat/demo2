package com.guide;

import org.junit.Test;

/**
 * Created by Administrator on 2019/7/4.
 */
public class PowerWithExponent {

    @Test
    public void test() {
        System.out.println(Power(3.0, 2));
    }

    private double Power(double base, int exponent) {
        if(equals(base, 0.0) && exponent < 0) {
            throw new IllegalArgumentException("invalid input");
        }
        double result = 0.0;
        if(exponent < 0) {
            result = 1.0/getPower(base, exponent);
        } else {
            result = getPower(base, exponent);
        }
        return result;
    }

    private double getPower(double base, int exponent) {
        if(exponent == 0) {
            return 1;
        }
        if(exponent == 1) {
            return base;
        }
        double result = getPower(base, exponent >> 1);
        result *= result;
        if((exponent & 1) == 1) {
            result *= base;
        }
        return result;
    }


    private boolean equals(double num1, double num2) {
        return num1 - num2 > -0.0000001 && num1 - num1 < 0.0000001;
    }
}
