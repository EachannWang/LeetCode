package com.nulltech.leetcode;

import java.util.Arrays;

/**
 * https://leetcode.com/problems/merge-sorted-array/
 */

public class LeetCode_88 {

  public static void main (String [] args) {
    int [] nums1 = new int[] {1,2,3,0,0,0};
    int [] nums2 = new int [] {2,5,6};
    int m = 3;
    int n = 3;
    merge(nums1, m, nums2, n);
  }

  public static void merge(int[] nums1, int m, int[] nums2, int n) {
    int mi = 0;
    int ni = 0;
    int [] array = new int [m+n];
    for (int i = m+n-1; i > m-1; i--) {
      nums1[i] = nums2[m+n-1-i];
    }
    Arrays.sort(nums1);
  }

}
