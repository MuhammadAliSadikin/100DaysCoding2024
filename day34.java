package pkg100h_ngoding;

import java.util.Scanner;

public class day34 {

    public static void main(String[] args) {
        //Inputan Keyboard
        Scanner input = new Scanner(System.in);
        String nama,nim,alamat;
        char gender;
        int umur,tb;
        double bb;
        System.out.println("Biodata Mahasiswa");
        System.out.println("-----------------------------------");
        System.out.print("Masukan Nama \t: ");
        nama = input.nextLine();
        System.out.print("NIM \t\t: ");
        nim = input.nextLine();
        System.out.print("Alamat \t\t: ");
        alamat = input.nextLine();
        System.out.print("Gender (L/P)\t: ");
        gender = input.next().charAt(0);
        System.out.print("Umur \t\t: ");
        umur = input.nextInt();
        System.out.print("Tinggi Badan \t: ");
        tb = input.nextInt();
        System.out.print("Berat Badan \t: ");
        bb = input.nextDouble();
        System.out.println("-----------------------------------");
        System.out.printf("Nama \t\t: %s%n",nama);
        System.out.printf("NIM \t\t: %s%n",nim);
        System.out.printf("Alamat \t\t: %s%n",alamat);
        System.out.printf("Gender \t\t: %c%n",gender);
        System.out.printf("Umur \t\t: %d th%n",umur);
        System.out.printf("Tinggi Badan \t: %d cm%n",tb);
        System.out.printf("Berat Badan \t: %.1f kg%n",bb);
    }

}
