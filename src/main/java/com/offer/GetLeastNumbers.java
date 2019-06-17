package com.offer;

import com.offer.util.ArrayUtil;
import org.junit.Test;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

/**
 * Created by Administrator on 2019/6/8.
 */
public class GetLeastNumbers {

    @Test
    public void test() {
        System.out.println(1 >> 1);
//        int[] numbers = {8,6,9,1,10,3};
        int[] numbers = {4,5,1,6,2,7,3,8};
        System.out.println(getLeastNumbers(numbers, 4));
        System.out.println(getLeastNumbersWithHeap(numbers, 4));
    }

    private List<Integer> getLeastNumbers(int [] nums, int k) {
        List<Integer> result = new ArrayList<Integer>();
        if(nums == null || nums.length == 0 || k >= nums.length || k < 0) {
            return result;
        }
        findKthSmallest(nums, k - 1);
        for(int i = 0; i < k; i++) {
            result.add(nums[i]);
        }
        return result;
    }

    private void findKthSmallest(int[] nums, int k) {
        int start = 0;
        int end = nums.length - 1;
        while(start < end) {
            int index = partition(nums, start, end);
            if(index == k) {
                break;
            } else if(index > k) {
                end = index - 1;
            } else {
                start = index + 1;
            }
        }
    }

    /**
     * 123465
     * 12
     * 132
     * 1324
     * 13254
     * 132546
     * @param nums
     * @param start
     * @param end
     * @return
     */
    private int partition(int[] nums, int start, int end) {
        int lowCursor = start;
        int highCursor = end + 1;
        int partition = nums[start];
        while(true) {
            while(lowCursor != end && nums[++lowCursor] < partition);
            while(highCursor != start && nums[--highCursor] > partition);
            if(lowCursor >= highCursor) {
                break;
            }
            ArrayUtil.swap(nums, lowCursor, highCursor);
        }
        ArrayUtil.swap(nums, start, highCursor);
        return highCursor;
    }

    private ArrayList<Integer> getLeastNumbersWithHeap(int[] data, int k) {
        if(data == null || data.length == 0 || k < 0 || k > data.length) {
            return null;
        }
        PriorityQueue<Integer> maxHeap = new PriorityQueue<Integer>(new Comparator<Integer>() {
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });
        for(int num : data) {
            maxHeap.add(num);
            if(maxHeap.size() > k) {
                maxHeap.poll();
            }
        }
        return new ArrayList<Integer>(maxHeap);
    }


}
