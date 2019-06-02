package com.offer;

import org.junit.Test;

/**
 * Created by Administrator on 2019/5/30.
 */
public class FindKToTail {

    @Test
    public void test() {
    }

    /**
     * 1 2 3 4 5 6
     * @param head
     * @param k
     * @return
     */
    private Node findKToTail(Node head, int k) {

        if(head == null || k == 0) {
            return null;
        }
        Node ahead = head;
        Node behind = head;
        for(int i = 0; i < k - 1; i++) {
            if(ahead.next != null) {
                ahead = ahead.next;
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
    public Node(int val, Node next) {
        this.val = val;
        this.next = next;
    }
}
