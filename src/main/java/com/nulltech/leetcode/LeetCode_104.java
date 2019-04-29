package com.nulltech.leetcode;

import java.util.ArrayList;
import java.util.List;

public class LeetCode_104 {

  public static void main (String [] args) {

  }
  public int maxDepth(TreeNode root) {
    if (root == null) return 0;
    boolean flag = true;
    List<TreeNode> list = new ArrayList<>();
    list.add(root);
    int count = 0;
    while (flag) {
      list = findChild(list);
      count++;
      if (list.size() == 0) flag = false;
    }
    return count;
  }

  public List<TreeNode> findChild (List<TreeNode> nodes) {
    List<TreeNode> list = new ArrayList<>();
    for (TreeNode node:nodes) {
      if(node.left != null) list.add(node.left);
      if(node.right != null) list.add(node.right);
    }
    return list;
  }
  class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
  }
}

