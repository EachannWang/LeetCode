package com.nulltech.leetcode;

public class LeetCode_461 {

  public static void main (String [] args) {

  }
  public int hammingDistance(int x, int y) {
    String a = Integer.toBinaryString(x);
    String b = Integer.toBinaryString(y);
    char m [] = new char[32];
    char n [] = new char[32];
    for (int i = 0; i < m.length; i++) {
      m[i] = '0';n[i] = '0';
    }
    for (int i = a.length()-1; i >=0 ;i--) {
      m[m.length-(a.length()-i)] = a.charAt(i);
    }
    for (int i = b.length()-1; i >=0 ;i--) {
      n[n.length-(b.length()-i)] = b.charAt(i);
    }
    a = new String(m);
    b = new String(n);
    int count = 0;
    for (int i = 0; i < 32; i++) {
      if (a.charAt(i) != b.charAt(i)) count++;
    }
    return count;
  }
}
