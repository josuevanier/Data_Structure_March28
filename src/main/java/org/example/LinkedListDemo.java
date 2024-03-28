package org.example;

import java.util.Scanner;

class Nodes{
    private int data;
    private Nodes next;

     Nodes(){
        data = 0;
        next = null;
    }
    public Nodes(int data, Nodes nodes){
        this.data = data;
        next = nodes;
    }

    public int getData() {
        return data;
    }

    public Nodes getNext() {
        return next;
    }

    public void setData(int data) {
        this.data = data;
    }

    public void setNext(Nodes next) {
        this.next = next;
    }
}

class LinkedListed{
    private  Nodes head;
    private int size;

    public LinkedListed(){
        head = null;
        size = 0;
    }
    public boolean isEmpty(){
        if(head == null) return true;
        else return false;
    }
    public int getListSize(){
        return size;
    }
    // Impliment the inseration operation

    // 1. insersation at head

    public void insertFirstValue(int val){
        Nodes n = new Nodes();
       n.setData(val);
       n.setNext(head);
       head = n;
    }
    public void insertAtLast(int val){
        Nodes n, t;
        n = new Nodes();
        n.setData(val);
        t = head; // head remains the same position

        if(t == head) {
            head = n;
        } else {
            while(t.getNext() != null){
                t = t.getNext();
                t.setNext(n);
            }
            size++;
        }
    }

    // Method insertion at position
    public void insertMiddleOfANode(int pos, int value){
        if(pos == 1) insertFirstValue(value);
        else if (pos == size + 1) insertAtLast(value);
        else if (pos > 1 && pos <= size) {
            Nodes n, t;

            n = new Nodes(value,null);
            t = head;

            n.setNext((t.getNext()));

            for(int i = 1; i < pos - 1; i++){
            t = t.getNext();
            }
            n.setNext(t.getNext());
            t.setNext(n);
            size++;
        }else {
            System.out.println("it is impossible to insert at given position");
        }
    }
    //1. delete first
    public void deleteNodeAtFirst(){
        if(head == null){
            System.out.println("LL is empty");
        }
        head = head.getNext();
        size--;
    }
    public void deleteLastNode(){
        if(isEmpty()){
            System.out.println("Head is empty");
        }else if(size == 1){
            head = null;
            size--;
        }else {
            Nodes t;
            t = head;

            for(int i = 1; i < size - 1; i++){
                t= t.getNext();
                t.setNext(null);
                size--;
            }
        }
    }
    public void deleteAtGivenPosition(int index){
        if(isEmpty()){
            System.out.println("LL is empty");
        }else if( index == 1){
            deleteNodeAtFirst();
        }
        else if(index == size ){
            deleteLastNode();
        }else {
            Nodes t, t1;
            t = head;
            for(int i = 1; i < index - 1; i++ ){
                t = t.getNext();
            }
            t1 = t.getNext();
            t.setNext(  t1.getNext());
            size--;
        }
    }

    public int searchItem(int key){
        int position = 1;
        Nodes current = head;
        while(current != null){
            if(current.getData() == key){
                return position;
            }
            current = current.getNext();
            position++;
        }
        return -1;
    }
    public void viewLL(){
        Nodes r;

        if(isEmpty()){
            System.out.println("LL is empty");
        }else {
            r = head;
         for(int i = 1; i <= size; i++){
             r.getNext();
         }
        }
    }
}
public class LinkedListDemo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        LinkedListed linkedListed = new LinkedListed();

        boolean flag = true;

        while (!flag){
            System.out.println("add item first position");
            System.out.println("delete item item");
            System.out.println("insert item");
            System.out.println(" item");

            System.out.println("Enter the choide enter q to break;");

            int choice = sc.nextInt();
            int v, pos;

        }

    }
    public void getUserMethod(int num, LinkedListed linkedListed){




    }
}