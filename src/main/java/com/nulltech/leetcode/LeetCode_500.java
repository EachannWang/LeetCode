package com.nulltech.leetcode;

import java.util.Arrays;

public class LeetCode_500 {

  public static void main (String [] args) {

  }
  public String[] findWords(String[] words) {
    String r [] = new String[0];
    String one = "qwertyuiop";
    String two = "asdfghjkl";
    String three = "zxcvbnm";
    boolean one_flag = false;
    boolean two_flag = false;
    boolean three_flag = false;
    for (String str:words) {
      String temp = str.toLowerCase();
      char [] value = temp.toCharArray();
      for (char ch:value) {
        if (!one_flag)
          if (one.indexOf(ch) > -1) one_flag = true;
        if (!two_flag)
          if (two.indexOf(ch) > -1) two_flag = true;
        if (!three_flag)
          if (three.indexOf(ch) > -1) three_flag = true;
      }
      if ((one_flag && !two_flag && !three_flag) || (!one_flag && two_flag && !three_flag) || (!one_flag && !two_flag && three_flag)) {
        r = Arrays.copyOf(r, r.length+1);
        r[r.length-1] = str;
      }
      one_flag = false;
      two_flag = false;
      three_flag = false;
    }
    return r;
  }
}
