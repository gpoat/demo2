package com.offer;

import org.junit.Test;

/**
 * Created by Administrator on 2019/5/31.
 */
public class MergeOrderedLinkedList {

    @Test
    public void test() {
        Node node4 = new Node(7, null);
        Node node3 = new Node(5, node4);
        Node node2 = new Node(3, node3);
        Node node1 = new Node(1, node2);
        Node node8 = new Node(8, null);
        Node node7 = new Node(6, node8);
        Node node6 = new Node(4, node7);
        Node node5 = new Node(2, node6);
        Node mergedHeadNode =  mergerOrderedLindedListIterator(node1, node5);
        while(mergedHeadNode != null) {
            System.out.println(mergedHeadNode.val);
            mergedHeadNode = mergedHeadNode.next;
        }
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

    /**
     * 1 3 5 7
     * 2 4 6 8
     * @param head1
     * @param head2
     * @return
     */
    private Node mergerOrderedLindedListIterator(Node head1, Node head2) {
        if(head1 == null) {
            return head2;
        } else if(head2 == null) {
            return head1;
        }
        Node mergedHeadNode = new Node();
        Node cursor = mergedHeadNode;
        while(head1 != null && head2 != null) {
            if(head1.val < head2.val) {
                cursor.next = head1;
                head1 = head1.next;
            } else {
                cursor.next = head2;
                head2 = head2.next;
            }
            cursor = cursor.next;
        }
        if(head1 == null) {
            cursor.next = head2;
        }
        if(head2 == null) {
            cursor.next = head1;
        }
        return mergedHeadNode.next;
    }

}
