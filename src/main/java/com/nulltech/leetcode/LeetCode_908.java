package com.nulltech.leetcode;

import java.util.Arrays;

public class LeetCode_908 {

  public static void main (String [] args) {

  }
  public int smallestRangeI(int[] A, int K) {
    Arrays.sort(A);
    return A[A.length-1] - A[0] <= 2*K ? 0 : A[A.length-1] - A[0] - 2*K;
  }
}
