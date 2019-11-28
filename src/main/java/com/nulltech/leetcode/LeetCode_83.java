package com.nulltech.leetcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;

/**
 * https://leetcode.com/problems/remove-duplicates-from-sorted-list/
 */

public class LeetCode_83 {
  public static void main (String [] args) {
    ListNode l3 = new ListNode(3);
    ListNode l2 = new ListNode(2);
    l2.next = l3;
    ListNode l1 = new ListNode(1);
    l1.next = l2;
    LeetCode_83 l = new LeetCode_83();
    ListNode node = l.deleteDuplicates(l2);
  }

  public ListNode deleteDuplicates(ListNode head) {
    if (Objects.isNull(head) || Objects.isNull(head.next)) return head;
    HashSet nums = new HashSet();
    List<ListNode> list = new ArrayList();
    while (Objects.nonNull(head)) {
      if (nums.contains(head.val)) {
      } else {
        nums.add(head.val);
        ListNode node = new ListNode(head.val);
        list.add(node);
      }
      head = head.next;
    }
    for (int i = list.size()-2; i >= 0; i--) {
      list.get(i).next = list.get(i+1);
    }
    return list.get(0);
  }

  static class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
  }
}
