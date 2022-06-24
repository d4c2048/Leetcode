package com.lee.leetcode;

import com.lee.leetcode.utils.ListNode;

/**
 * @author Lee
 * @since 2022/6/24 13:14
 */
public class GetIntersectionNode0207 {

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int lenA = getLen(headA);
        int lenB = getLen(headB);
        int m = lenA > lenB ? lenA - lenB : lenB - lenA;
        ListNode p = lenA > lenB ? headA : headB;
        while (m > 0) {
            p = p.next;
            m--;
        }
        ListNode q = lenA > lenB ? headB : headA;
        while (p != null && q != null && p != q) {
            p = p.next;
            q = q.next;
        }
        return p;
    }

    private int getLen(ListNode head) {
        int len = 0;
        for (ListNode p = head; p != null; p = p.next) {
            len++;
        }
        return len;
    }

}
