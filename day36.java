package pkg100h_ngoding;

import java.util.Scanner;

public class day36 {

    public static void main(String[] args) {

        Scanner masuk = new Scanner(System.in);

        System.out.print("Masukkan bilangan desimal: ");
        double decimal = masuk.nextDouble(); // Menggunakan double untuk input

        // Konversi desimal ke biner (8 digit)
        int integerPart = (int) decimal; // Ambil bagian integer
        String binary = String.format("%8s", Integer.toBinaryString(integerPart)).replace(' ', '0');
        System.out.println("Bilangan biner (8 digit): " + binary);

        // Inputan untuk perhitungan 77%
        System.out.print("Masukkan bilangan bulat: ");
        int input = masuk.nextInt();

        // Hitung 77% dari inputan
        int hasil = (int) Math.round(input * 0.77);
        System.out.println("77% dari " + input + " adalah: " + hasil);

        masuk.close();
    }
}


