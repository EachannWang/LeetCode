package com.nulltech.leetcode;

public class LeetCode_326 {

  public static void main (String [] args) {

  }
  public boolean isPowerOfThree(int n) {
    int i = 0;
    long pow =(long) Math.pow(3, i);
    while (pow <= n) {
      if (pow == n) return true;
      i++;
      pow = (long) Math.pow(3,i);
    }
    return false;
  }
}
