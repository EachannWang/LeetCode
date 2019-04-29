package com.nulltech.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LeetCode_349 {

  public static void main (String [] args) {

  }
  public int[] intersection(int[] nums1, int[] nums2) {
    int [] res = {};
    List list1 = new ArrayList();
    List list2 = new ArrayList();
    for (int i = 0; i < nums1.length; i++) {
      if (!list1.contains(nums1[i])) {
        list1.add(nums1[i]);
      }
    }
    for (int i = 0; i < nums2.length; i++) {
      list2.add(nums2[i]);
    }
    for (int i = 0; i < list1.size(); i++) {
      if (list2.contains(list1.get(i))) {
        res = Arrays.copyOf(res, res.length + 1);
        res[res.length-1] = (int) list1.get(i);
      }
    }
    return res;
  }
}
