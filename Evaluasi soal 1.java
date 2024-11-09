package evaluasi4;
import java.util.Scanner;
public class Evaluasi4 {

    public static void main(String[] args) {
       Scanner ip = new Scanner(System.in);
        System.out.print("Masukan Angka : ");
        int N = ip.nextInt();
        int total = 0;
        for (int i = 1; i <= N; i++) {
            if (i%4 != 0) {
                total += 100;
            }else{
            total *= 2;
            }
        }System.out.println("Total : "+total);
    }

}
