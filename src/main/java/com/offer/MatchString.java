package com.offer;

import org.apache.commons.lang.StringUtils;
import org.junit.Test;

import java.util.Arrays;

/**
 * Created by Administrator on 2019/6/10.
 */
public class MatchString {

    @Test
    public void test() {
        System.out.println(violentMatch("AB CDED CDEF ABC", "DEF"));
        System.out.println(KMP("AB CDED CDEF ABC", "DEF"));
        String target = "DABCDABDE";
//        String target = "ABAB";
        System.out.println(Arrays.toString(getNext(target)));
    }

    /**
     * AB CDED CDEF ABC
     *    CDEF
     * @param source
     * @param target
     * @return
     */
    private int violentMatch(String source, String target) {

        if(source == null || source.length() == 0 || target == null || target.length() == 0) {
            return -1;
        }

        int slength = source.length();
        int plength = target.length();
        int i = 0;
        int j = 0;
        while(i < slength && j < plength) {
            if(source.charAt(i) == target.charAt(j)) {
                i++;
                j++;
            } else {
                i = i - (j - 1);
                j = 0;
            }
        }
        if(j == plength) {
            return i - j;
        }
        return -1;
    }

    /**
     * a b a c a b a b c
     * a b a b
     * @param source
     * @param target
     * @return
     */
    private int KMP(String source, String target) {

        if(StringUtils.isEmpty(source) || StringUtils.isEmpty(target)) {
            return -1;
        }

        int[] next = getNext(target);
        int sourceIndex = 0;
        int targetIndex = 0;
        while(sourceIndex < source.length() && targetIndex < target.length()) {
            if(targetIndex == -1 || source.charAt(sourceIndex) == target.charAt(targetIndex)) {
                sourceIndex++;
                targetIndex++;
            } else {
                targetIndex = next[targetIndex];
            }
        }

        if(targetIndex == target.length()) {
            return sourceIndex - targetIndex;
        }

        return -1;
    }

    /**   p s
     *    0 1
     *  A B D A B C D  A B D G D A B C D  A B D E
     *      D A B C D  A B D E
     *     -1 0 0 0 0  1 2 3 1
     *     -1 0 0 0 -1 0 0 3 1
     * A B A B
     * @param target
     * @return
     */
    private int[] getNext(String target) {
        char[] targetCharArray = target.toCharArray();
        int[] next = new int[targetCharArray.length];
        next[0] = -1;
        int prefixIndex = -1;
        int suffixIndex = 0;
        while(suffixIndex < target.length() - 1) {
            if(prefixIndex == -1 || targetCharArray[prefixIndex] == targetCharArray[suffixIndex]) {
                if(targetCharArray[++prefixIndex] != targetCharArray[++suffixIndex]) {
                    next[suffixIndex] = prefixIndex;
                } else {
                    next[suffixIndex] = next[prefixIndex];
                }
            } else {
                prefixIndex = next[prefixIndex];
            }
        }
        return next;
    }

}
