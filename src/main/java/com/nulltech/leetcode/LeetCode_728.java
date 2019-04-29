package com.nulltech.leetcode;

import java.util.ArrayList;
import java.util.List;

public class LeetCode_728 {

  public static void main (String [] args) {

  }
  public List<Integer> selfDividingNumbers(int left, int right) {
    List<Integer> list = new ArrayList<>();
    for (int i = left; i <= right; i++) {
      if (isSelfdividing(i)) list.add(i);
    }
    return list;
  }

  public boolean isSelfdividing (int x) {
    String a = String.valueOf(x);
    if (a.indexOf("0") >= 0) return false;
    for (int i = 0; i < a.length(); i++) {
      if (x%Integer.parseInt(a.substring(i, i+1)) != 0) return false;
    }
    return true;
  }
}
