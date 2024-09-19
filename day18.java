package pkg100h_ngoding;

public class day18 {

    public static void main(String[] args) {
        //Inisialisasi variabel tipe data boolean
        boolean benar = true;
        boolean salah = false;
        //Dicetak menggunakan print
        System.out.print("Benar = " + benar + "\n");
        System.out.print("salah = " + salah + "\n");
        System.out.println("----------------------------------------");
        //Deklarasi dan inisialisasi 
        boolean a, b, c, d, e;
        a = 10 < 8;
        b = 9 == 3;
        c = 10 + 3 == 13;
        d = 5 * 5 == 25;
        e = 10 - 5 == 5;
        //Dicetak menggunakan printf 
        System.out.printf("10 < 8 \t: %b\n", a);
        System.out.printf("9 = 3 \t: %b\n", b);
        System.out.printf("10 + 3 \t= 13 : %b\n", c);
        System.out.printf("5 x 5 \t= 25 : %b\n", d);
        System.out.printf("10 - 5 \t= 5 : %b\n", e);
        System.out.println("----------------------------------------");
        //Inisialisasi Variabel
        boolean fanny = true;
        boolean lancelot = true;
        //Memeriksa apakah keduanya adalah hero Assasin
        if (fanny && lancelot) {
            System.out.println("Fanny dan Lancelot adalah hero Assasin");
        } else {
            System.out.println("Fanny dan Lancelot Adalah hero Mage");
        }

    }
}
