package com.sort;

import com.offer.util.ArrayUtil;
import org.junit.Test;

import java.util.Arrays;

/**
 * Created by Administrator on 2019/6/18.
 * 时间复杂度：n * log2 N
 * 空间复杂度:O(1)
 * 稳定性:不稳定
 */
public class HeapSort {

    @Test
    public void test() {
        System.out.println(5 >>> 1);
        System.out.println(5 >> 1);
        System.out.println(-16 >> 1);
        System.out.println(-16 << 1);
        System.out.println(-5 >>> 1);
        int[] data = {79, 9, 31, 40, 33, 55, 11};
        System.out.println("排序前：" + Arrays.toString(data));
        HeapSort(data);
        System.out.println("排序后：" + Arrays.toString(data));
    }

    private void HeapSort(int[] data) {
        System.out.println("开始排序");
        int length = data.length;
        for(int i = 0; i < length; i++) {
            buildMaxHeap(data, length - 1 - i);
            ArrayUtil.swap(data, 0, length - 1 - i);
            System.out.println(Arrays.toString(data));
        }
    }

    private void buildMaxHeap(int[] data, int lastIndex) {

        for(int i = (lastIndex - 1) >> 1; i >= 0; i--) {
            int k = i;
            int biggerIndex = (i << 1) + 1;
            while(biggerIndex <= lastIndex) {
                if(biggerIndex < lastIndex) {
                    if(data[biggerIndex] < data[biggerIndex + 1]) {
                        biggerIndex++;
                    }
                }
                if(data[k] < data[biggerIndex]) {
                    ArrayUtil.swap(data, k, biggerIndex);
                    k = biggerIndex;
                } else {
                    break;
                }
            }

        }
    }
}
