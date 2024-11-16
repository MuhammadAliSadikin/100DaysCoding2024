package pkg100h_ngoding;

import java.util.Scanner;

public class day76 {

    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        System.out.print("Masukkan teks : ");
        String teks = ip.nextLine();
        String up = teks.toUpperCase();
        System.out.println("----------------------------");
        System.out.println("Setelah diubah : " + up);
        String diubah = "";
        for (int i = 0; i < teks.length(); i++) {
            char karakter = teks.charAt(i);
            if (i % 2 == 1) {
                diubah += Character.toUpperCase(karakter);
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
