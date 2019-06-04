package com.offer;

import org.junit.Test;

/**
 *
 * Created by Administrator on 2019/5/30.
 */
public class DeleteDuplicate {

    @Test
    public void test() {

    }



    /**
     * 1 2 3 3 4 4 5
     * @param head
     * @return
     */
    private ListNode deleteDuplicate(ListNode head) {

        if(head == null) {
            return null;
        }
        ListNode node = head;
        ListNode preNode = new ListNode();
        preNode.next = node;
        ListNode result = preNode;
        while(node != null) {
            if(node.next != null && node.data == node.next.data) {
                while(node.next != null && node.data == node.next.data) {
                    node = node.next;
                }
                node = node.next;
                preNode.next = node;
            } else {
                preNode.next = node;
                node = node.next;
            }
        }
        return result.next;
    }

}
