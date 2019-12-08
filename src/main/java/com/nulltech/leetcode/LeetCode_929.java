package com.nulltech.leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * https://leetcode.com/problems/unique-email-addresses/
 */

public class LeetCode_929 {

  public static void main (String[] args) {
    List<java.lang.String> list = new ArrayList();
    list.add("test.email+alex@leetcode.com");
    list.add("test.e.mail+bob.cathy@leetcode.com");
    list.add("testemail+david@lee.tcode.com");
    String[] emails = list.toArray(new String[list.size()]);
    numUniqueEmails(emails);
  }

  public static int numUniqueEmails(String[] emails) {
    if (Objects.isNull(emails) || emails.length == 0) return 0;
    List list = new ArrayList();
    for (String email:emails) {
      String local = email.substring(0,email.indexOf("@"));
      local = local.replaceAll("\\.", "");
      if (local.indexOf("+") > 0) {
        local = local.substring(0, local.indexOf("+"));
      }
      if (!list.contains(local+email.substring(email.indexOf("@")))) {
        list.add(local+email.substring(email.indexOf("@")));
      }
    }
    return list.size();
  }

}
