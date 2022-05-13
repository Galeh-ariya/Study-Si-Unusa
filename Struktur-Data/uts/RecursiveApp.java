package study;

public class RecursiveApp {
    public static void main(String[] args) {

        /**
         * Rescursive
         *
         * if di dalam if = recursive neasted
         * for di dalam dor = recursive = neasted for
         *
         * recursive method
         * value 5 * factorialRecursv(value - 1);
         * factorialRecursive(4) * factorial(value - 1) == 3
         * factorialRecursive(3) * factorial(value - 1) == 2
         *
         * 1 waiting 4
         * 4 waiting 3
         * 3 waiting 2
         * 2 waiting 1
         * 1
         * 1 * 2 * 3 * 4 * 5
         *
         * Tanpa Menggunakan Recursive Method
         * 1 * 1 =  1
         * 1 * 2 = 2
         * 2 * 3 = 6
         * 6 * 4 = 24
         * 24 * 5 = 120
         * hasil = hasil * i
         */

        // neasted if
        if(true) {
            if(true) {
                // action
            }
        }

        // neasted for
        for(var i = 0; i < 10 ; i++) {
           for(var j = 0; j < 10 ; j++) {
               //action
           }
        }

        // Study Kasus factorial
        // 5! = 5 * 4 * 3 * 2 * 1

        // tanpa recursive
        var result = factorial(5);
        System.out.println(result);

        // recursive method
        var result2 = factorialRecursv(5);
        System.out.println(result2);

    }

    public static int factorialRecursv(int value) {
        // menggunakan recursive method
        if(value == 1) {
            return 1;
        } else {
            return value * factorialRecursv(value - 1);
        }
    }


    public static int factorial(int value) {
        // menggunakan perulangan biasa
        var hasil = 1;
        for(var i = 1; i <= value; i++) {
            hasil *= i;
        }

        return hasil;

    }

}
