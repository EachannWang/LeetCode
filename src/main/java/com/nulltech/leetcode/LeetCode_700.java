package com.nulltech.leetcode;

import java.util.ArrayList;
import java.util.List;

public class LeetCode_700 {

  public static void main(String[] args) {

  }

  public TreeNode searchBST(TreeNode root, int val) {
    if (root == null) {
      return null;
    }
    List<TreeNode> list = new ArrayList<>();
    list.add(root);
    boolean flag = true;
    while (flag) {
      for (TreeNode node : list) {
        if (node.val == val) {
          return node;
        }
      }
      list = findChild(list);
      if (list.size() == 0) {
        flag = false;
      }
    }
    return null;
  }

  public List<TreeNode> findChild(List<TreeNode> nodes) {
    List<TreeNode> list = new ArrayList<>();
    for (TreeNode node : nodes) {
      if (node.left != null) {
        list.add(node.left);
      }
      if (node.right != null) {
        list.add(node.right);
      }
    }
    return list;
  }

  class TreeNode {

    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
      val = x;
    }
  }
}
