package com.offer;

import com.offer.util.ArrayUtil;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 * Created by Administrator on 2019/6/3.
 */
public class Permutation {

    @Test
    public void test() {
        System.out.println(permutation("abc"));
    }

    /**
     * @param original
     * @return
     */
    private ArrayList<String> permutation(String original) {
        if(original == null || original.length() == 0) {
            return null;
        }
        ArrayList<String> result = new ArrayList<String>();
        permutation(original.toCharArray(), 0, result);
        return result;
    }

    /**
     * a b
     * b a
     * @param chars
     * @param begin
     * @param result
     */
    private void permutation(char[] chars, int begin, ArrayList<String> result) {
        if(chars == null || chars.length == 0 || begin < 0 || begin >= chars.length) {
            return;
        }
        if(begin == chars.length - 1) {
            result.add(String.valueOf(chars));
        }
        for(int i = begin; i < chars.length; i++) {
            swap(chars, begin, i);
            permutation(chars, begin + 1, result);
            swap(chars, i, begin);
        }
    }

    private void swap(char[] array, int a, int b) {
        char t = array[a];
        array[a] = array[b];
        array[b] = t;
    }
}
