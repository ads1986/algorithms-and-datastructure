package com.datastructure;

public class LinkedList<T> {

    private Node<T> node;
    private int count;

    /**
     * Adding node
     * Time complexity : O(1)
     * Space complexity: O(1)
     * */
    public void add(T t){
        if (this.node == null) {
            this.node = new Node<T>(t);
        } else {
            if (this.node.next == null) {
                this.node.next = new Node<T>(t);
            } else {
                Node temp = this.node.next;
                this.node.next = new Node<T>(t);
                this.node.next.next = temp;
            }
        }
        this.count += 1;
    }

    /**
     * Removing node
     * Time complexity : O(n)
     * Space complexity: O(1)
     * */
    public void remove(T t){
        if (node != null) {
            /*Node temp = this.node;

            while (temp != null) {
                if (temp.data == t) {
                    Node next = temp.next;
                    temp = null;
                    temp = next;
                    break;
                }

                temp = temp.next;
            }*/
        }
    }

    /**
     * Time complexity : O(n)
     * Space complexity: O(1)
     * */
    public T find(T t){
        Node<T> node = this.findNode(t);
        if (node != null)
            return node.data;
        return null;
    }

    public int size(){
        return count;
    }

    private Node<T> findNode(T t){
        if (this.node == null)
            return null;

        if (this.node.data == t)
            return this.node;

        Node<T> temp = this.node.next;

        while(temp != null){
            if (temp.data == t)
                return temp;

            temp = temp.next;
        }

        return null;
    }
}
