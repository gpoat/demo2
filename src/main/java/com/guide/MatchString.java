package com.guide;

import org.junit.Test;

/**
 * Created by Administrator on 2019/7/4.
 */
public class MatchString {

    @Test
    public void test() {


    }

    private int violent(String source, String target) {
        int i = 0;
        int j = 0;
        int slength = source.length() - 1;
        int tlength = target.length() - 1;
        while(i < slength && j < tlength) {
            if(source.charAt(i) == target.charAt(j)) {
                i++;
                j++;
            } else {
                i = i - j + 1;
                j = 0;
            }
        }
        if(j == tlength) {
            return i - j;
        }
        return -1;
    }

    private int KMP(String source, String target) {
        return -1;
    }
    //a  b a b c
    private int[] getNext(String target) {
        int[] next = new int[target.length()];
        next[0] = -1;
        int pre = -1;
        int suf = 0;
        while(suf < target.length() - 1) {
            if(pre == -1 || target.charAt(pre) == target.charAt(suf)) {
                pre++;
                suf++;
                next[suf] = pre;
            } else {
                pre = next[pre];
            }
        }
        return null;
    }
}
