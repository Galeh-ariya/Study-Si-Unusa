/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Pertemuan11;

/**
 *
 * @author Nanda D. Cahyo
 */
public class CircularLinkedList {
    public class Node {
        double data;
        Node next;
        public Node(double data) {
            this.data = data;
        }
    }
    
    public Node head = null;
    public Node tail = null;
    
    public void add(double data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
            newNode.next = head;
        } else {
            tail.next = newNode;
            tail = newNode;
            tail.next = head;
        }
    }
    
    public void display() {
        Node current = head;
        if (head == null) {
            System.out.println("List is empty");
        } else {
            System.out.println("Nodes of the circular linked list : ");
            do {
                System.out.print(" " + current.data);
                current = current.next;
            } while (current != head);
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        CircularLinkedList cl = new CircularLinkedList();
        
        cl.add(10.13);
        cl.add(20.23);
        cl.add(30.543);
        cl.add(40.235);
        
        cl.display();
    }
}
