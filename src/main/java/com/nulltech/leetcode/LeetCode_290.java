package com.nulltech.leetcode;

import java.util.HashMap;
import java.util.Objects;

public class LeetCode_290 {

  public static void main (String [] args) {

  }
  public static boolean wordPattern(String pattern, String str) {
    if (pattern == null || "".equals(pattern) || str == null || "".equals(str)) return false;
    String [] arr = str.split(" ");
    if (pattern.length() != arr.length) return false;
    HashMap map = new HashMap();
    for (int i = 0; i < pattern.length(); i++) {
      Object a = map.put(pattern.charAt(i),i);
      Object b = map.put(arr[i], i);
      if (!Objects.equals(a, b)) return false;
    }
    return true;
  }
}
