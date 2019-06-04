package com.offer;

import org.junit.Test;

/**
 *
 * Created by Administrator on 2019/5/30.
 */
public class DeleteDuplicate {

    @Test
    public void test() {
        Node node5 = new Node(5, null);
        Node node4 = new Node(3, node5);
        Node node3 = new Node(3, node4);
        Node node2 = new Node(2, node3);
        Node node1 = new Node(1, node2);
        Node head = deleteDuplicate(node1);
        while(head != null) {
            System.out.println(head.val);
            head = head.next;
        }
    }



    /**
     * 1 2 3 3 4 4 5
     * @param head
     * @return
     */
    private Node deleteDuplicate(Node head) {

        if(head == null) {
            return null;
        }
        Node node = head;
        Node preNode = new Node();
        preNode.next = node;
        Node result = preNode;
        while(node != null) {
            if(node.next != null && node.val == node.next.val) {
                while(node.next != null && node.val == node.next.val) {
                    node = node.next;
                }
                node = node.next;
                preNode.next = node;
            } else {
                preNode = preNode.next;
                node = node.next;
            }
        }
        return result.next;
    }

}
