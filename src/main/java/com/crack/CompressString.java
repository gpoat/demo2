package com.crack;

import org.junit.Test;

/**
 * Created by Administrator on 2019/5/31.
 */
public class CompressString {

    @Test
    public void test() {
        System.out.println(compressString("aaabbbbccccccdd"));
    }

    /**
     * example aaabbbbccccccdd
     * @param str
     * @return
     */
    private StringBuilder compressString(String str) {
        if(str == null || str.length() == 0) {
            return null;
        }
        StringBuilder result = new StringBuilder();
        int count = 1;
        char last = str.charAt(0);
        for(int i = 1; i < str.length(); i++) {
            if(last == str.charAt(i)) {
                count++;
            } else {
                result.append(last).append(count);
                count = 1;
                last = str.charAt(i);
            }
        }

        return result.append(last).append(count);
    }
}
