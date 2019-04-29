package com.nulltech.leetcode;

public class LeetCode_344 {

  public static void main (String [] args) {

  }
  public String reverseString(String s) {
    char [] arr = new char [s.length()];
    for (int i = 0; i < s.length(); i++) {
      arr[arr.length-1-i] = s.charAt(i);
    }
    return new String(arr);
  }
}
