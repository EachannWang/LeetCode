package com.nulltech.leetcode;

public class LeetCode_35 {

  public static void main (String [] args) {

  }
  public static int searchInsert(int[] nums, int target) {
    int index = 0;
    for (int i = 0; i < nums.length; i++) {
      if (target == nums[i]) return i;
      if (nums[index] < target) index++;
      if ( index < nums.length && nums[index] >= target) break;
    }
    return index;
  }
}
