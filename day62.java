package pkg100h_ngoding;

import java.util.Scanner;

public class day62 {

    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        for (;;) {
            System.out.print("Masukan Angka 0 : ");
            int a = ip.nextInt();
            if (a == 0) {
                break;
            }
        }
        for (;;) {
            System.out.print("Masukan Angka di bawah 0 : ");
            int b = ip.nextInt();
            if (b < 0) {
                break;

            }

        }
        while (true) {
            System.out.print("Masukan Angka Genap : ");
            int c = ip.nextInt();
            if (c % 2 == 0) {
                break;

            }
        }

        do {
            System.out.print("Masukan Angka ganjil : ");
            int d = ip.nextInt();

            if (d % 2 == 1) {
                break;
            }
            d++;
        } while (true);

    }
}
