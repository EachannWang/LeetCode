package com.nulltech.leetcode;

import java.util.Objects;

/**
 * https://leetcode.com/problems/split-a-string-in-balanced-strings/
 */

public class LeetCode_1221 {

  public static void main (String [] args) {
    int i = LeetCode_1221.balancedStringSplit("RLRRLLRLRL");
    System.out.println(i);
  }

  public static int balancedStringSplit(String s) {
    if (Objects.isNull(s) || s.length() <= 1) return 0;
    final String l = "L";
    final String r = "R";
    StringBuilder head = new StringBuilder();
    StringBuilder end = new StringBuilder();
    int result = 0;
    for (int i = 0; i < s.length(); i++) {
      if (l.equals(s.substring(i, i + 1))) {
        head.append(s.substring(i, i + 1));
      }
      if (r.equals(s.substring(i, i + 1))) {
        end.append(s.substring(i, i + 1));
      }
      if (head.length()==end.length()) result++;
    }
    return result;
  }

}
