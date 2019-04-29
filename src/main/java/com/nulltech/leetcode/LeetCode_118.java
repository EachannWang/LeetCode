package com.nulltech.leetcode;

import java.util.ArrayList;
import java.util.List;

public class LeetCode_118 {

  public static void main (String [] args) {

  }
  public List<List<Integer>> generate(int numRows) {
    List<List<Integer>> list = new ArrayList<>();
    if (numRows <= 0) return list;
    List<Integer> one = new ArrayList<>();
    one.add(1);list.add(one);
    if (numRows == 1) return list;
    for (int i = 1; i < numRows; i++) {
      List<Integer> next = new ArrayList<>();
      next.add(1);
      List<Integer> last = list.get(i-1);
      for (int j = 1; j < i; j++) {
        next.add(last.get(j) + last.get(j-1));
      }
      next.add(1);
      list.add(next);
    }
    return list;
  }
}
