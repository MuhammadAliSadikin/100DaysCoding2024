package pkg100h_ngoding;

import java.util.Scanner;
import java.util.Random;

public class day77 {

    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        Random random = new Random();

        String[] kataKata = {"apel", "pisang", "jeruk", "mangga", "semangka"};
        String kataRahasia = kataKata[random.nextInt(kataKata.length)];

        int kesempatan = 5;
        String tebakan = "";

        System.out.println("Selamat datang di permainan Tebak Kata!");
        System.out.println("Tebak sebuah kata buah.");

        while (kesempatan > 0 && !tebakan.equals(kataRahasia)) {
            System.out.println("Kesempatan tersisa: " + kesempatan);
            System.out.print("Tebakan Anda: ");
            tebakan = ip.nextLine();

            if (tebakan.equals(kataRahasia)) {
                System.out.println("Selamat! Anda berhasil menebak kata " + kataRahasia + "!");
            } else {
                System.out.println("Salah! Coba lagi.");
                kesempatan--;
            }
        }

        if (kesempatan == 0) {
            System.out.println("Maaf, kesempatan Anda habis! Kata rahasianya adalah " + kataRahasia + ".");
        }

        ip.close();
    }
}
