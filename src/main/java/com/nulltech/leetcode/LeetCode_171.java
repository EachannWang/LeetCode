package com.nulltech.leetcode;

public class LeetCode_171 {

  public static void main (String [] args) {

  }
  public int titleToNumber(String s) {
    char [] arr = s.toCharArray();
    int count = 0;
    for (int i = 0; i < arr.length; i++) {
      count += Math.pow(26, arr.length-1-i) * (arr[i] - 'A' + 1);
    }
    return count;
  }
}
