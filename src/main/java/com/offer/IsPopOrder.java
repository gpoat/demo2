package com.offer;

import org.junit.Test;

import java.util.Stack;

/**
 * Created by Administrator on 2019/6/8.
 */
public class IsPopOrder {

    @Test
    public void test() {
        int[] pushSequence = {1,2,3,4,5};
        int[] popSequence = {4,5,3,1,2};
        System.out.println(isPopOrder(pushSequence, popSequence));
    }

    /**
     * 1 2 3 4 5
     * 4 5 3 1 2
     * @param pushSequence
     * @param popSequence
     * @return
     */
    private boolean isPopOrder(int[] pushSequence, int[] popSequence) {
        if(pushSequence == null || pushSequence.length == 0 || popSequence == null || popSequence.length == 0) {
            return false;
        }
        Stack<Integer> stack = new Stack<Integer>();
        int popIndex = 0;
        int popRange = popSequence.length;
        for(int pushIndex = 0; pushIndex < pushSequence.length; pushIndex++) {
            stack.push(pushSequence[pushIndex]);
            while(popIndex < popRange && !stack.isEmpty() && stack.peek() == popSequence[popIndex]) {
                stack.pop();
                popIndex++;
            }
        }
        return stack.isEmpty();
    }
}
