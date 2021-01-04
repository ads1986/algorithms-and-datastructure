package com.datastructure.trie;

public class Node {

    public char c;
    public boolean isWord;
    public Node[] children;

    public Node(char c){
        this.c = c;
        this.isWord = false;
        this.children = new Node[26];
    }

}
