package com.nulltech.leetcode;

import java.util.Arrays;

public class LeetCode_169 {

  public static void main (String [] args) {

  }
  public int majorityElement(int[] nums) {
    Arrays.sort(nums);
    int index = 0;
    for (int i = 0; i < nums.length-1; i++) {
      if (nums[i] != nums[i+1]){
        if (i-index+1 > nums.length/2) return nums[index];
        index = i+1;
      }
    }
    return nums[nums.length-1];
  }
}
