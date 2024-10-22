package pkg100h_ngoding;

import java.util.Scanner;

public class day51 {

    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        System.out.println("Menu Makanan ");
        System.out.println("--------------------------------------");
        System.out.println("1.Bakso \tRp.10K\n2.Mie Ayam\tRp.12K \n3.Nasi Goreng\tRp.10K \n4.Exit");
        System.out.print("Menu Yang Dipilih : ");
        int pilihan = ip.nextInt();
        System.out.print("Jumlah Porsi : ");
        int porsi = ip.nextInt();
        String Pesanan = " ";
        int total = 0;
        int harga = 0;
        switch (pilihan) {
            case 1:
                Pesanan = "Bakso";
                harga = 10000;
                total = porsi * harga;
                break;
            case 2:
                Pesanan = "Mie Ayamn";
                harga = 12000;
                total = porsi * harga;
                break;
            case 3:
                Pesanan = "Nasi Goreng";
                harga = 10000;
                total = porsi * harga;
                break;
            case 4:
                Pesanan = "Terima Kasih";
                System.exit(0);
            default:
                System.out.println("Maaf Pilihan Tidak Valid");
                System.exit(0);

        }
        System.out.println("--------------------------------------");
        System.out.println("Ada Memesan " + Pesanan + " " + porsi + " porsi");
        System.out.println("Total Harga : Rp." + total);
    }
}
