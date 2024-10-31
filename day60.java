package pkg100h_ngoding;

import java.util.Scanner;

public class day60 {

    public static void main(String[] args) {
        int angka = 1;
        do {
            System.out.print("--");
            angka++;
        } while (angka <= 10);
        System.out.println();
        String a, b, c, d;
        do {
            Scanner ip = new Scanner(System.in);
            System.out.print("Nama : ");
            a = ip.nextLine();
            System.out.print("Alamat : ");
            b = ip.nextLine();
            System.out.print("Umur : ");
            c = ip.nextLine();
            System.out.println("----------------------");
            System.out.println(a + " tinggal di " + b + " berumur " + c + " th");
            System.out.print("Lanjut(y/n) : ");
            d = ip.nextLine();

        } while (d.equalsIgnoreCase("Y"));
        System.out.println("Program selesai");
    }
}
