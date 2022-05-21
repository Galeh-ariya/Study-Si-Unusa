package pertemuan9;

import java.util.ArrayDeque;
import java.util.List;
import java.util.Queue;

public class TugasQueue2 {
    public static void main(String[] args) {

        /**
         * Kita akan melakuan push, insert, atau add
         * kedalam Queue yang kapasitasnya penuh
         * Kita akan buat sebua antiran dengan kapasitasnya hanya 5
         */

        Queue<String> queue = new ArrayDeque<>(5);

        /**
         * Tambahkan data sesuai kapasitas
         */
        queue.addAll(List.of("Galeh", "Ariya", "Irwana", "Struktur", "Data"));
        System.out.println(queue);


        /**
         * karena sekarang di antrian kapasitasnya sudah penuh
         * kita lihat apa yang terjadi ketika menambahkan data lagi
         */
        queue.add("Java");
        System.out.println(queue);

        /**
         * Yang terjadi adalah data tetap berhasil ditambahkan
         * dan tidak terjadi error sama sekali
         */

        /**
         * Output
         *
         * [Galeh, Ariya, Irwana, Struktur, Data]
         * [Galeh, Ariya, Irwana, Struktur, Data, Java]
         */


    }
}
