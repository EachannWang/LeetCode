package com.nulltech.leetcode;

import java.util.Objects;

/**
 * https://leetcode.com/problems/palindrome-number/
 */

public class LeetCode_9 {

  public static void main (String [] args) {

  }

  public boolean isPalindrome(int x) {
    if (x < 0) return false;
    if (x == 0) return true;
    StringBuilder sb = new StringBuilder();
    sb.append(String.valueOf(x));
    if (Objects.equals(String.valueOf(x), sb.reverse().toString())) return true;
    return false;
  }

}
