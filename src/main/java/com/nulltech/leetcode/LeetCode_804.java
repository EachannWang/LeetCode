package com.nulltech.leetcode;

import java.util.HashSet;

public class LeetCode_804 {

  public static void main (String [] args) {

  }

  public static int uniqueMorseRepresentations(String[] words) {
    HashSet set = new HashSet();
    String [] arr = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
    StringBuffer sb = new StringBuffer();
    for (int i = 0; i < words.length; i++) {
      for (int k = 0; k < words[i].length(); k++) {
        sb.append((arr[words[i].charAt(k)- 'a']));
      }
      set.add(sb.toString());
      sb.setLength(0);
    }
    return set.size();
  }

}
