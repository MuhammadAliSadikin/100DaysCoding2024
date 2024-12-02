package pkg100h_ngoding;

import java.util.Scanner;

public class day92 {

    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int a = ip.nextInt();
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            if (i < a - 1) {
                System.out.print("*");
            }
            int b = 2 * (a - i - 1) - 1;
            for (int j = 0; j < b; j++) {
                System.out.print(" ");
            }
            System.out.print("*");
            System.out.println();
        }
    }
}
