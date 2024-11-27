package pkg100h_ngoding;

import java.util.Scanner;

public class day87 {

    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        System.out.print("Jumlah index : ");
        int a = ip.nextInt();
        int array[] = new int[a];
        for (int i = 0; i < array.length; i++) {
            System.out.print("Index ke-" + i + " : ");
            array[i] = ip.nextInt();
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        System.out.print("index yang diubah (0-"+(a-1)+") : ");
        int index = ip.nextInt();
        System.out.print("Nilai baru : ");
        array[index] = ip.nextInt();
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+" ");
        }
        System.out.println();
        ip.close();
    }
}
