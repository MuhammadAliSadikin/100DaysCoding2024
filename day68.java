package pkg100h_ngoding;

import java.util.Scanner;

public class day68 {

    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        System.out.print("Angka pertama : ");
        int a1 = ip.nextInt();
        System.out.print("Angka Kedua : ");
        int a2 = ip.nextInt();
        int hitung = Penjumlahan(a1, a2);
        System.out.println(a1 + " + " + a2 + " : " + hitung);

        int perkalian = hasilperkalian(a1, a2);
        System.out.println(a1+" X "+a2+" : " + perkalian);
    }

    public static int Penjumlahan(int a, int b) {
        int hasil = a + b;
        return hasil;

    }

    public static int hasilperkalian(int c, int d) {
        int hasil1 = c * d;
        return hasil1;
    }
}
