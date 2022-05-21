package pertemuan9;

import java.util.ArrayDeque;
import java.util.List;
import java.util.Queue;

public class TugasQueue {
    public static void main(String[] args) {

        /**
         * Buat sebuah antrian atau Queue dengan max panjangnyanya atau kapasitasnya 6
         */
        Queue<Integer> queue = new ArrayDeque<>(6);

        /**
         * Masukkan sebuah angka ke dalam antrian
         * contohnya seperti di soal adalah
         * 1 6 0 6
         */

        queue.addAll(List.of(1, 6, 0, 6));
        System.out.println(queue);


        /**
         * Lakukan operasi enqueue atau add ke dalam Queue
         * dan masukkan data 9 8 7 secara bertahap
         */

        queue.offer(9);
        queue.offer(8);
        queue.offer(7);
        System.out.println(queue);


        /**
         * Setelah melakukan operasi diatas kita lakukan dequeue
         * atau ambil datanya kemudian kita remove dari queue
         * lakukan operasi Dequeue sebanyak 2 kali
         */

        queue.poll();
        queue.poll();
        System.out.println(queue);


        /**
         * Untuk mengetahui head dari sebuah antrian
         * atau element paling depan dari sebuah antrian
         * kita lakukan operasi peek sebanyak 1 kali
         * karena method peek akan mengembalikan sebuah nilai
         * maka alangkah baiknya jika kita tampung nilainya
         * kedalam sebuah variable
         */

        var head = queue.peek();
        System.out.println("Head saat ini : " + head);

        /**
         * Terakhit kita lakukan sesuai soal
         * kita lakukan Enqueue lagi
         * atau menambahkan nilai baru kedalam antrian
         * nilai yang akan kita tambahkan adalah 7
         */

        queue.offer(7);
        System.out.println(queue);

        /**
         * Setelah operasi diatas selesai dilakukan
         * maka kita bisa lihat outpunya atau hasil akhirnya seperti apa
         *
         * Output
         *
         * [1, 6, 0, 6]
         * [1, 6, 0, 6, 9, 8, 7]
         * [0, 6, 9, 8, 7]
         * Head saat ini : 0
         * [0, 6, 9, 8, 7, 7]
         */



    }
}
