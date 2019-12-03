package com.nulltech.leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/**
 * https://leetcode.com/problems/binary-tree-level-order-traversal-ii/
 */

public class LeetCode_107 {

  public static void main (String[] args) {

  }

  public List<List<Integer>> levelOrderBottom(TreeNode root) {
    List<List<Integer>> res = new ArrayList<>();
    if (Objects.isNull(root)) return res;
    List<TreeNode> first = new ArrayList<>();
    List<TreeNode> second = new ArrayList<>();
    first.add(root);
    while (first.size()>0) {
      second = new ArrayList<>();
      List<Integer> list = new ArrayList<>();
      for (int i = 0; i < first.size(); i++) {
        list.add(first.get(i).val);
        if (Objects.nonNull(first.get(i).left)) {
          second.add(first.get(i).left);
        }
        if (Objects.nonNull(first.get(i).right)) {
          second.add(first.get(i).right);
        }
      }
      res.add(list);
      first = second;
    }
    Collections.reverse(res);
    return res;
  }

  class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
  }

}
