package com.nulltech.leetcode;

import java.util.Arrays;

public class LeetCode_389 {

  public static void main (String [] args) {

  }
  public char findTheDifference(String s, String t) {
    char [] s_arr = new char [s.length()];
    char [] t_arr = new char [t.length()];
    for (int i = 0; i < s.length(); i++) {
      s_arr[i] = s.charAt(i);
      t_arr[i] = t.charAt(i);
    }
    t_arr[t_arr.length-1] = t.charAt(t.length()-1);
    Arrays.sort(s_arr);
    Arrays.sort(t_arr);
    for (int i = 0; i < s_arr.length; i++) {
      if (s_arr[i] != t_arr[i]) {
        return t_arr[i];
      }
    }
    return t_arr[t_arr.length - 1];
  }
}
