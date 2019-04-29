package com.nulltech.leetcode;

public class LeetCode_283 {

  public static void main (String [] args) {

  }
  public static void moveZeroes(int[] nums) {
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] == 0) {
        int index = i;
        while (index < nums.length - 1) {
          index++;
          if (nums[index] != 0) {
            nums[i] = nums[index];
            nums[index] = 0;
            break;
          }
        }
      }
    }
  }
}
