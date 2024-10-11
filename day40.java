package pkg100h_ngoding;

import java.util.Scanner;

public class day40 {

    public static void main(String[] args) {
        //Operator perbandingan
        Scanner ip = new Scanner(System.in);
        System.out.print("Nilai A : ");
        int a = ip.nextInt();
        System.out.print("Nilai B : ");
        int b = ip.nextInt();
        if (a > b) {
            System.out.println(a + " > " + b);
        } else if (a < b) {
            System.out.println(a + " < " + b);
        } else {
            System.out.println(a + " = " + b);
        }
        System.out.print("Nilai C : ");
        float c = ip.nextFloat();
        System.out.print("Nilai D : ");
        float d = ip.nextFloat();
        if (c > d) {
            System.out.println(c + " > " + d);
        } else if (c < d) {
            System.out.println(c + " < " + d);
        } else {
            System.out.println(c + " = " + d);
        }
    }
}
