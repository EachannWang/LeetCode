package com.nulltech.leetcode;

public class LeetCode_66 {

  public static void main (String [] args) {

  }
  public static int[] plusOne(int[] digits) {
    int n = digits.length;
    for (int i = n - 1; i >=0; i--) {
      if (digits[i] < 9) {
        digits[i]++;
        return digits;
      }
      digits[i] = 0;
    }
    int [] result = new int [digits.length + 1];
    result[0] = 1;
    return result;
  }
}
