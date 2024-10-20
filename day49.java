package pkg100h_ngoding;

import java.util.Scanner;

public class day49 {

    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        System.out.print("Masukkan Angka : ");
        int a = ip.nextInt();
        System.out.print("Masukkan Angka : ");
        int b = ip.nextInt();
        int c = a + b;
        int d = a - b;
        int e = a * b;
        System.out.println(a + " + " + b + " : " + c);
        System.out.println(a + " - " + b + " : " + d);
        System.out.println(a + " * " + b + " : " + e);
        if (a > b) {
            System.out.println(a + " Lerbih besar dari " + b);
        } else if (a == b) {
            System.out.println("Angka yang di input sama ");
        } else {
            System.out.println(a + " Lebih kecil dari " + b);
        }

    }

}
