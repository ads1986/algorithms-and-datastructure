package com.algorithms;

import com.datastructure.Tree;

public class DFS {

    public static void traversePreorder(Tree node) {

        if (node != null){

            System.out.print(node.name + " -> ");

            traversePreorder(node.left);
            traversePreorder(node.right);
        }
    }

    public static void traverseInOrder(Tree node) {

        if (node != null){
            traversePreorder(node.left);
            traversePreorder(node.right);

            System.out.print(node.name + " -> ");
        }



    }
}
