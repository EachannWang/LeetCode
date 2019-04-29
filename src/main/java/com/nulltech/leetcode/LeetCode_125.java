package com.nulltech.leetcode;

import java.util.Arrays;

public class LeetCode_125 {

  public static void main (String [] args) {

  }
  public boolean isPalindrome(String s) {
    s = s.toLowerCase();
    char [] arr = new char[0];
    for (int i = 0; i < s.length(); i++) {
      if ((s.charAt(i) <= 'z' && s.charAt(i) >= 'a') || (s.charAt(i) <= '9' && s.charAt(i) >= '0'))  {
        arr = Arrays.copyOf(arr, arr.length+1);
        arr[arr.length-1] = s.charAt(i);
      }
    }
    if (arr.length == 0) return true;
    for (int i = 0; i < arr.length/2; i++) {
      if (arr[i] != arr[arr.length-1-i]) return false;
    }
    return true;
  }
}
