package pkg100h_ngoding;

import java.util.Scanner;

public class day45 {

    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        System.out.print("Angka 1: ");
        int a = ip.nextInt();
        System.out.print("Angka 2 : ");
        int b = ip.nextInt();
        boolean c = a < b;
        boolean d = a > b;
        //Operator Logika OR
        boolean or = c || d;
        //Di cetak menggunkan printf
        System.out.printf("%b%n",or);
        System.out.println("-----------------------------------------");
        //Menggunakan percabangan
        if (c || d) {
            System.out.println("Salah 1 kondis terpenuhi"); 
        } else {
            System.out.println("false");

        }
        ip.close();
    }
}
