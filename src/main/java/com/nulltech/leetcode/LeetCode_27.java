package com.nulltech.leetcode;

import java.util.Arrays;

public class LeetCode_27 {

  public static void main (String [] args) {

  }
  public static int removeElement(int[] nums, int val) {
    if (nums.length == 0) {
      return 0;
    }
    Arrays.sort(nums);
    int count = nums.length;
    for (int i = 0; i < nums.length - 1; i++) {
      if (nums[i] == val) {
        count--;
        nums[i] = nums[nums.length-(nums.length - count)];
      }
    }
    if (nums[nums.length - 1] == val) {
      count--;
    }
    return count;
  }
}
