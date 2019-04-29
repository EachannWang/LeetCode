package com.nulltech.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LeetCode_811 {

  public static void main (String [] args) {

  }
  public List<String> subdomainVisits(String[] cpdomains) {
    Map<String, Integer> map = new HashMap<>();
    List<String> list = new ArrayList<>();
    for(String str:cpdomains) {
      String url = str.substring(str.indexOf(" ")+1);
      Integer num = Integer.parseInt(str.substring(0, str.indexOf(" ")));
      String [] spi = url.split("\\.");
      String [] arr = new String[spi.length];
      for (int i = 0; i < spi.length; i++) {
        StringBuffer sb = new StringBuffer();
        for (int j = i; j < spi.length; j++) {
          sb.append(spi[j]);
          sb.append(".");
        }
        sb.setLength(sb.length()-1);
        arr[i] = sb.toString();
      }
      for (String wangzhi:arr) {
        if (map.containsKey(wangzhi)) {
          map.put(wangzhi, num+map.get(wangzhi));
        } else {
          map.put(wangzhi,num);
        }
      }
    }
    for (Map.Entry<String, Integer> entry:map.entrySet()) {
      String str = "" + entry.getValue() + " " + entry.getKey();
      list.add(str);
    }
    return list;
  }
}
