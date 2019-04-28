package com.nulltech.leetcode;

/**
 *
 * @see <a href="https://leetcode.com/problems/jewels-and-stones/">https://leetcode.com/problems/jewels-and-stones/</a>
 *
 */

public class LeetCode_771 {

  public static void main (String [] args) {
    String j = "aA";
    String s = "aAAbbbb";
    int result = LeetCode_771.numJewelsInStones(j, s);
    System.out.println(result);
  }


  public static int numJewelsInStones(String J, String S) {
    int count = 0;
    StringBuffer sb = new StringBuffer();
    for (int i = 0; i < J.length(); i ++) {
      if (sb.toString().indexOf(J.charAt(i)) < 0) {
        sb.append(J.charAt(i));
      }
    }
    for (int j = 0; j < S.length(); j++) {
      if (sb.toString().indexOf(S.charAt(j)) >= 0) count++;
    }
    return count;
  }
}
