package com.nulltech.leetcode;

public class LeetCode_13 {

  public static void main (String [] args) {

  }
  public int romanToInt(String s) {
    String roman = "IVXLCDM";
    int [] value = {1, 5, 10, 50, 100, 500,1000};
    int count = 0;
    int index = 0;
    while (index < s.length()-1) {
      if (roman.indexOf(s.charAt(index)) >= roman.indexOf(s.charAt(index+1))) {
        count += value[roman.indexOf(s.charAt(index))];
        index++;
      } else {
        count += -value[roman.indexOf(s.charAt(index))] + value[roman.indexOf(s.charAt(index+1))];
        index += 2;
      }
    }
    if (s.length() >= 2 && roman.indexOf(s.charAt(s.length()-2)) >= roman.indexOf(s.charAt(s.length()-1))) count += value[roman.indexOf(s.charAt(s.length()-1))];
    if (s.length() == 1) return value[roman.indexOf(s.charAt(s.length()-1))];
    return count;
  }
}
