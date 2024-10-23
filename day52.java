package pkg100h_ngoding;

import java.util.Scanner;

public class day52 {

    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        System.out.println("    DAFTAR MENU");
        System.out.println("1.Ayam Geprek \tRp.10K\n2.Ayam Kecap \tRp.12K\n3.Ayam Goreng \tRp.10K\n4.Ayam Madu \tRp.15K\n5.Exit");
        System.out.print("Menu yang dipilih : ");
        int pilih = ip.nextInt();
        String pesanan = " ";
        int harga = 0;
        int total = 0;
        pesanan = (pilih == 1) ? "Ayam Geprek"
                : (pilih == 2) ? "ayam Kecap"
                        : (pilih == 3) ? "Ayam Goreng"
                                : (pilih == 4) ? "Ayam Madu"
                                        : (pilih == 5) ? "Terima Kasih"
                                                : "Pilihan Tidak Valid";
        harga = (pilih == 1 || pilih == 3) ? 10000 : (pilih == 2) ? 12000 : (pilih == 4) ? 15000 : 0;
        if (pilih == 5) {
            System.exit(0);
        } else if (pilih < 1 || pilih > 5) {
            System.out.println("Maaf pilihan Tidak ada");
            System.exit(0);
        } else {
            System.out.print("Jumlah Porsi : ");
            int porsi = ip.nextInt();
            total = porsi * harga;
            System.out.printf("Anda Memesan %s %d porsi", pesanan, porsi);
            System.out.printf("%nTotal Harga : Rp.%d%n", total);
        }
        ip.close();
    }
}
