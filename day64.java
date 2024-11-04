package pkg100h_ngoding;

import java.util.Scanner;

public class day64 {

    public static void main(String[] args) {
        int skorpemain = 0;
        int skorkomputer = 0;
        permainan:
        while (true) {
            System.out.println("---------------------");
            System.out.println("Player : " + skorpemain);
            System.out.println("Computer : " + skorkomputer);
            System.out.println("---------------------");
            for (int i = 0; i < 3; i++) {
                System.out.println("\nPutaran ke_" + (i + 1));
                System.out.print("Pilih Angka(1-10) : ");
                int pemain = new Scanner(System.in).nextInt();
                int komputer = (int) (Math.random() * 10) + 1;
                System.out.println("Player : " + pemain);
                System.out.println("Computer : " + komputer);
                if (pemain > komputer) {
                    System.out.println("You Win");
                    skorpemain++;
                } else if (komputer > pemain) {
                    System.out.println("Computer Win");
                    skorkomputer++;
                } else {
                    System.out.println("Draw");
                }
                if (skorpemain >= 3 || skorkomputer >= 3) {
                    break permainan;

                }
            }
        }
        System.out.println("------------------------");
        if (skorpemain > skorkomputer) {
            System.out.println("You Win");
        } else if (skorkomputer > skorpemain) {
            System.out.println("Computer Win");

        } else {
            System.out.println("Game End");
        }

    }
}
