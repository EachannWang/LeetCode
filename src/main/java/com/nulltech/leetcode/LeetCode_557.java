package com.nulltech.leetcode;

public class LeetCode_557 {

  public static void main (String [] args) {

  }
  public String reverseWords(String s) {
    if (s == null || "".equals(s)) return s;
    String [] arr = s.split(" ");
    StringBuffer sb = new StringBuffer();
    for (int i = 0; i < arr.length; i++) {
      char [] value = arr[i].toCharArray();
      for (int k = 0; k < value.length/2; k++) {
        char temp = value[k];
        value[k] = value[value.length-1-k];
        value[value.length-1-k] = temp;
      }
      sb.append(new String(value));
      sb.append(" ");
    }
    return sb.toString().substring(0, sb.toString().length()-1);
  }
}
