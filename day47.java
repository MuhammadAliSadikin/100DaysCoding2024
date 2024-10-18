package pkg100h_ngoding;

import java.util.Scanner;

public class day47 {

    public static void main(String[] args) {
        //Percabngan if 
        Scanner ip = new Scanner(System.in);
        System.out.print("Masukan Nama anda : ");
        String nama = ip.nextLine();
        System.out.print("Masukan nilai anda : ");
        int a = ip.nextInt();
        if (a > 100) {
            System.out.println("Nilai Salah");
        } else if (a >= 85 && a <= 100) {
            System.out.println("Predikat A ");
        } else if (a >= 75) {
            System.out.println("Predikat B");
        } else if (a >= 65) {
            System.out.println("Predikat C");
        } else if (a >= 50) {
            System.out.println("Predikat D");
        } else {
            System.out.println("Predikat E");
            System.out.println("Anda Harus Mengulang");
        }
    }
}
