package pkg100h_ngoding;

import java.util.Scanner;

public class day39 {

    public static void main(String[] args) {
        // Operator penugasan Modulo
        Scanner ip = new Scanner(System.in);
        // Operator = (Pengisian Langsung)
        int nt = 24;
        System.out.printf("nt : %d\n",nt ); // Mencetak dengan printf
        //Operator penugasan Modulo
        byte ha,he;
        ha = 20;
        he = 3;
        ha %= he; // %= (Modulo dan pengisian)
        System.out.println("20 % 3 : "+ha);
        System.out.print("Masukkan nilai a: ");
        int a = ip.nextInt();

        System.out.print("Masukkan nilai b: ");
        int b = ip.nextInt();

        // Operator %= (Modulo dan Pengisian)
        a %= b; // a = a % b
        System.out.println("Hasil Modulo " + a); // Mencetak dengan println
        ip.close();
    }
}
