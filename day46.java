package pkg100h_ngoding;

import java.util.Scanner;

public class day46 {

    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        //Operator Logika
        System.out.print("Masukaan Angka : ");
        int a = ip.nextInt();
        System.out.print("Masukan Angka : ");
        int b = ip.nextInt();
        boolean a1 = a <= b;
        //Menggunakan Percabangan
        if (a1) {
            System.out.println(a +" lebih kecil dari " + b);
        } else {
            System.out.println(a +" lebih besar dari " + b);
        }
        System.out.println("-----------------------");
        System.out.println("Kebalikan");
        boolean not = !a1;
        if (not) {
            System.out.println(a + " lebih kecil dari " + b);
        } else {
            System.out.println(a + " lebih besar  dari " + b);
        }

    }

}
