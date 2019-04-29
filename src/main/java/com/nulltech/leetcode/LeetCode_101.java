package com.nulltech.leetcode;

import java.util.ArrayList;
import java.util.List;

public class LeetCode_101 {

  public static void main(String[] args) {

  }

  public boolean isSymmetric(TreeNode root) {
    if (root == null) {
      return true;
    }
    List<TreeNode> list = new ArrayList<>();
    list.add(root.left);
    list.add(root.right);
    while (sameReverse(list)) {
      list = findChildContainsNull(list);
      if (list.size() == 0) {
        return true;
      }
    }
    return sameReverse(list);
  }

  public boolean sameReverse(List<TreeNode> nodes) {
    for (int i = 0; i < nodes.size(); i++) {
      if (nodes.get(i) == null && nodes.get(nodes.size() - 1 - i) == null) {
        continue;
      }
      if (nodes.get(i) == null && nodes.get(nodes.size() - 1 - i) != null) {
        return false;
      }
      if (nodes.get(i) != null && nodes.get(nodes.size() - 1 - i) == null) {
        return false;
      }
      if (nodes.get(i).val != nodes.get(nodes.size() - 1 - i).val) {
        return false;
      }
    }
    return true;
  }

  public List<TreeNode> findChildContainsNull(List<TreeNode> nodes) {
    List<TreeNode> list = new ArrayList<>();
    for (TreeNode node : nodes) {
      if (node == null) {
        continue;
      }
      list.add(node.left);
      list.add(node.right);
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
