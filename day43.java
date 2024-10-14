package pkg100h_ngoding;

import java.util.Scanner;

public class day43 {

    public static void main(String[] args) {
        //Operator Perbandingan
        Scanner ip = new Scanner(System.in);
        System.out.print("Angka Pertama : ");
        int a = ip.nextInt();
        System.out.print("Angka Kedua : ");
        int b = ip.nextInt();
        //Menggunakan boolean
        boolean c = a >= b;
        boolean d = a <= b;
        System.out.println(a + " >= " + b + c);
        System.out.println(a + " <= " + b + d);
        //Menggunakan Percabngan
        if (a >= b) {
            System.out.println("Nilai A Lebih Besar dari B");
        } else if (a <= b) {
            System.out.println("Nilai A Lebih Kecil dari B ");
        } else {
            System.out.println("NT");
        }

    }

}
