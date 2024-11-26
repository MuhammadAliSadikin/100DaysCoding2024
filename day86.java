import java.util.Scanner;

public class day86 {
    public static void main (String[]args){
        Scanner ip = new Scanner(System.in);
        String[] nama = {"Andi", "Budi", "Cici", "Dedi"};
        int index = 0;
        System.out.println("Elemen array dengan indeks:");
        for (String s : nama) {
            System.out.println("Nama pada indeks " + index + ": " + s);
            index++;
        }
        int[] angka = {1, 2, 3, 4, 5};
        int i = 0;
        int jumlah = 0;
        System.out.println("Elemen array ");
        for(int a = 0; a < angka.length; a++){
            System.out.print(angka[a]+" ");
        }
        System.out.println();
        while (i < angka.length) {
            jumlah += angka[i];
            i++;
        }

        System.out.println("Jumlah elemen array: " + jumlah);
    }
}
