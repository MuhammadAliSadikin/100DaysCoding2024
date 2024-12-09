import java.util.Scanner;
public class day78 {
    public static void main (String[]args){
        Scanner ip = new Scanner(System.in);
        System.out.print("Nilai x : ");
        int x = ip.nextInt();
        System.out.print("Nilai y : ");
        int y = ip.nextInt();
        int jml = 0;
        for(int i = x; i<= y; i++){
            if(i%2 == 0){
                System.out.print(i+" ");
                jml += i;
            }
        }
        System.out.println();
        System.out.println("Total penjumlahan bilangan genap : "+jml);
        
    }
}
