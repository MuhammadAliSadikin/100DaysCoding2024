package pkg100h_ngoding;

import java.util.Scanner;

public class day80 {

    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        System.out.println("Login ke akun anda ");
        System.out.print("Email : ");
        String email = ip.nextLine();
        System.out.print("Masukkan kata sandi : ");
        String sandi = ip.nextLine().trim();
        if (sandi.isEmpty()) {
            System.out.println("Kata sandi tidak boleh kosong");
        } else if (sandi.length() < 8) {
            System.out.println("Kata sandi harus minimal 8 karakter");

        } else {
            System.out.println("kata sandi valid");
        }
        System.out.println("Email : " + email);
        System.out.println("Sandi : " + sandi);
        ip.close();
    }
}
