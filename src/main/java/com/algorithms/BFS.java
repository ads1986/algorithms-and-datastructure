package com.algorithms;

import com.datastructure.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class BFS {


    public static int search(TreeNode node, String nodeName) {

        if (node == null || nodeName == null || nodeName.isEmpty())
            return -1;

        System.out.print("Path: ");
        System.out.print(node.name + " -> ");

        if (nodeName.equalsIgnoreCase(node.name)){
            return 1;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(node);

        TreeNode root;

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