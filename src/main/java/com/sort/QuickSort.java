package com.sort;

import com.offer.util.ArrayUtil;
import org.junit.Test;

import java.util.Arrays;

/**
 * Created by Administrator on 2019/6/18.
 */
public class QuickSort {

    @Test
    public void test() {
        int[] data = {79, 9, 31, 40, 33, 55, 11};
        System.out.println("排序前：" + Arrays.toString(data));
        quickSort(data);
        System.out.println("排序后：" + Arrays.toString(data));
    }

    private void quickSort(int[] data) {
        int start = 0;
        int end = data.length - 1;
        subSort(data, start, end);

    }

    private void subSort(int[] data, int start, int end) {
        if (start >= end) {
             return;
        }
        int index = partition(data, start, end);
        subSort(data, start, index - 1);
        subSort(data, index + 1, end);
    }

    private int partition(int[] data, int start, int end) {

        int base = data[start];
        int i = start;
        int j = end + 1;
        while(true) {
            while(i < end && data[++i] <= base);
            while(j > start && data[--j] >= base);
            if(i >= j) {
                break;
            }
            ArrayUtil.swap(data, i, j);
        }
        ArrayUtil.swap(data, start, j);
        return j;
    }
}
