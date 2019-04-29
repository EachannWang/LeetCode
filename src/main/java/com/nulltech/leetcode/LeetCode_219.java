package com.nulltech.leetcode;

public class LeetCode_219 {

  public static void main (String [] args) {

  }
  public boolean containsNearbyDuplicate(int[] nums, int k) {
    for (int i = 0; i < nums.length; i++) {
      for (int j = i+1; j < nums.length&&j <= i+k; j++) {
        if (nums[i] == nums[j]) return true;
      }
    }
    return false;
  }
}
