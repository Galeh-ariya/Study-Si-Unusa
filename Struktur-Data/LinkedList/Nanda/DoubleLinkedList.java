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
public class DoubleLinkedList {
    class Node {
        float item;
        Node previous;
        Node next;
        
        public Node(float item) {
            this.item = item;
        }
    }
    
    Node head, tail = null;
    
    public void addNode(float item) {
        Node newNode = new Node(item);
        
        if (head == null) {
            head = tail = newNode;
            head.previous = null;
            head.next = null;
        } else {
            tail.next = newNode;
            newNode.previous = tail;
            tail = newNode;
            tail.next = null;
        }
    }
    
    public void printNodes() {
        Node current = head;
        if (head == null) {
            System.out.println("Double linked list is empty!");
            return;
        }
        System.out.println("Nodes of double linked list : ");
        while (current != null) {
            System.out.print(current.item + " ");
            current = current.next;
        }
    }
    
    public static void main(String[] args) {
        DoubleLinkedList dl_list = new DoubleLinkedList();
        
        dl_list.addNode(10.5f);
        dl_list.addNode(22.3f);
        dl_list.addNode(17.2f);
        dl_list.addNode(34.9f);
        dl_list.addNode(13.03f);
        
        dl_list.printNodes();
        System.out.println("");
    }
}
