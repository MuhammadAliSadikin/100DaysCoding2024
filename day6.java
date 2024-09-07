package pkg100h_ngoding;

import java.util.Scanner;

public class day6 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Biodata Mahasiswa");
        System.out.println("--------------------------------------");
        String a, b;
        int c;
        double d;
        boolean e;
        char f;
        System.out.print("Nama   \t\t: ");
        a = input.nextLine();
        System.out.print("Alamat \t\t: ");
        b = input.nextLine();
        System.out.print("Gender(L/P)\t: ");
        f = input.next().charAt(0);
        System.out.print("Umur   \t\t: ");
        c = input.nextInt();
        System.out.print("Tinggi \t\t: ");
        d = input.nextDouble();
        System.out.print("Status Aktif\n(True/False) \t: ");
        e = input.nextBoolean();
        System.out.println("--------------------------------------");
        
        System.out.printf("Nama   \t\t: %s\n",a);
        System.out.printf("Alamat \t\t: %s\n",b);
        System.out.printf("Gender(L/P)\t: %c\n",f);
        System.out.printf("Umur   \t\t: %d th\n",c);
        System.out.printf("Tinggi \t\t: %.2f cm\n",d);
        System.out.printf("Status Aktif\n(True/False) \t: %b\n",e);
        

    }

}
