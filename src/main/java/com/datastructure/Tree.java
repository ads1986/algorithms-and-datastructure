package com.datastructure;

/**
 *  Tree datastructure
 *
 */
public class Tree {
    public String name;
    public Tree left;
    public Tree right;

    public Tree() {}

    public Tree(String name) {
        this.name = name;
    }

    public Tree(String name, Tree left, Tree right) {
        this.name = name;
        this.left = left;
        this.right = right;
    }

    public Tree(Tree left, Tree right) {
        this.left = left;
        this.right = right;
    }
}
