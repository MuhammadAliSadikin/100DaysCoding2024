package pkg100h_ngoding;
import java.util.Scanner;
public class day38 {
    public static void main(String[] args) {
        //Operator Penugasan
        Scanner ip = new Scanner(System.in);

        System.out.print("Masukkan nilai a: ");
        int a = ip.nextInt();

        System.out.print("Masukkan nilai b: ");
        int b = ip.nextInt();

        // Operator = (Pengisian Langsung)
        System.out.printf("a = %d\n", a); // Mencetak dengan printf

        // Operator += (Perkalian dan Pengisian)
        a *= b; // a = a + b
        System.out.println("a *= b: a = " + a); // Mencetak dengan println

        // Operator -= (Pembagian dan Pengisian)
        a /= b; // a = a - b
        System.out.print("a /= b: a = "); // Mencetak dengan print
        System.out.print(a); // Mencetak dengan print
        System.out.println(); // Mencetak baris baru

        ip.close();
    }

    }
    

