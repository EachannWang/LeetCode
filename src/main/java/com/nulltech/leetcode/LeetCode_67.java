package com.nulltech.leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LeetCode_67 {

  public static void main (String [] args) {

  }
  public static String addBinary(String a, String b) {
    String temp_str = b;
    if (a.length() > b.length()) {
      b = a;
      a = temp_str;
    }
    List list = new ArrayList();
    int output = 0;
    for (int i = a.length() -1; i >= 0; i--) {
      int temp = Integer.parseInt("" + a.charAt(i)) + Integer.parseInt("" + b.charAt(b.length() - (a.length() - i)));
      if (output > 0) {
        temp += output;
        output = 0;
      }
      if ( temp < 2) {
        list.add(temp);
      } else if (temp == 2)  {
        output = 1;
        list.add(0);
      } else {
        output = 1;
        list.add(1);
      }
    }
    for (int i = b.length() - a.length() -1; i >= 0; i--) {
      if (output > 0) {
        if (output + Integer.parseInt("" + b.charAt(i)) > 1) {
          list.add(0);
          output = 1;
        } else {
          list.add(Integer.parseInt("" + b.charAt(i)) + output);
          output = 0;
        }
      } else {
        list.add(Integer.parseInt("" + b.charAt(i)));
      }
    }
    if (output > 0) {
      list.add(output);
    }

    Collections.reverse(list);
    StringBuffer sb = new StringBuffer();
    for (int i = 0; i < list.size(); i++) {
      sb.append(String.valueOf(list.get(i)));
    }
    return sb.toString();
  }
}
