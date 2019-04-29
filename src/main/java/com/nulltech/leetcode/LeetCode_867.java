package com.nulltech.leetcode;

public class LeetCode_867 {

  public static void main (String [] args) {

  }
  public int[][] transpose(int[][] A) {
    if (A.length == 0 || A[0].length == 0) return A;
    int [][] res = new int [A[0].length][A.length];
    for (int i = 0; i < A[0].length; i++) {
      int [] ins = new int[A.length];
      for (int j = 0; j < A.length; j ++) {
        ins[j] = A[j][i];
      }
      res[i] = ins;
    }
    return res;
  }
}
