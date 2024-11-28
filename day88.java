package pkg100h_ngoding;

import java.util.Scanner;

public class day88 {

    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        System.out.print("Masukan kata :");
        String kata = ip.nextLine();
        if (kata.trim().isEmpty()) {
            System.out.println("input tidak valid.Masukan kata yang bukan hanya spasi.");
            return;
        }
        String katatrim = kata.trim();
        System.out.println("kata setelah di trim : "+katatrim);
        ip.close();
    }
}
