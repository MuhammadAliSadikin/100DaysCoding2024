package pkg100h_ngoding;

import java.util.Scanner;

public class day72 {

    public static int faktorial(int a) {
        if (a == 0) {
            return 1;
        } else {
            return a * faktorial(a - 1);
        }

    }

    public static int deretbilangan(int n) {
        if (n <= 1) {
            return 1;
        } else {
            return deretbilangan(n - 1) + deretbilangan(n - 2);
        }
    }

    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        System.out.print("Masukkan Angka : ");
        int a1 = ip.nextInt();
        int hasil = faktorial(a1);
        System.out.println("faktorial dari " + a1 + " adalah " + hasil);
        System.out.print("Masukkan Angka :");
        int n1 = ip.nextInt();
        System.out.println("Deret bilangan");
        for (int i = 0; i < n1; i++) {
            System.out.print(deretbilangan(i) + " ");
        }
        System.out.println();
    }
}
