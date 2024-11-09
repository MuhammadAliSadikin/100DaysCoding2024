package evaluasi4;

import java.util.Scanner;

public class soal3 {

    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        outerloop:
        while (true) {
            System.out.println("Pilihan Menu ");
            System.out.println("1.Hitung Luas Persegi ");
            System.out.println("2.Hitung Luas Lingkaran ");
            System.out.println("3.Hitung Luas Segitiga ");
            System.out.println("4.Keluar ");
            System.out.print("Pilihan : ");
            int pilihan = ip.nextInt();
            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan sisi persegi : ");
                    double sisi = ip.nextDouble();
                    double luaspersegi = hitungluaspersegi(sisi);
                    System.out.println("Luas persegi : " + luaspersegi);
                    break;
                case 2:
                    System.out.print("Masukkan Jari-jari : ");
                    double jari2 = ip.nextDouble();
                    double luaslingkaran = hitungluaslingkaran(jari2);
                    System.out.println("Luas Lingkaran : " + luaslingkaran);
                    break;
                case 3:
                    System.out.print("Masukkan Alas : ");
                    double alas = ip.nextDouble();
                    System.out.print("Masukkan Tinggi : ");
                    double tinggi = ip.nextDouble();
                    double luassegitiga = hitungluassegitiga(alas, tinggi);
                    System.out.println("Luas Segitiga : " + luassegitiga);
                    break;
                case 4:
                    System.out.println("program selesai");
                    break outerloop;
                default:
                    System.out.println("Pilihan tidak ada ");

            }
        }
    }

    public static double hitungluaspersegi(double sisi) {
        return sisi * sisi;
    }

    public static double hitungluaslingkaran(double jari2) {
        return Math.PI * jari2 * jari2;
    }

    public static double hitungluassegitiga(double alas, double tinggi) {
        return 0.5 * alas * tinggi;
    }
}
