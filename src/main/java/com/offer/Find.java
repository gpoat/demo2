package com.offer;

import org.junit.Test;

/**
 * Created by Administrator on 2019/5/7.
 */
public class Find {

    @Test
    public void test() {

    }

    /**
     * 1 2 8 9
     * 2 4 9 12
     * 4 7 10 13
     * 6 8 11 15
     * @param array
     * @param number
     * @return
     */
    private boolean find(int[][] array, int number) {
        if(array == null) {
            throw new IllegalArgumentException("invalid input");
        }

        int row = 0;
        int column = array[0].length - 1;
        while(row < array.length && column >= 0) {
            if(array[row][column] == number) {
                return true;
            }
            if(array[row][column] > number) {
                column--;
            } else {
                row++;
            }
        }
        return false;
    }

}
