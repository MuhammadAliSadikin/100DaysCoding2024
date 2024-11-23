package pkg100h_ngoding;

import java.util.Scanner;

public class day83 {

    public static void main(String[] args) {
        String[] a = {"Ikan", "Sapi", "Ayam", "Kambing"};
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
        Scanner ip = new Scanner(System.in);
        System.out.print("Masukkan Jumlah Index : ");
        int b = ip.nextInt();
        int c[] = new int[b];
        for (int i = 0; i < b; i++) {
            System.out.print("Index ke-" + i + " : ");
            c[i] = ip.nextInt();
        }
        for (int i = 0; i < b; i++) {
            if (c[i] % 2 == 0) {
                System.out.println("Genap");
            }
        }
        for (int i = 0; i < b; i++) {
            if (c[i] % 2 == 1) {
                System.out.println("Ganjil");
            }
        }
    }
}
