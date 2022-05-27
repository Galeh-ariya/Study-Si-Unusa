package pertemuan10.SingleLinkedList;

import java.util.Scanner;

public class SingleListApp {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        LinkedListImpl list = new LinkedListImpl();
        System.out.println("Let's try Single List\n");

        char code;

        do {
            System.out.println("Perintah\n");
            System.out.println("1. Masukkan dari awal");
            System.out.println("2. Masukkan dari akhir");
            System.out.println("3. Masukkan dari ke N");
            System.out.println("4. Hapus posisi");
            System.out.println("5. Cek Kosong");
            System.out.println("6. Cek Size");

            System.out.print("\nMasukkan nomor:");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1 -> {
                    System.out.println("Masukkan Data");
                    list.insertStart(scanner.nextLine());
                    break;
                }
                case 2 -> {
                    System.out.println("Masukkan Data");
                    list.insertEnd(scanner.nextLine());
                    break;
                }
                case 3 -> {
                    System.out.println("Masukkan Data");
                    String data = scanner.nextLine();
                    System.out.println("Enter Position");
                    int n = scanner.nextInt();

                    if(n < 1 || n > list.getSize()) {
                        System.out.println("Posisi tidak valid\n");
                    } else {
                        list.insertToN(data, n);
                        break;
                    }
                }
                case 4 -> {
                    System.out.println("Masukkan Posisi");
                    int p = scanner.nextInt();

                    if(p < 1 || p > list.getSize()) {
                        System.out.println("Position tidak valid\n");
                    } else  {
                        list.removeToN(p);
                        break;
                    }
                }
                case 5 -> {
                    System.out.println("Cek kosong: " + list.isEmpty());
                    break;
                }
                case 6 -> {
                    System.out.println("Size: " + list.getSize() + "\n");
                    break;
                }
            }

            list.display();
            System.out.println("\nMau Lanjut? (type y or n)");

            code = scanner.next().charAt(0);

        } while (code == 'Y' || code == 'y');

    }
}
