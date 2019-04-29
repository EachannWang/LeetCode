package com.nulltech.leetcode;

import java.util.Arrays;

public class LeetCode_155 {

  public static void main(String[] args) {

  }

  class MinStack {

    /**
     * initialize your data structure here.
     */
    public MinStack() {

    }

    private int[] arr = {};

    public void push(int x) {

      this.arr = Arrays.copyOf(arr, arr.length + 1);
      if (this.arr.length == 1) {
        arr[0] = x;
        return;
      }
      System.arraycopy(arr, 0, arr, 1, arr.length - 1);
      this.arr[0] = x;
    }

    public void pop() {
      if (arr.length == 0) {
        return;
      }
      System.arraycopy(arr, 1, arr, 0, arr.length - 1);
      arr = Arrays.copyOf(arr, arr.length - 1);
    }

    public int top() {
      return arr[0];
    }

    public int getMin() {
      int min = arr[0];
      for (int i : arr) {
        if (min > i) {
          min = i;
        }
      }
      return min;
    }
  }
}
