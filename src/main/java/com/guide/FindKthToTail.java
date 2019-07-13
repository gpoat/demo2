package com.guide;

import org.junit.Test;

/**
 * Created by Administrator on 2019/7/4.
 */
public class FindKthToTail {

    @Test
    public void test() {

    }

    private Node findKthToTail(Node head, int k) {
        if(head == null || k <= 0) {
            return null;
        }
        Node ahead = head, behind = head;
        for(int i = 0; i < k - 1; i++) {
            if(ahead.next != null) {
                ahead = head.next;
            } else {
                return null;
            }
        }
        while(ahead.next != null) {
            ahead = ahead.next;
            behind = behind.next;
        }
        return behind;
    }


}

class Node {
    int val;
    Node next;
}
