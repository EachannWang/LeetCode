package com.nulltech.leetcode;

public class LeetCode_657 {

  public static void main (String [] args) {

  }
  public boolean judgeCircle(String moves) {
    int total = moves.length();
    int u = total - moves.replaceAll("U", "").length();
    int d = total - moves.replaceAll("D", "").length();
    int l = total - moves.replaceAll("L", "").length();
    int r = total - moves.replaceAll("R", "").length();
    return u == d && l == r;
  }
}
