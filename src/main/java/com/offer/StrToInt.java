package com.offer;

import org.junit.Test;

/**
 * Created by Administrator on 2019/5/27.
 */
public class StrToInt {

    @Test
    public void test() {
        System.out.println(strToInt("-12345"));
    }


    private static int strToInt(String str) {
        if(str == null || str.length() == 0) {
            return 0;
        }
        boolean isNegative = str.charAt(0) == '-';
        int ret = 0;
        for(int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if(i == 0 && (c == '+' || c == '-')) {
                continue;
            }
            if(c < '0' || c > '9') {
                return 0;
            }
            ret = ret * 10 + (c - '0');
        }
        return isNegative?-ret:ret;
    }
}
