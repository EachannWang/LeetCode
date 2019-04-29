package com.nulltech.leetcode;

public class LeetCode_26 {

  public static void main (String [] args) {

  }
  public int removeDuplicates(int[] nums) {
    if (nums.length <= 1) return nums.length;
    int count = 0;
    int num = nums[0];
    count++;
    for (int i = 1; i < nums.length; i++) {
      if (nums[i] != num) {
        nums[count] = nums[i];
        num = nums[count];
        count++;
      }
    }
    return count;
  }
}
