package com.nulltech.leetcode;

public class LeetCode_20 {

  public static void main (String [] args) {

  }
  public boolean isValid(String s) {
    while (s.length() > 0) {
      int a = s.length();
      s = s.replaceAll("\\(\\)","");
      s = s.replaceAll("\\{\\}", "");
      s = s.replaceAll("\\[\\]", "");
      if (s.length() == 0) break;
      if (a == s.length()) return false;
    }
    return true;
  }
}
