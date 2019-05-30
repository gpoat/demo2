package com.offer;

import org.junit.Test;

/**
 * Created by Administrator on 2019/5/31.
 */
public class MergeOrderedLinkedList {

    @Test
    public void test() {

    }

    /**
     * 1 3 5 7
     * 2 4 6 8
     * @param head1
     * @param head2
     * @return
     */
    private Node mergerOrderedLinkedList(Node head1, Node head2) {

        if(head1 == null) {
            return head2;
        } else if(head2 == null) {
            return head1;
        }
        Node mergedHeadNode = null;

        if(head1.val < head2.val) {
            mergedHeadNode = head1;
            mergedHeadNode.next = mergerOrderedLinkedList(head1.next, head2);
        } else {
            mergedHeadNode = head2;
            mergedHeadNode.next = mergerOrderedLinkedList(head1, head2.next);
        }

        return mergedHeadNode;
    }

}
