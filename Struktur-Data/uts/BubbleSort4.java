package uts;

public class BubbleSort4 {
    public static void main(String[] args) {

        String[] data1 = {
                "ccc", "zzz", "kkk", "jjj", "mmm", "ooo", "ddd",
                "aaa", "iii", "uuu", "eee", "ggg", "ttt", "qqq", "sss"
        };

        bubble(data1);

        for(var i : data1) {
            System.out.print(i + ", ");
        }

    }

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
}
