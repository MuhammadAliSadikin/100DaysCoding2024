package pkg100h_ngoding;

import java.util.Scanner;

public class day35 {

    public static void main(String[] args) {
        //operator Aritmatika 
        Scanner masuk = new Scanner(System.in);
        int a, b, c;
        int d, e, f;
        System.out.println("Penjumlahan");
        System.out.print("Angka Pertama \t: ");
        a = masuk.nextInt();
        System.out.print("Angka Kedua \t: ");
        b = masuk.nextInt();
        c = a + b;
        System.out.println(a + " + " + b + " \t\t: " + c);
        
        System.out.println("----------------------");
        System.out.println("Pengurangan ");
        System.out.print("Angka pertama \t: ");
        d = masuk.nextInt();
        System.out.print("Angka Kedua \t: ");
        e = masuk.nextInt();
        f = d - e;
        System.out.println(d + " - " + e + " \t\t: " + f);    
        
    }
}
