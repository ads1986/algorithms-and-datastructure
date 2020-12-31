package com.algorithms;

import com.datastructure.Tree;

import java.util.LinkedList;
import java.util.Queue;

public class BFS {


    public static int search(Tree node, String nodeName) {

        if (node == null || nodeName == null || nodeName.isEmpty())
            return -1;

        System.out.print("Path: ");
        System.out.print(node.name + " -> ");

        if (nodeName.equalsIgnoreCase(node.name)){
            return 1;
        }

        Queue<Tree> queue = new LinkedList<>();
        queue.add(node);

        Tree root;

        while(!queue.isEmpty()){
            root = queue.poll();

            if (root.left != null) {
                System.out.print(root.left.name + " -> ");

                if (nodeName.equalsIgnoreCase(root.left.name))
                    return 1;
                else
                    queue.add(root.left);
            }

            if (root.right != null) {
                System.out.print(root.right.name + " -> ");

                if (nodeName.equalsIgnoreCase(root.right.name))
                    return 1;
                else
                    queue.add(root.right);
            }
        }

        return 0;
    }

}
