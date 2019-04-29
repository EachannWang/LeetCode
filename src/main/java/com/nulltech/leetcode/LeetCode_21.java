package com.nulltech.leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LeetCode_21 {

  public static void main(String[] args) {

  }

  public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
    if (l1 == null) {
      return l2;
    }
    if (l2 == null) {
      return l1;
    }
    if (l1 == null && l2 == null) {
      return null;
    }
    List<Integer> list = new ArrayList<>();
    list.add(l1.val);
    list.add(l2.val);
    while (l1.next != null) {
      l1 = l1.next;
      list.add(l1.val);
    }
    while (l2.next != null) {
      l2 = l2.next;
      list.add(l2.val);
    }
    Collections.sort(list);
    ListNode node = new ListNode(list.get(list.size() - 1));
    node.next = null;
    for (int i = list.size() - 2; i >= 0; i--) {
      ListNode no = new ListNode(list.get(i));
      no.next = node;
      node = no;
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
