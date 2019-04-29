package com.nulltech.leetcode;

import java.util.Arrays;

public class LeetCode_905 {

  public static void main (String [] args) {

  }
  public static int[] sortArrayByParity(int[] A) {
    int [] ou_arr = {};
    int [] ji_arr = {};
    for (int i = 0; i < A.length; i++) {
      if (A[i] % 2 == 0) {
        ou_arr = Arrays.copyOf(ou_arr, ou_arr.length + 1);
        ou_arr[ou_arr.length - 1] = A[i];
      } else {
        ji_arr = Arrays.copyOf(ji_arr, ji_arr.length + 1);
        ji_arr[ji_arr.length - 1] = A[i];
      }
    }
    int [] result = new int [ou_arr.length + ji_arr.length];
    System.arraycopy(ou_arr, 0, result, 0, ou_arr.length);
    System.arraycopy(ji_arr, 0 , result, ou_arr.length, ji_arr.length);
    return result;
  }
}
