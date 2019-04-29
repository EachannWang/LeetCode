package com.nulltech.leetcode;

public class LeetCode_832 {

  public static void main (String [] args) {

  }
  public int[][] flipAndInvertImage(int[][] A) {
    for (int [] a:A) {
      for (int i = 0; i < a.length/2; i++) {
        int temp = a[i];
        a[i] = a[a.length-1-i];
        a[a.length-1-i] = temp;
      }
      for (int i = 0; i < a.length; i++) {
        if (a[i] == 0) { a[i] = 1; continue;}
        if (a[i] == 1) a[i] = 0;
      }
    }
    return A;
  }
}
