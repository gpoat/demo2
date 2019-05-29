package com.offer;

import org.junit.Test;

import java.util.Stack;

/**
 * Created by Administrator on 2019/5/10.
 */
public class PrintListReserve {

    @Test
    public void test() {

    }

    private void printListReserve(ListNode head) {
        if(head == null) {
            throw new IllegalArgumentException("invalid input");
        }
        Stack<ListNode> stack = new Stack<ListNode>();
        if(head != null) {
            stack.push(head);
            head = head.next;
        }
        while(stack != null) {
            System.out.println(stack.pop().data);
        }
    }

    private void printListReserveRecursion(ListNode head) {

        if(head == null) {
            throw new IllegalArgumentException("invalid input");
        }

        if(head.next != null) {
            printListReserveRecursion(head.next);
        }
        System.out.println(head.data);

    }
}

class ListNode {

    Object data;

    ListNode next;
}
