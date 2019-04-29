package com.nulltech.leetcode;

import java.util.HashMap;
import java.util.Map;

public class LeetCode_202 {

  public static void main (String [] args) {

  }
  public boolean isHappy(int n) {
    String s = String.valueOf(n);
    Map<String, String> map = new HashMap<>();
    while (!s.equals(sumStr(s))) {
      s = String.valueOf(sumStr(s));
      System.out.println(s);
      if (s.equals("1")) return true;
      if (map.put(s, s) != null) break;
    }
    return false;
  }

  public int sumStr (String s) {
    int res = 0;
    for (int i = 0; i < s.length(); i++) {
      res += Integer.parseInt(s.substring(i,i+1)) * Integer.parseInt(s.substring(i,i+1));
    }
    return res;
  }
}
