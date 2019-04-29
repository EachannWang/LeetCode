package com.nulltech.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class LeetCode_884 {

  public static void main (String [] args) {

  }
  public String[] uncommonFromSentences(String A, String B) {
    String [] a = A.split(" ");
    String [] b = B.split(" ");
    List<String> list = new ArrayList<>();
    list.addAll(Arrays.asList(a));
    list.addAll(Arrays.asList(b));
    Collections.sort(list);
    if (list.size() <= 1) return list.toArray(new String[list.size()]);
    List<String> real = new ArrayList<>();
    for (int i = 0; i < list.size(); i++) {
      if (i == 0 && !list.get(i).equals(list.get(i+1))) {
        real.add(list.get(i));
      }
      if (i > 0 && i < list.size()-1 && !list.get(i).equals(list.get(i+1)) && !list.get(i).equals(list.get(i-1))) {
        real.add(list.get(i));
      }
      if (i == list.size()-1 && !list.get(i).equals(list.get(i-1))) {
        real.add(list.get(i));
      }
    }
    return real.toArray(new String[real.size()]);
  }
}
