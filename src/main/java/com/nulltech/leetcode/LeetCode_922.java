package com.nulltech.leetcode;

public class LeetCode_922 {

  public static void main(String[] args) {

  }

  public int[] sortArrayByParityII(int[] A) {
    for (int i = 0; i < A.length; i++) {
      if (i % 2 == 0) {
        if (A[i] % 2 == 0) {
          continue;
        }
        if (A[i] % 2 == 1) {
          int j = i + 1;
          while (j < A.length) {
            if (A[j] % 2 == 0 && j % 2 == 1) {
              int temp = A[j];
              A[j] = A[i];
              A[i] = temp;
            }
            j++;
          }
        }
      }
      if (i % 2 == 1) {
        if (A[i] % 2 == 1) {
          continue;
        }
        if (A[i] % 2 == 0) {
          int j = i + 1;
          while (j < A.length) {
            if (A[j] % 2 == 1 && j % 2 == 0) {
              int temp = A[j];
              A[j] = A[i];
              A[i] = temp;
            }
            j++;
          }
        }
      }
    }
    return A;
  }

}
