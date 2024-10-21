package pkg100h_ngoding;

import java.util.Scanner;

public class day50{

public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);

        // Generate angka acak antara 1 dan 100
        int angkaRahasia = (int) (Math.random() * 100) + 1;

        System.out.println("Selamat datang di permainan tebak angka!");
        System.out.println("Saya telah memilih angka rahasia antara 1 dan 100.");
        System.out.println("Coba tebak angka tersebut!");

        int kesempatan = 5;
        boolean tebakanBenar = false;

        while (kesempatan > 0 && !tebakanBenar) {
            System.out.print("Tebakan Anda: ");
            int tebakan = ip.nextInt();

            if (tebakan == angkaRahasia) {
                tebakanBenar = true;
                System.out.println("Selamat! Anda menebak dengan benar!");
            } else if (tebakan < angkaRahasia) {
                System.out.println("Terlalu rendah. Coba lagi.");
                kesempatan--;
            } else {
                System.out.println("Terlalu tinggi. Coba lagi.");
                kesempatan--;
            }

            System.out.println("Anda memiliki " + kesempatan +
                    " kesempatan tersisa.");
        }

        if (!tebakanBenar) {
            System.out.println("Maaf, kesempatan Anda habis! " +
                    "Angka rahasianya adalah " + angkaRahasia + ".");
        }

        ip.close();
    }
}
