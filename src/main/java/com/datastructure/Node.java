package com.datastructure;

public class Node<T>{
    private Node next;
    private T t;

    public Node(T t) {
        this.t = t;
    }

    public Node getNextNode() {
        return next;
    }

    public void setNextNode(Node nextNode) {
        this.next = nextNode;
    }

    public void setT(T t) {
        this.t = t;
    }
}
