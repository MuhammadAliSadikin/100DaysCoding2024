package pkg100h_ngoding;

import java.util.Scanner;

public class day91 {

    public static void main(String[] args) {
Scanner ip = new Scanner(System.in);
        for (;;) {
            int a =ip.nextInt();
            if (a%2 == 0) {
                System.out.println("Genap");
            }else{
                System.out.println("You and I,end");
                break;
            }
        }
        ip.close();
    }
}
