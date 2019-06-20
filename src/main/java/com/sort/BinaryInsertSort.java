package com.sort;

import org.junit.Test;

import java.util.Arrays;

/**
 * Created by Administrator on 2019/6/20.
 * 空间复杂度：O(1)
 * 稳定性：稳定
 */
public class BinaryInsertSort {

    @Test
    public void test() {
        int[] data = {79, 9, 31, 33, 40, 33, 55, 11};
        System.out.println("排序前：" + Arrays.toString(data));
        binaryInsertSort(data);
        System.out.println("排序后：" + Arrays.toString(data));
    }

    /**
     * [9, 31, 33, 40, 79, 33, 55, 11]
     * @param data
     */
    private void binaryInsertSort(int[] data) {
        for(int i = 1; i < data.length; i++) {
            if(data[i] < data[i - 1]) {
                int temp = data[i];
                int low = 0;
                int high = i - 1;
                while(low <= high) {
                    int mid = (low + high) >> 1;
                    if(temp >= data[mid]) {
                        low = mid + 1;
                    } else {
                        high = mid - 1;
                    }
                }
                for(int j = i; j > low; j--) {
                    data[j] = data[j - 1];
                }
                data[low] = temp;
                System.out.println(Arrays.toString(data));
            }
        }
    }
}
