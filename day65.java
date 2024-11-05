package pkg100h_ngoding;

import java.util.Scanner;

public class day65 {

    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        System.out.print("Masukan Angka : ");
        int a = ip.nextInt();
        System.out.print("Masukan Angka : ");
        int b = ip.nextInt();
        System.out.println("----------");
        System.out.println("Penjumlahan");
        for (int i = 1; i <= a; i++) {
            for (int j = 1; j <= b; j++) {
                System.out.println(i + " + " + j + " : " + (i + j));
            }
            System.out.println();
        }
        System.out.println("----------");
        System.out.println("Perkalian\n");
        for (int i = 1; i <= a; i++) {
            for (int j = 1; j <= b; j++) {
                System.out.println(i + " X " + j + " : " + (i * j));
            }
            System.out.println();
        }
    }
}
