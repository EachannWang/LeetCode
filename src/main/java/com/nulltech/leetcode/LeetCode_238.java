package com.nulltech.leetcode;

public class LeetCode_238 {

  public static void main (String [] args) {

  }
  public int[] productExceptSelf(int[] nums) {
    int [] arr = new int[nums.length];
    long total = 1;
    int zerocount = 0;
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] != 0) {
        total = total * nums[i];
      } else {
        zerocount++;
      }
    }
    if (zerocount >= 2) return arr;
    for (int i = 0; i < arr.length; i++) {
      if (nums[i] != 0) {
        if (zerocount == 0) {
          arr[i] = (int) total / nums[i];
        } else {
          arr[i] = 0;
        }
      } else {
        arr[i] = (int) total;
      }
    }
    return arr;
  }
}
