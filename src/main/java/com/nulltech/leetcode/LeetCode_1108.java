package com.nulltech.leetcode;

/**
 * https://leetcode.com/problems/defanging-an-ip-address/
 */

public class LeetCode_1108 {

  public static void main (String [] args) {
    LeetCode_1108 cla = new LeetCode_1108();
    System.out.println(cla.defangIPaddr("255.100.50.0"));
  }

  public String defangIPaddr(String address) {
    return address.replaceAll("\\.","[.]");

  }

}
