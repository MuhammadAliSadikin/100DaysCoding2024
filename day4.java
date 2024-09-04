package pkg100h_ngoding;

import java.util.Scanner;

public class day4 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("+------------------------+");
        System.out.println("|Pilihan Menu   |Harga   |");
        System.out.printf("|%-14s|%10s\n","1.Nasi Goreng","Rp.15000|");
        System.out.printf("|%-14s|%10s\n","2.Mie Goreng","Rp.12000|");
        System.out.printf("|%-14s|%10s\n","3.Mie Ayam","Rp.15000|");
        System.out.printf("|%-14s|%10s\n","4.Bubur Ayam","Rp.12000|");
        System.out.printf("|%-14s|%10s\n","5.Bakso","Rp.15000|");
        System.out.println("|6. Exit       |         |");
        System.out.println("+------------------------+");
        System.out.print("Pilih Menu(1-6): ");
        int pilihan = input.nextInt();
        String pesanan = "";
        int harga = 0;
        switch (pilihan) {
            case 1:
                pesanan = "Nasi Goreng";
                harga = 15000;
                break;
            case 2:
                pesanan = "Mie Goreng";
                harga = 12000;
                break;
            case 3:
                pesanan = "Mie Ayam";
                harga = 13000;
                break;
            case 4:
                pesanan = "Bubur Ayam";
                harga = 12000;
                break;
            case 5:
                pesanan = "Bakso";
                harga = 15000;
                break;
            case 6:
                System.out.printf("Terima Kasih!");
                System.exit(0);

            default:
                System.out.println("Menu Tidak Valid.");
                System.exit(0);

        }
        String output = String.format("Anda Memesan %s.Harga : Rp.%d", pesanan, harga);
        System.out.println(output);
        input.close();
    }

}
