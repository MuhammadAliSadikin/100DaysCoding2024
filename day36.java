package pkg100h_ngoding;

import java.util.Scanner;

public class day36 {

    public static void main(String[] args) {

        Scanner masuk = new Scanner(System.in);
        System.out.print("masukkan inputan ");
        int input = masuk.nextInt();

        String binary = "";

        // Konversi manual ke biner (dengan loop)
        for (int i = 0; i < 8; i++) {
            binary = (input % 2) + binary;
            input /= 2;
        }

        System.out.println("hasil konversi ke binner = " + binary);

        System.out.print("masukkan inputan ke dua");
        int persen = masuk.nextInt();

        // Membulatkan hasil perhitungan persentase
        int hasilPersen = (int) (persen * 0.77);
        System.out.println("hasil 77% dari " + persen + " adalah = " + hasilPersen);
    }
}
