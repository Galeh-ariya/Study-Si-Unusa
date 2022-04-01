/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Pertemuan5;

/**
 *
 * @author Nanda D. Cahyo
 */
public class BubbleSort {
    public static void bubble(String[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[j].compareTo(array[i]) < 0) {
                    String temp = array[j];
                    array[j] = array[i];
                    array[i] = temp;
                }
            }
        }
    }
    
    public static void main(String[] args) {
        String[] array = {"Ika", "Adi", "Din", "Aku", "Ima", "Lia"};
        
        System.out.println("Array sebelum terurut:");
        
        for (String array1 : array) {
            System.out.print(array1 + " ");
        }
        
        System.out.println();
        System.out.println();
        
        bubble(array);
        
        System.out.println("Array setelah diurut:");
        
        for (String array1 : array) {
            System.out.print(array1 + " ");
        }
        System.out.println();
    }
}
