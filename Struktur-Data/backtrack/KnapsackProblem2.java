/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Pertemuan3;

/**
 *
 * @author Nanda D. Cahyo
 */
public class KnapsackProblem2 {
    public static void main(String[] args) {
        int[] nilai = {60, 100, 120};
        int[] berat = {10, 20, 30};
        int kapasitas = 50;
        int n = nilai.length;
        
        System.out.println(knapsack(kapasitas, berat, nilai, n));
    }
    
    public static int max(int a, int b) {
//        return (a > b) ? a : b;
        
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }
    
    public static int knapsack(int kapasitas, int[] berat, int[] nilai, int n) {
        if (n == 0 || kapasitas == 0) {
            return 0;
        }
        
        if (berat[n-1] > kapasitas) {
            return knapsack(kapasitas, berat, nilai, n-1);
        } else {
            return max(nilai[n-1] + knapsack(kapasitas - berat[n-1], berat, nilai, n-1), knapsack(kapasitas, berat, nilai, n-1));
        }
    }
}
