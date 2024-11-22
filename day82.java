package pkg100h_ngoding;

import java.util.Scanner;

public class day82 {

    public static double c(double ceil) {
        return Math.ceil(ceil);
    }

    public static double f(double floor) {
        return Math.floor(floor);
    }

    public static double r(double round) {
        return Math.round(round);
    }

    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        stop:
        while (true) {
            System.out.print("Daftar Pilihan");
            System.out.println("1.ceil");
            System.out.println("2.floor");
            System.out.println("3.round");
            System.out.println("4.exit");
            System.out.print("Pilih : ");
            int pilih = ip.nextInt();
            switch (pilih) {
                case 1:
                    System.out.print("Masukkan Angka Desimal : ");
                    double a1 = ip.nextDouble();
                    double b1 = c(a1);
                    System.out.println("ceil : " + b1);
                    break;
                case 2:
                    System.out.print("Masukkan Angka Desimal : ");
                    double a2 = ip.nextDouble();
                    double b2 = f(a2);
                    System.out.println("floor : " + b2);
                    break;
                case 3:
                    System.out.print("Masukkan Angka Desimal : ");
                    double a3 = ip.nextDouble();
                    double b3 = r(a3);
                    System.out.println("round : " + b3);
                    break;
                case 4:
                    System.out.println("Program selesai : ");
                    break stop;
                default:
                    System.out.println("Pilihan tidak valid");
            }
        }
        ip.close();
    }
}
