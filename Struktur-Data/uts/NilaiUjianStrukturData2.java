package uts;

public class NilaiUjianStrukturData2 {
    public static void main(String[] args) {

        var nilai = 50;
        ketentuanNilai(nilai);

    }

    public static void ketentuanNilai(int nilai) {

        if(nilai >= 85) {
            System.out.println("A");
        } else if(nilai >= 75) {
            System.out.println("B");
        } else if(nilai >= 60) {
            System.out.println("C");
        } else if(nilai >= 50) {
            System.out.println("D");
        } else if(nilai < 50) {
            System.out.println("E");
        }

    }
}
