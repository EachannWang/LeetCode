package com.nulltech.leetcode;

public class LeetCode_237 {

  public static void main(String[] args) {

  }

  public void deleteNode(ListNode node) {
    node.val = node.next.val;
    node.next = node.next.next;
  }

  class ListNode {

    int val;
    ListNode next;

    ListNode(int x) {
      val = x;
    }
  }
}
