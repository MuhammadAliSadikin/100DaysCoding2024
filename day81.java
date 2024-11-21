package pkg100h_ngoding;

import java.util.Scanner;

public class day81 {

    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        System.out.print("Angka : ");
        String a1 = ip.nextLine();
        Integer b1 = Integer.valueOf(a1);
        Long b2 = Long.valueOf(a1);
        Double b3 = Double.valueOf(a1);
        Float b4 = Float.valueOf(a1);
        Short b5 = Short.valueOf(a1);
        System.out.println("Diubah");
        System.out.println("Integer : "+b1);
        System.out.println("Long : "+b2);
        System.out.println("Double : "+b3);
        System.out.println("Float : "+b4);
        System.out.println("Short : "+b5);
        ip.close();
    }
}
