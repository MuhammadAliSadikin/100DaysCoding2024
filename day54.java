package pkg100h_ngoding;

import java.util.Scanner;

public class day54 {

    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        System.out.print("Angka : ");
        int c = ip.nextInt();
        for (int i = 0; i < c; i++) {
            if (i % 2 == 0) {
                System.out.println("*");
            } else if (i % 2 == 1) {
                System.out.println("# ");
            }
        }

        System.out.print("Angka : ");
        int a = ip.nextInt();
        System.out.print("Angka : ");
        int b = ip.nextInt();
        //menampilakan Angka Genap dari kecil ke besar
        for (int i = a; i < b; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }

    }
}
