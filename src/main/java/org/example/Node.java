package org.example;

public class Node {
    private Object element;
    private Node next;

    public Node(){
        this(null,null);
    }

    public Node(Object e, Node n){
        element = e;
        next = n;
    }
}
