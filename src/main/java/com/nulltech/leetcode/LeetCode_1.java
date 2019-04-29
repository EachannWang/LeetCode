package com.nulltech.leetcode;

public class LeetCode_1 {

  public static void main (String [] args) {

  }

  public static int[] twoSum(int[] nums, int target) {
    int arr[] = new int[2];
    for (int i = 0; i < nums.length; i++) {
      for (int k = i; k < nums.length; k++) {
        if (k != i && nums[i] + nums[k] == target) {
          arr[0] = i; arr[1] = k;
          return arr;
        }
      }
    }
    return arr;
  }
}
