package com.nulltech.leetcode;

import java.util.ArrayList;
import java.util.Collections;

public class LeetCode_242 {

  public static void main (String [] args) {

  }
  public static boolean isAnagram(String s, String t) {
    if (s.length() != t.length()) return  false;
    ArrayList slist = new ArrayList();
    ArrayList tlist = new ArrayList();
    for (int i = 0; i < s.length(); i++) {
      slist.add(s.charAt(i));
      tlist.add(t.charAt(i));
    }
    Collections.sort(slist);
    Collections.sort(tlist);
    return slist.equals(tlist);
  }
}
