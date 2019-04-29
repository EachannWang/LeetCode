package com.nulltech.leetcode;

public class LeetCode_121 {

  public static void main (String [] args) {

  }
  public int maxProfit(int[] prices) {
    int profit = 0;
    for (int i =0; i < prices.length; i++) {
      int temp = i+1;
      while (temp < prices.length) {
        if (prices[temp] - prices[i] > profit) profit = prices[temp] - prices[i];
        temp++;
      }
    }
    return profit;
  }
}
