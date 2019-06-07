package com.offer;

import org.junit.Test;

import java.util.Stack;

/**
 * Created by Administrator on 2019/6/5.
 */
public class StackWithMin{

    @Test
    public void test() {
        StackWithMin stack = new StackWithMin();
        stack.push(3);
        stack.push(4);
        stack.push(1);
        stack.push(2);
        System.out.println(stack.min());
    }

    private Stack<Integer> minStack = new Stack<Integer>();

    private Stack<Integer> dataStack = new Stack<Integer>();

    public void push(Integer item) {
        dataStack.push(item);
        if(minStack.isEmpty() || item < minStack.peek()) {
            minStack.push(item);
        } else {
            minStack.push(minStack.peek());
        }
    }

    public Integer pop() {
        if(dataStack.isEmpty() || minStack.isEmpty()) {
            return null;
        }
        minStack.pop();
        return dataStack.pop();
    }

    public Integer min() {
        if(minStack.isEmpty()) {
            return null;
        } else {
            return minStack.peek();
        }
    }




}
