package pkg100h_ngoding;

import java.util.Scanner;

public class day74 {

    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in)) {
            System.out.print("Masukkan inputan : ");
            String input = ip.nextLine();
            int a = input.length();
            System.out.println(input + " ada " + a + " karakter");
            System.out.print("Masukkan nomor karakter : ");
            int k1 = ip.nextInt();
            ip.nextLine();
            if (k1 >= 1 && k1 <= input.length()) {
                char k2 = input.charAt(k1 - 1);
                System.out.println("Karakter ke-" + k1 + " : " + k2);
            } else {
                System.out.println("Karakter tidak ada");
            }
            System.out.print("Tampilkan semua(Y/N) : ");
            String semua = ip.nextLine();
            if (semua.equalsIgnoreCase("Y")) {
                for (int i = 0; i < input.length(); i++) {
                    char b = input.charAt(i);
                    System.out.println("Karakter ke-" + (i + 1) + " " + b);
                }
            }else{
                System.out.println("Program selesai");
            }
            ip.close();
        }
    }
}
