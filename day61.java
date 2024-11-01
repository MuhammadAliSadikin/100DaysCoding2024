package pkg100h_ngoding;

import java.util.Scanner;

public class day61 {

    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        for (;;) {
            System.out.print("Masukan Angka : ");
            int a = ip.nextInt();
            if (a % 2 == 0) {
                System.out.println("Angka Genap Tercetak");
                break;
            }

        }
        for (;;) {
            System.out.print("Masukan Angka : ");
            int b = ip.nextInt();
            if (b % 2 == 1) {
                System.out.println("Angka Ganjil Tercetak");
                break;
            }
        }
        while (true) {   
            System.out.println("DUA LAH");
        }

    }
}
