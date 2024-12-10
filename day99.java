import java.util.Scanner;

public class day99 {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        System.out.println("Kalkulator Sederhana");
        stop: while (true) {
            System.out.println("Pilihan");
            System.out.println("1.Penjumlahan");
            System.out.println("2.Pengurangan");
            System.out.println("3.Perkalian");
            System.out.println("4.Pembagian");
            System.out.println("5.Sisa Bagi");
            System.out.println("6.Exit");
            System.out.print("Pilih : ");
            int pilihan = ip.nextInt();
            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan Angka : ");
                    double a = ip.nextDouble();
                    System.out.print("Masukkan Angka : ");
                    double a1 = ip.nextDouble();
                    double b = a + a1;
                    System.out.println("Hasil : " + b);
                    break;
                case 2:
                    System.out.print("Masukkan Angka : ");
                    double a2 = ip.nextDouble();
                    System.out.print("Masukkan Angka : ");
                    double a3 = ip.nextDouble();
                    double b1 = a2 - a3;
                    System.out.println("Hasil : "+b1);
                    break;
                case 3:
                    System.out.print("Masukkan Angka : ");
                    double a4 = ip.nextDouble();
                    System.out.print("Masukkan Angka : ");
                    double a5 = ip.nextDouble();
                    double b2 = a4 * a5;
                    System.out.println("Hasil : " + b2);
                    break;
                case 4:
                    System.out.print("Masukkan Angka : ");
                    double a6 = ip.nextDouble();
                    System.out.print("Masukkan Angka : ");
                    double a7 = ip.nextDouble();
                    double b3 = a6 / a7;
                    System.out.println("Hasil : " + b3);
                    break;
                case 5:
                    System.out.print("Masukkan Angka : ");
                    double a8 = ip.nextDouble();
                    System.out.print("Masukkan Angka : ");
                    double a9 = ip.nextDouble();
                    double b4 = a8 % a9;
                    System.out.println("Hasil : "+b4);
                    break;
                case 6:
                    System.out.println("Program selesai!");
                    break stop;
                default:
                    System.out.println("pilihan Tidak Valid");
                    break;
            }
        }
        ip.close();
    }
}
