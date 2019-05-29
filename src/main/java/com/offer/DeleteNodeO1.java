package com.offer;

import org.junit.Test;

/**
 * Created by Administrator on 2019/5/28.
 */
public class DeleteNodeO1 {

    @Test
    public void test() {
        ListNode node4 = new ListNode(4, null);
        ListNode node3 = new ListNode(3, node4);
        ListNode node2 = new ListNode(2, node3);
        ListNode node1 = new ListNode(1, node2);
        ListNode head = deleteNodeO1(node1, node4);
        for(ListNode<Integer> x = head; x !=null; x = x.next) {
            System.out.println(x.data);
        }
    }

    /**
     * 11 22 33 44
     * @param head
     * @param deleteNode
     * @return
     */
    private ListNode deleteNodeO1(ListNode head, ListNode deleteNode) {
        if(head == null || deleteNode == null) {
            return null;
        }

        if(deleteNode.next != null) {
            ListNode nextNode = deleteNode.next;
            deleteNode.data = deleteNode.next.data;
            deleteNode.next = deleteNode.next.next;
            nextNode.next = null;
        } else {
            if(head == deleteNode) {
                head = null;
            } else {
                ListNode cursor = head;
                while(cursor.next != deleteNode) {
                    cursor = cursor.next;
                }
                cursor.next = null;
            }
        }
        deleteNode.data = null;
        return head;
    }

    private class ListNode<E>{
        E data;
        ListNode<E> next;
        ListNode(E data, ListNode<E> next) {
            this.data = data;
            this.next = next;
        }
    }
}
