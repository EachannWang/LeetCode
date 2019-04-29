package com.nulltech.leetcode;

import java.util.Arrays;

public class LeetCode_136 {

  public static void main (String [] args) {

  }

  public int singleNumber(int[] nums) {
    Arrays.sort(nums);
    for (int i = 0; i < nums.length-1; i+=2) {
      if (nums[i] != nums[i+1]) return nums[i];
    }
    return nums[nums.length-1];
  }
}
