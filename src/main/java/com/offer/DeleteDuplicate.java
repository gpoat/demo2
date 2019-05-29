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

        if(head == null){
            return null;
        }
        ListNode temp = head;
        ListNode index = new ListNode();
        index.next = temp;
        ListNode result = index;
        while(temp != null) {
            if(temp.next != null && temp.data == temp.next.data) {
                while(temp.next != null && temp.data == temp.next.data) {
                    temp = temp.next;
                }
                temp = temp.next;
                index.next = temp;
            } else {
                index = index.next;
                temp = temp.next;
            }
        }
        return result.next;
    }

}
