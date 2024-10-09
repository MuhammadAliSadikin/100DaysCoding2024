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
        System.out.println("Hasil Perkalian " + a); // Mencetak dengan println
        // Operator -= (Pembagian dan Pengisian)
        System.out.print("Masukan nilai b : ");
        int c = ip.nextInt();
        System.out.print("Masukan nilai d : ");
        int d = ip.nextInt();
        c /= d;
        System.out.println("Hasil Bagi : "+c);
        System.out.println(); // Mencetak baris baru
       
        ip.close();
    }

    }
    

