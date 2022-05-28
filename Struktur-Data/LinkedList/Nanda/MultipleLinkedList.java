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
public class MultipleLinkedList {
    public static class Node {
        String data;
        Node next;
        Node child;
    }
    
    public static Node createList(String arr[], int n) {
        Node head = null;
        Node tmp = null;
        
        for (int i = 0; i < n; i++) {
            if (head == null) {
                tmp = head = new Node();
            } else {
                tmp.next = new Node();
                tmp = tmp.next;
            }
            
            tmp.data = arr[i];
            tmp.next = tmp.child = null;
        }
        
        return head;
    }
    
    public static void printMultiLevelList(Node head) {
        while (head != null) {
            if (head.child != null) {
                printMultiLevelList(head.child);
            }
            System.out.print(head.data + " ");
            head = head.next;
        }
    }
    
    public static void main(String[] args) {
        String arr1[] = {"Pemrogramman", "Dengan", "Java"};
        String arr2[] = {"Belajar", "PHP"};
        String arr3[] = {"Android"};
        String arr4[] = {"Java", "Dan", "Kotlin"};
        
        Node head1 = createList(arr1, arr1.length);
        Node head2 = createList(arr2, arr2.length);
        Node head3 = createList(arr3, arr3.length);
        Node head4 = createList(arr4, arr4.length);
        
        head1.child = head2;
        head1.next.next.child = head3;
        head2.next.child = head4;
        
        Node head = null;
        head = head1;
        
        printMultiLevelList(head);
        System.out.println("");
    }
}
