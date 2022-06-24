package com.lee.leetcode.utils;

public class ListNode {
     public int val;
     public ListNode next;
     public ListNode(int x, ListNode head) {
         val = x;
         next = null;
     }

     public ListNode() {
         super();
     }

     public ListNode(int val) {
         this.val = val;
     }

     public ListNode(ListNode next) {
         this.next = next;
     }

  }
