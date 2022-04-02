package study;

public class InsertionSort {
    public static void main(String[] args) {


        String[] name = {
                "ika", "adi", "din", "aku", "ima", "lia"
        };

        insertString(name);

    }

    public static void insertString(String[] array) {
        int n = array.length;

        // cantika, dea, ayu
        for(var i = 1; i < n; i++) {
            String key = array[i];
//            key = [1]dea
//            key = [2]ayu

            int j = i-1;
//            j = [0]cantika
//            j = [1]dea

            while (j >= 0) {
                // dea compare cantika > 0 = 1 (true) => skip
                // ayu compare dea > 0 = -3 (false) => next
                // ayu compare cantika > 0 = -2 (false) => next
                if(key.compareTo(array[j]) > 0) {
                    break;
                }

                // jika next akan ke sini
                array[j+1] = array[j];
                // [2] = dea
                // [1] = cantika
                j--;
            }

            // jika skip akan langsung ke sini
            array[j+1] = key;
            //[0] =  ayu

        }

        for(var i : array) {
            System.out.print(i + ", ");
        }
    }

}
