package pkg100h_ngoding;

import java.util.Scanner;

public class day66 {

    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        System.out.println("Pola Segitiga & Persegi Panjang");
        System.out.print("Tinggi : ");
        int a = ip.nextInt();
        for (int i = 0; i <= a; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.print("Panjang : ");
        int b = ip.nextInt();
        System.out.print("Lebar : ");
        int c = ip.nextInt();
        for (int i = 1; i <= c; i++) {
            for (int j = 1; j <= b; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
