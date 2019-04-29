package com.nulltech.leetcode;

public class LeetCode_7 {

  public static void main (String [] args) {

  }
  public static int reverse(int x) {
    if (x > Integer.MAX_VALUE || x < Integer.MIN_VALUE) return 0;
    String str = "" + x;
    String prefix = "";
    if (str.startsWith("-")){
      prefix = "-";
      str = str.substring(1);
    }
    StringBuffer sb = new StringBuffer();
    for (int i = str.length() - 1; i >= 0; i--) {
      sb.append(str.charAt(i));
    }
    while (sb.toString().startsWith("0")) {
      sb.delete(0,1);
    }
    try {
      return Integer.valueOf(prefix + sb.toString());
    } catch (Exception e) {
      e.printStackTrace();
    }
    return 0;
  }
}
