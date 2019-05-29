package com.offer;

import org.junit.Test;

/**
 * Created by Administrator on 2019/4/3.
 */
public class MinNumberInRotateArray {

    @Test
    public void test() {

        int[] numbers = {3, 4, 5,2, 2};
        System.out.println(minNumberInRotateArray(numbers));


    }
    /**
     * 3 4 5 1 2
     * 1 1 1 0 1
     * 1 1 1 0 1
     */
    private int minNumberInRotateArray(int[] array) {
        if(array == null || array.length == 0) {
            throw new IllegalArgumentException("invalid input");
        }
        int index1 = 0;
        int index2 = array.length - 1;
        int indexMid = index1;
        while(array[index1] >= array[index2]) {

            if(index2 - index1 == 1) {
                indexMid = index2;
                break;
            }
            indexMid = (index1 + index2)/2;
            if(array[index1] == array[index2] && array[indexMid] == array[index1]) {
                int result = array[index1];
                for(int i = index1 + 1; i <= index2; i++) {
                    if(array[index1] > array[i]) {
                        result = array[i];
                    }
                }
                return result;
            }
            if(array[indexMid] >= array[index1]) {
                index1 = indexMid;
            } else if(array[indexMid] <= array[index2]){
                index2 = indexMid;
            }

        }
        return array[indexMid];

    }

    /**
     * 3 4 5 1 2
     * 1 1 1 0 1
     * 1 1 1 0 1
     */
    private int minNumberInRotateArray2(int[] array) {

        if(array == null || array.length == 0) {
            throw new IllegalArgumentException("input cant be null");
        }
        int index1 = 0;
        int index2 = array.length - 1;
        int indexMid = index1;
        while(array[index1] >= array[index2]) {
            if(index2 - index1 == 1) {
                indexMid = index2;
                break;
            }
            indexMid = (index1 + index2) / 2;
            if(array[index1] == array[index2] && array[indexMid] == array[index1]) {
            }

            if(array[indexMid] >= array[index1]) {
                index1 = indexMid;
            } else if(array[indexMid] <= array[index2]) {
                index2 = indexMid;
            }


        }

        return array[indexMid];

    }


}
