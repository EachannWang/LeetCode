package com.nulltech.leetcode;

public class LeetCode_876 {

  public static void main(String[] args) {

  }

  public ListNode middleNode(ListNode head) {
    int count = 0;
    ListNode heart = head;
    while (heart != null) {
      count++;
      heart = heart.next;
    }
    int index = count / 2 + 1;
    ListNode node = null;
    int abc = 0;
    while (head != null) {
      abc++;
      if (abc == index) {
        return head;
      }
      head = head.next;
    }
    return node;
  }

  class ListNode {

    int val;
    ListNode next;

    ListNode(int x) {
      val = x;
    }
  }
}
