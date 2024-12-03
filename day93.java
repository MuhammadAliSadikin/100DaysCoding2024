package pkg100h_ngoding;

import java.util.Scanner;

public class day93 {

    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int a = ip.nextInt();
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < (a - i - 1); j++) {
                System.out.print(" ");
            }
            System.out.print("*");
            if (i > 0) {
                for (int j = 0; j < (2 * (i - 1) + 1); j++) {
                    System.out.print(" ");
                }
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
