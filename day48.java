package pkg100h_ngoding;

import java.util.Scanner;

public class day48 {

    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        System.out.println("Biaya Tunjangan ");
        System.out.print("Nama : ");
        String a = ip.nextLine();
        System.out.print("Usia : ");
        int b = ip.nextInt();
        //Percabangan
        if (b >= 45 && b <= 60) {
            System.out.println("Rp.550.000,00");
        } else if (b >= 30 && b < 45) {
            System.out.println("Rp.700.000,00");
        } else if (b >= 20 && b < 30) {
            System.out.println("Rp.800.000,00");
        } else if (b >= 10 && b < 20) {
            System.out.println("Rp.1.000.000,00");
        }else if(b >= 1 && b < 10){
            System.out.println("Rp.1.200.000,00");
        } else {
            System.out.println("Tidak Dapat Tunjangan");
        }
        ip.close();
    }

}