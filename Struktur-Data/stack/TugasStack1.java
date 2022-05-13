package pertemuan8;

import java.util.Stack;

public class TugasStack1 {
    public static void main(String[] args) {

        /**
         * Pertama yang dibuat adalah data yang akan di push atau di masukkan ke dalam stack
         * Tipe data yang digunakan dalam contoh ini adalah Integer (tipe data bukan primitif)
         * yang dimasukkan ke dalam variabel tumpukan
         */
        Integer[] tumpukan = {100, 200, 300, 400, 500};


        /**
         * Seteleh ada datanya kita buat sebuah Object stack dari sebuah class bernama Stack<E>
         * Gunanya adalah untuk tempat untuk memasukkan data dalam bentuk stack (tumpukan)
         */
        Stack<Integer> stack = new Stack<>();


        /**
         * Memasukkan data ke dalam tumpukan
         * dan juga menampilkan prosesnya
         * maksudnya ialah memeperlihatkan setiap satu persatu data di masukkan
         * ketika dimasukkan menambahnya di sebelah mana atau di tempatkan dimana
         */
        System.out.println("Memasukkan data ke dalam stack");
        //push pertama
        stack.push(tumpukan[0]);
        System.out.println(stack);

        //push kedua
        stack.push(tumpukan[1]);
        System.out.println(stack);

        //push ketiga
        stack.push(tumpukan[2]);
        System.out.println(stack);

        //push keempat
        stack.push(tumpukan[3]);
        System.out.println(stack);


        /**
         * Mengambil value dan meremove value yang ada di stcak
         * kemudian akan di tampilkan secara bertahap agar terlihat prosesnya
         */
        System.out.println("Menampilkan data (pop) serta me remove dari tumpukan");
        // pop pertama
        System.out.println(stack);
        stack.pop();

        // pop kedua
        System.out.println(stack);
        stack.pop();

        // pop ketiga
        System.out.println(stack);
        stack.pop();

        // pop keempat
        System.out.println(stack);
        stack.pop();


        /**
         * Output dari operasi stack diatas
         *
         * Memasukkan data ke dalam stack
         * [100]
         * [100, 200]
         * [100, 200, 300]
         * [100, 200, 300, 400]
         * Menampilkan data (pop) serta me remove dari tumpukan
         * [100, 200, 300, 400]
         * [100, 200, 300]
         * [100, 200]
         * [100]
         */



    }
}
