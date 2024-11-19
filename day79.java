package pkg100h_ngoding;

import java.util.Scanner;

public class day79 {

    String judul;
    Integer kode;

    public day79(String judul, Integer kode) {
        this.judul = judul;
        this.kode = kode;
    }

    @Override
    public String toString() {
        return "judul \t\t: " + judul + "\nNomor buku \t: " + kode;
    }

    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        System.out.print("Judul Buku : ");
        String judul = ip.nextLine();
        System.out.print("Nomor Buku : ");
        Integer kode = ip.nextInt();
        day79 buku1 = new day79(judul, kode);
        System.out.println("Infromasi Buku");
        System.out.println(buku1);
    }
}
