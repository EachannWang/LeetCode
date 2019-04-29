package com.nulltech.leetcode;

public class LeetCode_821 {

  public static void main (String [] args) {

  }
  public int[] shortestToChar(String S, char C) {
    int result [] = new int [S.length()];
    for (int i = 0; i < S.length(); i++) {
      if (S.substring(0,i+1).lastIndexOf(C) == -1) {
        result[i] = S.substring(i).indexOf(C);
        continue;
      }
      if (S.substring(i).indexOf(C) == -1) {
        result[i] = S.substring(0,i+1).length() - 1 - S.substring(0,i+1).lastIndexOf(C);
        continue;
      }
      if (S.substring(0,i+1).length() - S.substring(0,i+1).lastIndexOf(C) <= S.substring(i).indexOf(C)) {
        result[i] = S.substring(0,i+1).length() - 1 - S.substring(0,i+1).lastIndexOf(C);
      } else {
        result[i] = S.substring(i).indexOf(C);
      }
    }
    return result;
  }
}
