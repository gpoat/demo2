package com.offer;

import org.junit.Test;

/**
 * Created by Administrator on 2019/5/31.
 * 反转链表
 */
public class ReverseList {

    @Test
    public void test() {

    }

    /**
     * pdn pdn
     * @param head
     * @return
     */
    private Node reverseList(Node head) {

        if(head == null) {
            return null;
        }
        Node pre = null;
        Node node = head;
        Node reverseHead = null;
        while(node != null) {
            Node next = node.next;
            if(next == null) {
                reverseHead = node;
            }
            node.next = pre;
            pre = node;
            node = next;
        }
        return reverseHead;
    }
}
