package com.offer;

import org.junit.Test;

import java.util.Arrays;

/**
 * Created by Administrator on 2019/5/30.
 * 找出数组中任一重复的数字
 */
public class Duplicate {

    @Test
    public void test() {
        int[] nums = {2, 3, 1, 0, 2, 5};
        int[] duplication = new int[nums.length];
        System.out.println(duplicate(nums, 6, duplication));
        System.out.println(Arrays.toString(duplication));
    }

    /**
     * 2 3 1 0 2 5 3
     * @param nums
     * @param duplication
     * @return
     */
    private boolean duplicate(int[] nums, int length, int[] duplication) {
        if(nums == null || length == 0) {
            return false;
        }
        for(int i = 0; i < length; i++) {
            if(nums[i] > length - 1 || nums[i] < 0) {
                return false;
            }
        }
        for(int i = 0; i < length; i++) {
            while(nums[i] != i) {
                if(nums[i] == nums[nums[i]]) {
                    duplication[0] = nums[i];
                    return false;
                }
                swap(nums, i, nums[i]);
            }
        }
        return true;
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

}
