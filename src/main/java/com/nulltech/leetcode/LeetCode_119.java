package com.nulltech.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LeetCode_119 {

  public static void main (String [] args) {

  }
  public List<Integer> getRow(int rowIndex) {
    List<Integer> zerolist = new ArrayList<>();
    zerolist.add(1);
    List<Integer> onelist = new ArrayList<>();
    onelist.add(1);
    onelist.add(1);
    if (rowIndex == 0) return zerolist;
    if (rowIndex == 1) return onelist;
    Map<Integer, List<Integer>> map = new HashMap<>();
    map.put(0,zerolist);
    map.put(1,onelist);
    for (int i = 0; i <= rowIndex; i++) {
      List<Integer> list = new ArrayList<>();
      list.add(1);
      for (int j = 1; j < i ; j++) {
        list.add(map.get(i-1).get(j-1) + map.get(i-1).get(j));
      }
      list.add(1);
      map.put(i, list);
    }
    return map.get(rowIndex);
  }
}
