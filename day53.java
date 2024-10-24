package pkg100h_ngoding;

import java.util.Scanner;

public class day53 {

    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        System.out.println("Menampilan Angka Ganjil dari kecil ke besar");
        System.out.print("Angka : ");
        int a = ip.nextInt();
        System.out.print("Angka : ");
        int b = ip.nextInt();
        for (int i = a; i < b; i++) {
            if (i%2 == 1) {
                System.out.println(i);
            }
        }
        System.out.println("Menampilkan Angka genaap dari besar ke kecil");
        System.out.print("Angka : ");
        a = ip.nextInt();
        System.out.print("Angka : ");
        b = ip.nextInt();
        for (int i = a; i > b; i--) {
            if (i%2 == 0) {
               System.out.println(i);  
            }

        }
    }

}
