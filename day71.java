package pkg100h_ngoding;

import java.util.Scanner;

public class day71 {

    static int perkalian(int kali, int kali2) {
        return kali * kali2;
    }

    static int pembagian(int bagi, int bagi1) {
        return bagi / bagi1;
    }

    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        stop:
        while (true) {
            System.out.println("1.Perkalian");
            System.out.println("2.Pembagian");
            System.out.println("3.Keluar");
            System.out.print("Pilih : ");
            int pilih = ip.nextInt();
            switch (pilih) {
                case 1:
                    System.out.println("Perkalian");
                    System.out.print("Angka : ");
                    int angka1 = ip.nextInt();
                    System.out.print("Angka : ");
                    int angka2 = ip.nextInt();
                    System.out.println(angka1 + " X " + angka2 + " = " + day71.perkalian(angka1, angka2));
                    break;
                case 2:
                    System.out.println("Pembagian");
                    System.out.print("Angka : ");
                    int angka3 = ip.nextInt();
                    System.out.print("Angka : ");
                    int angka4 = ip.nextInt();
                    System.out.println(angka3 + " : " + angka4 + " = " + day71.pembagian(angka3, angka4));
                    break;
                case 3:
                    System.out.println("Program selesai");
                    break stop;
                default:
                    System.out.println("Input tidak valid");
            }
        }
    }
}
