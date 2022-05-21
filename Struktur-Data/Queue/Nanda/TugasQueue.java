/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Pertemuan10;

import java.util.Arrays;
import java.util.concurrent.ArrayBlockingQueue;

/**
 *
 * @author Nanda D. Cahyo
 */
public class TugasQueue {
    public static void main(String[] args) {
        Integer[] array = {1, 6, 0, 6};
        
        ArrayBlockingQueue<Integer> queue = new ArrayBlockingQueue<>(6);
        
        queue.addAll(Arrays.asList(array));
        
        System.out.println("Queue : " + queue);
        System.out.println("");
        
        enqueue(queue, 9);
        enqueue(queue, 8);
        enqueue(queue, 7);
        dequeue(queue);
        System.out.println("Peek -> (" + queue.peek() + ")");
        System.out.println("Queue : " + queue);
        System.out.println("");
        dequeue(queue);
        enqueue(queue, 7);
    }
    
    private static void enqueue(ArrayBlockingQueue queue, int a) {
        boolean offer = queue.offer(a);
        
        System.out.println("Enqueue -> (" + a + ")");
        
        if (!offer) {
            System.out.println("Queue penuh tidak dapat ditambahkan");
        }
        
        System.out.println("Queue : " + queue);
        System.out.println("");
    }
    
    private static void dequeue(ArrayBlockingQueue queue) {
        System.out.print("Dequeue -> ");
        Integer a = (Integer) queue.poll();
        System.out.print("(");
        System.out.print(a);
        System.out.println(")");
        
        if (a == null) {
            System.out.println("Queue sudah habis");
        }
        
        System.out.println("Queue : " + queue);
        System.out.println("");
    }
}
