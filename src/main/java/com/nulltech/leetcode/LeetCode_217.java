package com.nulltech.leetcode;

import java.util.HashMap;
import java.util.Map;

public class LeetCode_217 {

  public static void main (String [] args) {

  }
  public boolean containsDuplicate(int[] nums) {
    Map<Integer,Integer> map = new HashMap<>();
    for (int i = 0; i <nums.length; i++) {
      if (map.put(nums[i], i) != null) {
        return true;
      }
    }
    return false;
  }
}
