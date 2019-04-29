package com.nulltech.leetcode;

public class LeetCode_189 {

  public static void main (String [] args) {

  }
  public static void rotate(int[] nums, int k) {
    k = k % nums.length;
    int [] result = new int [nums.length];
    System.arraycopy(nums, 0, result, k, nums.length - k);
    System.arraycopy(nums, nums.length - k , result, 0, k);
    // nums = result; //这样不行，估计答案验证还是寻址原来的对象
    System.arraycopy(result,0,nums,0,nums.length);
  }
}
