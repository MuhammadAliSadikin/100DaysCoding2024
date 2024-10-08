package pkg100h_ngoding;

import java.util.Scanner;

public class day37 {

    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);

        System.out.print("Masukkan nilai a: ");
        int a = ip.nextInt();

        System.out.print("Masukkan nilai b: ");
        int b = ip.nextInt();

        // Operator = (Penugasan Langsung)
        System.out.printf("a = %d\n", a); // Mencetak dengan printf

        // Operator += (Penambahan dan Penugasan)
        a += b; // a = a + b
        System.out.println("a += b: a = " + a); // Mencetak dengan println

        // Operator -= (Pengurangan dan Penugasan)
        a -= b; // a = a - b
        System.out.print("a -= b: a = "); // Mencetak dengan print
        System.out.print(a); // Mencetak dengan print
        System.out.println(); // Mencetak baris baru

        ip.close();
    }
}
