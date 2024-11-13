package pkg100h_ngoding;

import java.util.Scanner;

public class day73 {

    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        System.out.print("Nama : ");
        String nama = ip.nextLine();
        System.out.println("Dari Karakter Terakhir");
        for (int i = nama.length() - 1; i >= 0; i--) {
            char k1 = nama.charAt(i);
            System.out.println("Karakter ke-" + (i + 1) + " : " + k1);
        }
        System.out.print("Balik(Y/N): ");
        String balik = ip.nextLine();
        if (balik.equalsIgnoreCase("y")) {
            System.out.println("Dari karakter A wal");
            for (int i = 0; i < nama.length(); i++) {
                char k = nama.charAt(i);
                System.out.println("Karakter ke-" + (i + 1) + " : " + k);
            }
        } else {
            System.out.println("Program selesai");
        }
        ip.close();
    }
}
