package pertemuan8;


import java.util.Stack;

public class TugasStack2 {
    public static void main(String[] args) {

        /**
         * Buat 4 Object Stack dari class bernama Stack<E>
         * Hiruakan kata Object itu akan di bahas di meteri Object Oriented Programming
         * Gampanngannya buat varible dengan tipe data Stack
         * Dengan Tipe data sesuai yang ada di soal
         */
        //Integer
        Stack<Integer> stack1 = new Stack<>();

        //Char
        Stack<Character> stack2 = new Stack<>();

        //Double
        Stack<Double> stack3 = new Stack<>();

        //String
        Stack<String> stack4 = new Stack<>();


        /**
         * Isikan data ke dalam stack atau tumoukan tersebut
         * push satu satu persatu datanya kedalam stack
         */
        //stack 1
        // ketika sudah dipush semua isinya akan seperti ini {1001, 1002, 1003, 1004}
        stack1.push(1001);
        stack1.push(1002);
        stack1.push(1003);
        stack1.push(1004);

        //stack 2
        // ketika sudah dipush semua isinya akan seperti ini {V, W, X, Y, Z}
        stack2.push('V');
        stack2.push('W');
        stack2.push('X');
        stack2.push('Y');
        stack2.push('Z');

        //stack 3
        // ketika sudah dipush semua isinya akan seperti ini {5.1, 5.2, 5.3, 5.4}
        stack3.push(5.1);
        stack3.push(5.2);
        stack3.push(5.3);
        stack3.push(5.4);

        //stack 4
        // ketika sudah dipush semua isinya akan seperti ini {Saya, Suka, Java, Banget}
        stack4.push("Saya");
        stack4.push("Suka");
        stack4.push("Java");
        stack4.push("Banget");


        /**
         * Lakukan pop atau mengambil dan meremove data dari tumpukan
         * stack yang akan dilakukan pop adalah stack 2 dan 3
         * hasilnya adalah pada stack 2 {V, W}
         * dan pada stack 3 adalah {5.1, 5.2, 5.3}
         * Itu artinya pada stack 2 kita melakukan pop sebanyak 3 kali
         * dan pada stack 3 kita melakukan pop sebanyak 1 kali
         */
        // stack 2
        stack2.pop(); // ambil dan remove Z
        stack2.pop(); // ambil dan remove Y
        stack2.pop(); // ambil dan remove X

        //stack 3
        stack3.pop(); // ambil dan remove 5.4


        /**
         * Mencoba melakukan seraching pada stack ke 4
         * Dengan nilai yang dicari adalah Java
         * Dalam kasus ini kita akan menggunakan function atau method yang sudah disediakan
         * Methodnya adalah search(Obeject)
         * method ini akan mengembalikan data berupa tipe data Integer sebagai representasi indexnya
         */
        var result = stack4.search("Java");


        /**
         * Setelah melalui operasi-operasi di atas
         * kita tampilkan semua hasil dari semua stacknya
         * Kita bisa melihat akan ada beberapa perubahan pada isi stacknya
         */
        System.out.println("Isi Stack 1: " + stack1);
        System.out.println("Isi Stack 2: " + stack2);
        System.out.println("Isi Stack 3: " + stack3);
        System.out.println("Isi Stack 4: " + stack4);
        System.out.println("Hasil pencarian kata java dari stack 4: " + result);


        /**
         * Output yang akan dihasilkan adalah sebagai berikut
         *
         * Isi Stack 1: [1001, 1002, 1003, 1004]
         * Isi Stack 2: [V, W]
         * Isi Stack 3: [5.1, 5.2, 5.3]
         * Isi Stack 4: [Saya, Suka, Java, Banget]
         * Hasil pencarian kata java dari stack 4: 2
         */



    }
}
