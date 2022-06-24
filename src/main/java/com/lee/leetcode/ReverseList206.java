package com.lee.leetcode;

import com.lee.leetcode.utils.ListNode;

/**
 * @author Lee
 * @since 2022/6/23 14:27
 */
public class ReverseList206 {

    public ListNode reverseList(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode p = head;
        ListNode q = p.next;
        while (q != null) {
            p.next = q.next;
            q.next = head;
            head = q;
            q = p.next;
        }
        return head;
    }

}
