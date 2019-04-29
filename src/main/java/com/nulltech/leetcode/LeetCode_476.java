package com.nulltech.leetcode;

public class LeetCode_476 {

  public static void main (String [] args) {

  }
  public int findComplement(int num) {
    StringBuffer sb = new StringBuffer();
    String binary = Integer.toBinaryString(num);
    StringBuffer result = new StringBuffer();
    for (int i = 0; i < binary.length(); i++) {
      if (binary.charAt(i) == '0') sb.append("1");
      if (binary.charAt(i) == '1') sb.append("0");
    }
    while (result.toString().length() < 32-binary.length()) result.append("0");
    result.append(sb.toString());
    return Integer.parseInt(result.toString(), 2);
  }
}
