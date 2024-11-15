package pkg100h_ngoding;

import java.util.Scanner;

public class day75 {

    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        System.out.print("Masukkan teks : ");
        String teks = ip.nextLine();
        String kecil = teks.toLowerCase();
        System.out.println("----------------------------");
        System.out.println("Setelah diubah : "+kecil);
        String diubah = "";
        for (int i = 0; i < teks.length(); i++) {
            char karakter = teks.charAt(i);
            if (i % 2 == 0) {
                diubah += Character.toLowerCase(karakter);
            } else {
                diubah += karakter;
            }
        }
        System.out.println("----------------------------");
        System.out.println("Teks diubah");
        System.out.println("----------------------------");
        System.out.println("" + diubah);
        ip.close();
    }
}
