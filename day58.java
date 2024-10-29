package pkg100h_ngoding;

import java.util.Scanner;

public class day58 {

    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        System.out.println("Menampilkan Angka Ganjil dari kecil ke besar");
        int a, b, c, d;
        System.out.print("Awal : ");
        a = ip.nextInt();
        System.out.print("Akhir : ");
        b = ip.nextInt();
        d = 1;
        if (a <= b) {
            System.out.println("inputan salah ");
        } else {
            while (a >= b) {
                c = a % 2;
                if (c == 1) {
                    System.out.print(a + " ");
                    if (d == 5) {
                        System.out.println("");
                        d = 0;
                    }
                    d++;
                }
                a--;
            }
            System.out.println();
        }
    }
}
