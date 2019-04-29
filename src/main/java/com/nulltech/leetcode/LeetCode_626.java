package com.nulltech.leetcode;

public class LeetCode_626 {

  public static void main (String [] args) {

  }

  public static String SQL = "select * from \n"
      + "(\n"
      + "select id-1 id, student from seat where id%2 = 0\n"
      + "union\n"
      + "select id+1 id, student from seat where id%2 = 1 and id <> (select max(id) from seat)\n"
      + "union\n"
      + "select id, student from seat where id%2 = 1 and id = (select max(id) from seat)\n"
      + ") a order by id";
}
