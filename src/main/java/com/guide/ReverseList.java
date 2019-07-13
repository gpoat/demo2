package com.guide;

import org.junit.Test;

/**
 * Created by Administrator on 2019/7/4.
 */
public class ReverseList {

    @Test
    public void test() {

    }

    /**
     * d p d p d p d p
     * @param head
     * @return
     */
    private Node reverseList(Node head) {

        if(head == null) {
            return null;
        }

        Node pre = null, node = head, next = null, reverseHead = null;
        while(node != null) {
            next = node.next;
            if(next == null) {
                reverseHead = node;
            }
            node.next = pre;
            pre = head;
            head = next;
        }

        return reverseHead;
    }
}
