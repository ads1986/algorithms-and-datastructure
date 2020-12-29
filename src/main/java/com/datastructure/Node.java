package com.datastructure;

public class Node<T>{
    public Node next;
    public T data;

    public Node(T data) {
        this.data = data;
    }

    public Node(Node next, T data) {
        this.next = next;
        this.data = data;
    }
}
