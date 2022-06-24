package com.lee.leetcode;

import com.lee.leetcode.utils.ListNode;

/**
 * @author Lee
 * @since 2022/6/23 16:12
 */
public class RemoveNthFromEnd19 {

    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0, head);
        ListNode first = head;
        ListNode second = dummy;
        for (int i = 0; i < n; ++i) {
            first = first.next;
        }
        while (first != null) {
            first = first.next;
            second = second.next;
        }
        second.next = second.next.next;
        return dummy.next;
    }

}
