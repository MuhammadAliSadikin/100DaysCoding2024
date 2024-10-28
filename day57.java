package pkg100h_ngoding;

import java.util.Scanner;

public class day57 {

    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        System.out.println("Menampilkan Angka Genap dari kecil ke besar");
        System.out.print("Awal : ");
        int a = ip.nextInt();
        System.out.print("Akhir : ");
        int b = ip.nextInt();
        int c = 1;
        if (a > b) {
            System.out.println("Inputan Salah");
        } else {
            while (a <= b) {
                int hasil = a % 2;
                if (hasil == 0) {
                    System.out.print(a + " ");
                    if (c == 5) {
                        System.out.println("");
                        c = 0;
                    }
                    c++;
                }
                a++;              
            }
            System.out.println();
        }
    }
}
