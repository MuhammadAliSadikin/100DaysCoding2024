package pkg100h_ngoding;

import java.util.Scanner;

public class day97 {

    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int a = ip.nextInt();
        for (int i = 0; i <= a; i++) {
            if (prima(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
        ip.close();
    }

    static boolean prima(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
