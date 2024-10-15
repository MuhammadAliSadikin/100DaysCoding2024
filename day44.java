package pkg100h_ngoding;

import java.util.Scanner;

public class day44 {

    public static void main(String[] args) {
        // Operator Logika AND
        boolean x = true;
        boolean y = true;
        boolean z = false;
        boolean h = x && y;
        System.out.println(h);
        h = x && z;
        System.out.println(h);
        System.out.println("--------------");
        Scanner ip = new Scanner(System.in);
        System.out.print("true/false : ");
        boolean a = ip.nextBoolean();
        System.out.print("true/false : ");
        boolean b = ip.nextBoolean();
        boolean c = a && b;
        System.out.printf("Ini %b%n ", c);
        //Menggunakan percabangan
        if (a && b) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

    }

}
