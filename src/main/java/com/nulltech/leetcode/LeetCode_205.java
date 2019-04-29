package com.nulltech.leetcode;

public class LeetCode_205 {

  public static void main (String [] args) {

  }
  public static boolean isIsomorphic(String s, String t) {
    if (s.length() != t.length()) return false;
    for (int i = 0; i < s.length(); i++) {
      if (s.indexOf(s.charAt(i)) != t.indexOf(t.charAt(i))) return false;
    }
    return true;
  }
}
