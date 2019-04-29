package com.nulltech.leetcode;

public class LeetCode_14 {

  public static void main (String [] args) {

  }
  // 一下注释方法为寻找任意位置最长匹配
  // public String longestCommonPrefix(String[] strs) {
  //   if (strs.length == 0) return "";
  //   String shortstr = strs[0];
  //   for (String s:strs) if (s.length() < shortstr.length()) shortstr = s;
  //   int start = 0;
  //   String result = "";
  //   for (int i = 0 ; i < shortstr.length(); i++) {
  //     for (String str:strs) {
  //       System.out.println(str.substring(start,i+1));
  //       if (str.indexOf(shortstr.substring(start,i+1)) < 0) {
  //         if (result.length() < shortstr.substring(start,i).length()) result = shortstr.substring(start,i);
  //         start = i+1;
  //         break;
  //       }
  //     }
  //   }
  //   if (result.length() < shortstr.substring(start).length()) result = shortstr.substring(start);
  //   return result;
  // }

  public String longestCommonPrefix(String[] strs) {
    if (strs.length == 0) return "";
    String shortstr = strs[0];
    for (String s:strs) if (s.length() < shortstr.length()) shortstr = s;
    for (int i = 0 ; i < shortstr.length(); i++) {
      for (String str:strs) {
        if (!str.startsWith(shortstr.substring(0,i+1))) {
          return shortstr.substring(0,i);
        }
      }
    }
    return shortstr;
  }
}
