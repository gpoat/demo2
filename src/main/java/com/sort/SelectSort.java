package com.sort;

import com.offer.util.ArrayUtil;
import org.junit.Test;

import java.util.Arrays;

/**
 * Created by Administrator on 2019/6/18.
 * 时间复杂度：n2
 * 空间复杂度：O(1)
 * 稳定性：不稳定
 */
public class SelectSort {

    @Test
    public void test() {
        int[] data = {79, 9, 31, 40, 33, 55, 11};
        System.out.println("排序前：" + Arrays.toString(data));
        selectSort(data);
        System.out.println("排序后：" + Arrays.toString(data));
    }

    private void selectSort(int[] data) {
        int length = data.length;
        for(int i = 0; i < length - 1; i++) {
            int minIndex = i;
            for(int j = i + 1; j < length; j++) {
                if(data[minIndex] > data[j]) {
                    minIndex = j;
                }
            }
            if(minIndex != i) {
                ArrayUtil.swap(data, i, minIndex);
            }
            System.out.println(Arrays.toString(data));
        }


    }
}
