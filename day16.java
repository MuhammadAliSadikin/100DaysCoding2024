package pkg100h_ngoding;

public class day16 {

    public static void main(String[] args) {
        //Deklarasi Dan inisialisai Variabel dengan tipe data:float
        float A1, A2, A3, A4;
        float B1 = 27f;
        float B2 = 30f;
        float B3 = 16f;
        float B4 = 43f;
        //Variabel B dicetak menggunakan prinf
        System.out.printf("B1 = %.1f\nB2 = %.1f\nB3 = %.1f\nB4 = %.1f\n", B1, B2, B3, B4);
        System.out.println("---------------------");
        //Variabel A diinisialisasi dengan nilai B
        A1 = B1;
        A2 = B2;
        A3 = B3;
        A4 = B4;
        //Kemudian Di cetak menggunakan print
        System.out.print("A1 = " + A1 + "\n" + "A2 = " + A2 + "\n" + "A3 = " + A3 + "\n" + "A4 = " + A4);
        System.out.println("\n---------------------");
        //Update nilai variabel B
        B1 = 4f;
        B2 = 8f;
        B3 = 12f;
        B4 = 16f;
        //Dicetak menggunakan println
        System.out.println("B1 = " + B1 + "\n" + "B2 = " + B2 + "\n" + "B3 = " + B3 + "\n" + "B4 = " + B4 + "\n");
        System.out.println("---------------------");
        //Pertukaran Nilai
        float B5;
        B5 = B1;
        B1 = B3;
        B3 = B4;
        B4 = B2;
        B2 = B5;
        //Dicetak menggunakan println
        System.out.println("B1 = " + B1 + "\n" + "B2 = " + B2 + "\n" + "B3 = " + B3 + "\n" + "B4 = " + B4);

    }
}

