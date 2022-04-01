package study;

import java.util.Random;

public class SelectionSort {
    public static void main(String[] args) {

        String[] name = {
                "ika", "adi", "din", "aku", "ima", "lia"
        };

        selectionSort(name);

    }

    public static void selectionSort( String[] array ) {

        for (int i = 0; i < array.length - 1; i++) {

            int min = i;
            for (int j = i + 1; j < array.length; j++) {

                if (array[j].compareTo(array[min]) < 0) min = j;
                // setelah sampai sebelum < 0

            }

            String temp = array[i];
            array[i] = array[min];
            array[min] = temp;
        }

        for (var i : array) {
            System.out.println(i);

        }

    }
}
