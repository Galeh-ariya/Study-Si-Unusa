package study;

class BinarySearchSatuDimensi {
    public static void main(String[] args) {

        int[] angka1 = {
                12, 10, 7, 5, 33, 8, 2, 15
        };


        insertSort(angka1);

        binarySearch(angka1, 15);


    }

    public static boolean binarySearch(int[] array, int value) {
        int min = 0;
        int max = array.length - 1;
        int mid;

        while (min <= max) {
            mid = (min + max) / 2;

            if (array[mid] == value) {
                System.out.println("Nilai " + value + " ditemukan");
                return true;
            } else {
                if (value > array[mid]) {
                    min = mid + 1;
                } else {
                    max = mid - 1;
                }
            }
        }

        System.out.println("Nilai " + value + " tidak ditemukan");
        return false;
    }


    public static void insertSort(int[] angka) {
        int panjang = angka.length;

        for (var i = 1; i < panjang; i++) {
            int key = angka[i];
            int j = i - 1;

            while ((j > -1) && angka[j] > key) {
                angka[j + 1] = angka[j];
                j--;
            }

            angka[j + 1] = key;
        }
    }

}