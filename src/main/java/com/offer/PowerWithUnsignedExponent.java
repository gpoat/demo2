package com.offer;

import org.junit.Test;

/**
 * Created by Administrator on 2019/4/8.
 */
public class PowerWithUnsignedExponent {

    @Test
    public void test() {
        System.out.println(5 & 1);
        System.out.println(Power(2, -3));
    }

    public double Power(double base, int exponent) {
        if(equals(base, 0.0) && exponent < 0) {
            throw new IllegalArgumentException("0的负次幂没有意义");
        }
        double result = 0.0;
        if(exponent < 0) {
            result = 1.0/PowerWithExponent(base, -exponent);
        } else {
            result = PowerWithExponent(base, exponent);
        }
        return result;
    }

    private double PowerWithExponent(double base, int exponent) {
        if(exponent == 0) {
            return 1;
        }
        if(exponent == 1) {
            return base;
        }

        double result = PowerWithExponent(base, exponent >> 1);

        result *= result;

        if((exponent & 1) == 1)
            result *= base;
        return result;
    }

    private boolean equals(double number1, double number2) {
        if((number1 - number2 > -0.0000001) && number1 - number2 < 0.0000001) {
            return true;
        } else {
            return false;
        }
    }
}
