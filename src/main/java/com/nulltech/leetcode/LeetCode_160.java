package com.nulltech.leetcode;

import java.util.ArrayList;
import java.util.List;

public class LeetCode_160 {

  public static void main(String[] args) {

  }

  public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
    if (headA == null || headB == null) {
      return null;
    }
    List<ListNode> list = new ArrayList<>();
    list.add(headB);
    ListNode b = headB;
    while (b != null) {
      list.add(b.next);
      b = b.next;
    }
    ListNode a = headA;
    while (a != null) {
      if (list.contains(a)) {
        return a;
      }
      a = a.next;
    }
    return null;
  }

  class ListNode {

    int val;
    ListNode next;

    ListNode(int x) {
      val = x;
      next = null;
    }
  }
}
