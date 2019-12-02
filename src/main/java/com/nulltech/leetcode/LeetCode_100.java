package com.nulltech.leetcode;

import java.util.Objects;

/**
 * https://leetcode.com/problems/same-tree/
 */

public class LeetCode_100 {

  public static void main(String[] args) {

  }

  public boolean isSameTree(TreeNode p, TreeNode q) {
    if (Objects.equals(p, q)) return true;
    if (Objects.isNull(p) && Objects.nonNull(q)) return false;
    if (Objects.isNull(q) && Objects.nonNull(p)) return false;
    if (!Objects.equals(p.val, q.val)) return false;
    return isSameTree(p.left,q.left) && isSameTree(p.right, q.right);
  }

  class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }

}
