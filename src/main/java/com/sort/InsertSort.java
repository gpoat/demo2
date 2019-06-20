package com.sort;

import org.junit.Test;

import java.util.Arrays;

/**
 * Created by Administrator on 2019/6/20.
 */
public class InsertSort {

    @Test
    public void test() {
        int[] data = {79, 9, 31, 40, 33, 55, 11};
        System.out.println("排序前：" + Arrays.toString(data));
        insertSort(data);
        System.out.println("排序后：" + Arrays.toString(data));
    }

    private void insertSort(int[] data) {
        int i = 0;
        for(i = 1; i < data.length; i++) {
            int temp = data[i];
            if(data[i] < data[i - 1]) {
                int j = i - 1;
                for(; j >= 0 && data[j] > temp; j--) {
                    data[j + 1] = data[j];
                }
                data[j + 1] = temp;
            }
            System.out.println(Arrays.toString(data));
        }

    }
}
