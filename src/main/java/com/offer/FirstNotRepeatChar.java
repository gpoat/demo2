package com.offer;

import org.junit.Test;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by Administrator on 2019/6/21.
 */
public class FirstNotRepeatChar {

    @Test
    public void test() {
        String str = "google";
        System.out.println(firstNotRepeatChar(str));
    }

    /**
     * google
     * oog
     * @param str
     * @return
     */
    private char firstNotRepeatChar(String str) {
        if(str.isEmpty()) {
            return '#';
        }
        char[] charArray = str.toCharArray();
        int[] counts = new int[256];
        char ch = ' ';
        for(int i = 0; i < charArray.length; i++) {
            ch = charArray[i];
            counts[ch]++;
        }
        for(int j = 0; j < charArray.length; j++) {
            ch = charArray[j];
            if(counts[ch] == 1) {
                return ch;
            }
        }
        return '#';
    }
}
