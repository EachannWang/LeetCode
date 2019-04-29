package com.nulltech.leetcode;

import java.util.ArrayList;
import java.util.List;

public class LeetCode_709 {

  public static void main (String [] args) {

  }

  public static int[] intersect(int[] nums1, int[] nums2) {
    List<Integer> list1 = new ArrayList();
    List<Integer> list2 = new ArrayList();
    for (int i = 0; i < nums1.length; i++) {
      list1.add(nums1[i]);
    }
    for (int i = 0; i < nums2.length; i++) {
      list2.add(nums2[i]);
    }
    List<Integer> list = new ArrayList();
    int size = list1.size();
    boolean flag = false;
    for (int i = 0; i < size; i++) {
      for (int j = 0; j < list1.size(); j++) {
        for (int k = 0; k < list2.size(); k++) {
          if (list1.get(j).equals(list2.get(k))) {
            list.add(list1.get(j));
            list2.remove(k);
            flag = true;
            break;
          }
        }
        if (flag) {
          list1.remove(j);
          flag = false;
          break;
        }
      }
    }
    int arr [] = new int[list.size()];
    for (int i = 0; i < list.size(); i++) {
      arr[i] = list.get(i);
    }
    return arr;
  }

}
