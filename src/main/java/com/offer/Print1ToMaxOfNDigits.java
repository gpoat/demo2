package com.offer;

import org.junit.Test;

import java.util.Arrays;

/**
 * Created by Administrator on 2019/4/8.
 */
public class Print1ToMaxOfNDigits {
    /**
     * array[0] = 0, array[1] = 0... array
     */
    @Test
    public void test() {
        printToMaxOfNDigits(3);
        int[] i = new int[3];
        System.out.println(i.length);
    }

    private void printTest(int[] array, int n) {
        for(int i = 0; i < 10; i++) {
            if (n != array.length) {
                array[n] = i;
                printTest(array, n + 1);
            }
        }
        System.out.println(Arrays.toString(array));
    }

    private void printToMaxOfNDigits(int n) {
        int[] array = new int[n];
        if(n <= 0) {
            return;
        }
        printArray(array, 0);
    }

    private void printArray(int[] array, int n) {
        for(int i = 0; i < 10; i++) {
            if(n != array.length) {
                array[n] = i;
                printArray(array, n + 1);
            } else {
                boolean isFirstNo0 = false;
                for(int j = 0; j < array.length; j++) {
                    if(array[j] != 0) {
                        System.out.print(array[j]);
                        if(!isFirstNo0) {
                            isFirstNo0 = true;
                        }
                    } else {
                        if(isFirstNo0) {
                            System.out.print(array[j]);
                        }
                    }
                }
                System.out.println();
                return;
            }
        }
    }
}
