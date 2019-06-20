package com.sort;

import com.offer.util.ArrayUtil;
import org.junit.Test;

import java.util.Arrays;

/**
 * Created by Administrator on 2019/6/18.
 * 时间复杂度：n2
 * 空间复杂度：O(1)
 * 稳定性：稳定
 */
public class BubbleSort {

    @Test
    public void test() {
        int[] data = {79, 9, 31, 40, 33, 55, 11};
        System.out.println("排序前：" + Arrays.toString(data));
        bubbleSort(data);
        System.out.println("排序后：" + Arrays.toString(data));
    }

    private void bubbleSort(int[] data) {
        int length = data.length;
        boolean flag = false;
        for(int i = 0; i < length - 1; i++) {
            for(int j = 0; j < length - 1 - i; j++) {
                if(data[j] > data[j + 1]) {
                    ArrayUtil.swap(data, j, j + 1);
                    flag = true;
                }
            }
            System.out.println(Arrays.toString(data));
            if(!flag) {
                break;
            }
        }
    }
}
