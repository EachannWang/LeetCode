package com.nulltech.leetcode;

public class LeetCode_852 {

  public static void main (String [] args) {

  }
  public int peakIndexInMountainArray(int[] A) {
    int index = 0;
    while (index < A.length) {
      if (A[index] < A[index+1]) {
        index++;
        continue;
      }
      if (A[index] > A[index+1]) return index;
    }
    return index;
  }
}
