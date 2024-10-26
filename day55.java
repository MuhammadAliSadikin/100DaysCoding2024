package pkg100h_ngoding;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        //For Dencrement
        System.out.print("Angka Besar : ");
        int a = ip.nextInt();
        System.out.print("Angka Kecil : ");
        int b = ip.nextInt();
        for(int i= a; i >= b; i--){
            System.out.print(i);
        }    
        for(int j = 5; j >=0; j--){
            System.out.println("ID"+j);
        }
        int baris = 5; // Jumlah baris

        // Loop for decrement untuk mencetak baris
        for (int i = baris; i >= 1; i--) {
            // Loop for untuk mencetak bintang pada setiap baris
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println(); // Pindah ke baris baru
    } 
    }
}
