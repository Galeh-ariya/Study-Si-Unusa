package uts;

public class Insertion4 {
    public static void main(String[] args) {

        int[] data2 = {
                9, 18, 27, 28, 30, 45, 50, 54, 58, 61, 63, 77, 89
        };

        insertSt(data2);

    }

    public static void insertSt(int[] array) {
        int n = array.length;

        for(var i = 1; i < n; i++) {
            int key = array[i];

            int j = i-1;

            while (j >= 0) {
                if(key > array[j]) {
                    break;
                }

                array[j+1] = array[j];
                j--;
            }

            array[j+1] = key;

        }

        for(var i : array) {
            System.out.print(i + ", ");
        }
    }

}
