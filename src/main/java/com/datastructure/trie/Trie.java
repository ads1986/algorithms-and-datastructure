package com.datastructure.trie;

public class Trie {

    private Node root;

    public Trie() {
        this.root = new Node('\0');
    }

    public void insert(String word){
        char[] letters = word.toCharArray();
        Node curr = this.root;
        for(char letter : letters){
            if (curr.children[letter - 'a'] == null) curr.children[letter - 'a'] = new Node(letter);
            curr = curr.children[letter - 'a'];

        }
        curr.isWord = true;
    }

    public boolean search(String word){
        Node node = getNode(word);
        return node != null && node.isWord;
    }

    public Node getNode(String word){
        Node curr = this.root;
        for (char letter : word.toCharArray()){
            if (curr.children[letter - 'a'] == null) return null;
            curr = curr.children[letter - 'a'];
        }
        return curr;
    }

}
