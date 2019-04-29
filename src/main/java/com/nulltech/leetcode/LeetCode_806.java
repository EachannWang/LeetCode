package com.nulltech.leetcode;

public class LeetCode_806 {

  public static void main (String [] args) {

  }
  public int[] numberOfLines(int[] widths, String S) {
    int hang = 0;
    int linewith = 0;
    for (int i = 0; i < S.length(); i++) {
      if (linewith + widths[S.charAt(i) - 'a'] > 100) {
        hang++;
        linewith = 0;
      }
      linewith += widths[S.charAt(i) - 'a'];
    }
    hang++;
    int [] res = new int [2];
    res[0] = hang;
    res[1] = linewith;
    return res;
  }
}
