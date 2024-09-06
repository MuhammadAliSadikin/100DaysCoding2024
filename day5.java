package pkg100h_ngoding;

import java.util.Scanner;

public class day5 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
         //Permintaan input dari pengguna//
        System.out.println("Masukan Biodata Anda");
        System.out.println("---------------------------------------------");
         //println : mencetak teks ke konsol dan menambahkan newline(\n)di akhir.//
        System.out.print("Masukan Nama Anda \t: ");
        String nama = input.nextLine();
        System.out.print("Umur \t\t\t: ");
        int umur = input.nextInt();
        System.out.print("Tiggi Badan \t\t: ");
         //print : mencetak teks ke konsol tanpa pinda baris.
        double tinggi = input.nextDouble();
        System.out.println("---------------------------------------------");
        System.out.printf("Nama :%s \n", nama);
        System.out.printf("Umur :%d tahun \n", umur);
        System.out.printf("Tinggi : %.2f cm\n", tinggi);
         /*printf :mencetak teks ke konsol dengan format yang ditentukan.
           Seperti penggunaan %s untuk String,%d untuk integer,%.2f untuk Double.
           format output dengan placeholder.*/
        input.close();//Menutup objek dari Scanner

    }

}
