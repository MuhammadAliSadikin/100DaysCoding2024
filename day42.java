package pkg100h_ngoding;

import java.util.Scanner;

public class day42 {

    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        //Operator perbandingan
        System.out.print("Nilai A : ");
        int a = ip.nextInt();
        System.out.print("Nilai B : ");
        int b = ip.nextInt();
        //Menggunakan boolean 
        boolean c = a == b;
        boolean d = a != b;
        System.out.println(a + " sama dengan " + b + " " + c);
        System.out.println(a + " tidak sama dengan " + b + " " + d);
        System.out.println("");
        //Menggunakan percabangan
        if (a == b) {
            System.out.println(" A sama dengan B ");
        } else if (a != b) {
            System.out.println("A tidak sama dengan B");
        } else {
            System.out.println(" Tidak ada");
        }

    }

}
