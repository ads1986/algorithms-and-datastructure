package com.algorithms;

import com.datastructure.TreeNode;

public class DFS {

    public static void traversePreorder(TreeNode node) {

        if (node != null){

            System.out.print(node.name + " -> ");

            traversePreorder(node.left);
            traversePreorder(node.right);
        }
    }

    public static void traverseInOrder(TreeNode node) {

        if (node != null){
            traversePreorder(node.left);
            traversePreorder(node.right);

            System.out.print(node.name + " -> ");
        }



    }
}
