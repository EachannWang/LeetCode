package com.nulltech.leetcode;

import java.util.Arrays;

public class LeetCode_409 {

  public static void main (String [] args) {

  }
  public int longestPalindrome(String s) {
    if (s.length() == 1) return 1;
    char [] arr = new char[s.length()];
    for (int i = 0; i < s.length(); i++) {
      arr[i] = s.charAt(i);
    }
    Arrays.sort(arr);
    boolean one_flag = false;
    boolean same_flag = true;
    int count = 0;
    int result = 0;
    for (int i = 0; i < arr.length - 1; i++) {
      count++;
      if (arr[i] == arr[i + 1]) {
        continue;
      }
      same_flag = false;
      if (!one_flag && count%2 == 1) one_flag = true;
      result += count / 2;
      count = 0;
    }
    count++;
    if (!one_flag && count%2 == 1) one_flag = true;
    if (same_flag) return s.length();
    result += count / 2;
    result = 2*result;
    if (one_flag) result++;
    return result;
  }
}
