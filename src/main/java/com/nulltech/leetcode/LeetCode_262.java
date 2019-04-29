package com.nulltech.leetcode;

public class LeetCode_262 {

  public static void main (String [] args) {

  }

  public static String sql = "select Request_at as Day,\n"
      + "case when cast((1.0*can)/(1.0*count) as DECIMAL(18,2)) is not null then cast((1.0*can)/(1.0*count) as DECIMAL(18,2)) else 0.0 end as 'Cancellation Rate'\n"
      + "from\n"
      + "(\n"
      + "select a.count, b.can, a.Request_at from\n"
      + "(select count(id) count,Request_at from Trips a where a.Client_Id in (select Users_Id from Users where Banned = 'No') and a.Driver_Id in (select Users_Id from Users where Banned = 'No')\n"
      + "and a.Request_at BETWEEN '2013-10-01' and '2013-10-03' GROUP BY a.request_at) a\n"
      + "left join\n"
      + "(select count(id) can,Request_at from Trips a where a.Client_Id in (select Users_Id from Users where Banned = 'No') and a.Driver_Id in (select Users_Id from Users where Banned = 'No')\n"
      + "and a.Request_at BETWEEN '2013-10-01' and '2013-10-03' and status != 'completed' GROUP BY a.request_at) b\n"
      + "on a.Request_at = b.Request_at\n"
      + ") c";

}
