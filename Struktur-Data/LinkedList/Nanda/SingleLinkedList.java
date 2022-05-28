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
public class SingleLinkedList {
    Node head;
    
    static class Node {
        String data;
        Node next;
        
        Node(String d) {
            data = d;
            next = null;
        }
    }
    
    public void display() {
        Node n = head;
        while (n != null) {
            System.out.print(n.data + " ");
            n = n.next;
        }
    }
    
    public static void main(String[] args) {
        SingleLinkedList list = new SingleLinkedList();
        
        list.head = new Node("Data 1");
        Node second = new Node("Data 2");
        Node third = new Node("data 3");
        
        list.head.next = second;
        second.next = third;
        list.display();
        System.out.println("");
    }
}
