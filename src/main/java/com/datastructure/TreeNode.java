package com.datastructure;

/**
 *  Tree datastructure
 *
 */
public class TreeNode {
    public String name;
    public TreeNode left;
    public TreeNode right;

    public TreeNode() {}

    public TreeNode(String name) {
        this.name = name;
    }

    public TreeNode(String name, TreeNode left, TreeNode right) {
        this.name = name;
        this.left = left;
        this.right = right;
    }

    public TreeNode(TreeNode left, TreeNode right) {
        this.left = left;
        this.right = right;
    }
}