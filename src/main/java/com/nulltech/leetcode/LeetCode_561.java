package com.nulltech.leetcode;

import java.util.Arrays;

public class LeetCode_561 {

  public static void main (String [] args) {

  }
  public int arrayPairSum(int[] nums) {
    Arrays.sort(nums);
    int count = 0;
    for (int i = nums.length-2; i >= 0; i = i -2) {
      count += nums[i];
    }
    return count;
  }
}
