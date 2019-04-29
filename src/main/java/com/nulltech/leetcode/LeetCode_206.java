package com.nulltech.leetcode;

public class LeetCode_206 {

  public static void main(String[] args) {

  }

  public ListNode reverseList(ListNode head) {
    if (head == null) {
      return null;
    }
    ListNode list = new ListNode(head.val);
    list.next = null;
    ListNode node = head.next;
    while (node != null) {
      ListNode real = new ListNode(node.val);
      node = node.next;
      real.next = list;
      list = real;
    }
    return list;
  }

  class ListNode {

    int val;
    ListNode next;

    ListNode(int x) {
      val = x;
    }
  }
}
