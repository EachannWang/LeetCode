package com.nulltech.leetcode;

public class LeetCode_58 {

  public static void main (String [] args) {

  }

  public static int lengthOfLastWord(String s) {
    s = s.trim();
    int lastindex = s.lastIndexOf(" ");
    return s.length() -1 - lastindex;
  }

}
