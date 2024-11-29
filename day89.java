package pkg100h_ngoding;

import java.util.Scanner;

public class day89 {

    public static double luaslingkaran(double jari2) {
        return Math.PI * jari2 * jari2;
    }

    public static double luasjajargenjang(double tinggi, double alas) {
        return tinggi * alas;
    }

    public static double luastrapesium(double jumlah, double tinggi) {
        return 0.5 * jumlah * tinggi;
    }

    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        stop:
        while (true) {
            System.out.println("Hitung Luas Bangun Datar\n1.Lingkaran\n2.Jajar Genjang\n3.Trapesium\n4.keluar");
            System.out.print("Pilih : ");
            int pilih = ip.nextInt();
            switch (pilih) {
                case 1:
                    System.out.print("Masukkan jari-jari : ");
                    double jari2 = ip.nextDouble();
                    double lingkaran = luaslingkaran(jari2);
                    System.out.printf("Luas Lingkaran : %.2f\n", lingkaran);
                    break;
                case 2:
                    System.out.print("Masukkan tinggi : ");
                    double tinggi = ip.nextDouble();
                    System.out.print("Masukkan alas/panjang : ");
                    double alas = ip.nextDouble();
                    double jajargenjang = luasjajargenjang(tinggi, alas);
                    System.out.printf("Luas Jajar Genjang : %.2f\n", jajargenjang);
                    break;
                case 3:
                    System.out.print("Masukkan sisi atas : ");
                    double atas = ip.nextDouble();
                    System.out.print("Masukkan sisi bawah : ");
                    double bawah = ip.nextDouble();
                    System.out.print("Masukkan Tinggi : ");
                    double tinggi2 = ip.nextDouble();
                    double jumlah = atas + bawah;
                    double trapesium = luastrapesium(jumlah, tinggi2);
                    System.out.printf("Luas Trapesium : %.2f\n", trapesium);
                    break;
                case 4:
                    System.out.println("Program selesai!");
                    break stop;
                default:
                    System.out.println("Input tidak valid!");
            }
        }
        ip.close();
    }
}
