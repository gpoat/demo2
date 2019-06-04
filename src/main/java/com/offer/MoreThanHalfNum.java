package com.offer;

import org.junit.Test;

/**
 * Created by Administrator on 2019/6/3.
 */
public class MoreThanHalfNum {

    @Test
    public void test() {
        int cnt = 1;
        System.out.println(cnt = 3 == 0?cnt:0);
        int[] nums = {1,2,2};
        System.out.println(MoreThanHalfNum(nums));
    }

    /**
     * 1,2,2
     * @return
     */
    public int MoreThanHalfNum(int[] nums) {
        if(nums == null || nums.length == 0){
            return 0;
        }
        int times = 1;
        int result = nums[0];
        for(int i = 1; i < nums.length; i++) {
            if(times == 0) {
                result = nums[i];
                times = 1;
            } else if(result == nums[i]) {
                times++;
            } else {
                times--;
            }
        }
        times = 0;
        for(int val : nums) {
            if(result == val) {
                times++;
            }
        }
        return times << 1 > nums.length?result:0;
    }
}
