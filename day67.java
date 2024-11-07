package pkg100h_ngoding;

import java.util.Scanner;

public class day67 {

    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        System.out.print("Masukkan Tinggi : ");
        cetakPolaSegitiga(ip.nextInt());
        System.out.print("Masukkan Panjang & Lebar : ");
        cetakPolaPersegiPanjang(ip.nextInt(), ip.nextInt());
    }

    public static void cetakPolaSegitiga(int tinggi) {

        for (int i = 1; i <= tinggi; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }

    }

    public static void cetakPolaPersegiPanjang(int panjang, int lebar) {
        for (int i = 1; i < panjang; i++) {
            for (int j = 1; j < lebar; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }

}
