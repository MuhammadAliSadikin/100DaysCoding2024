package pkg100h_ngoding;

import java.util.Scanner;

public class day70 {

    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        keluar:
        while (true) {
            System.out.println("Daftar Operasi Aritmatika");
            System.out.println("1.Penambahan");
            System.out.println("2.Pengurangan");
            System.out.println("3.Perkalian");
            System.out.println("4.Pembagian");
            System.out.println("5.Keluar");
            System.out.print("Pilihan : ");
            int pilih = ip.nextInt();
            switch (pilih) {
                case 1:
                    System.out.print("Angka pertama : ");
                    int a1 = ip.nextInt();
                    System.out.print("Angka Kedua : ");
                    int a2 = ip.nextInt();
                    int penambahan = hasiltambah(a1, a2);
                    System.out.println(a1 + " + " + a2 + " : " + penambahan);
                    break;
                case 2:
                    System.out.print("Angka pertama : ");
                    int a3 = ip.nextInt();
                    System.out.print("Angka Kedua : ");
                    int a4 = ip.nextInt();
                    int pengurangan = hasilpengurangan(a3, a4);
                    System.out.println(a3 + " - " + a4 + " : " + pengurangan);
                    break;
                case 3:
                    System.out.print("Angka pertama : ");
                    int a5 = ip.nextInt();
                    System.out.print("Angka kedua : ");
                    int a6 = ip.nextInt();
                    int perkalian = hasilperkalian(a5, a6);
                    System.out.println(a5 + " X " + a6 + " : " + perkalian);
                    break;
                case 4:
                    System.out.print("Angka pertama : ");
                    int a7 = ip.nextInt();
                    System.out.print("Angka kedua : ");
                    int a8 = ip.nextInt();
                    int pembagian = hasilpembagian(a7, a8);
                    System.out.println(a7 + " / " + a8 + " : " + pembagian);
                    break;
                case 5:
                    System.out.println("Program selesai");
                    break keluar;
                default:
                    System.out.println("Pilihan tidak valid");
            }

        }
    }

    public static int hasiltambah(int a1, int a2) {
        return a1 + a2;
    }

    public static int hasilpengurangan(int a3, int a4) {
        return a3 - a4;
    }

    public static int hasilperkalian(int a5, int a6) {
        return a5 * a6;
    }

    public static int hasilpembagian(int a7, int a8) {
        return a7 / a8;
    }
}
