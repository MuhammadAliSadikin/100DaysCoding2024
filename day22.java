package pkg100h_ngoding;

public class day22 {

    public static void main(String[] args) {
        //Mendeklarasikan Variabel dengan Tipe data reference Integer
        Integer ikan, ayam, sapi, kerbau;
        ikan = 25;
        ayam = 15;
        sapi = 5;
        kerbau = 10;
        //Dicetak menggunkan printf
        System.out.println("+------------------------+");
        System.out.printf("|Ikan \t= %d  ekor\n|", ikan);
        System.out.printf("Ayam \t= %d  ekor\n", ayam);
        System.out.printf("Sapi \t= %d  ekor\n", sapi);
        System.out.printf("Kerbau \t= %d  ekor\n", kerbau);
        System.out.println("------------------------");
        //Inisialisasi Variabel baru
        Integer udang = 50;
        Integer kambing = 20;
        //Dicetak Menggunakan println
        System.out.println("Udang : "+udang+" ekor");
        System.out.println("Kambing : "+kambing+" ekor");
        //Penambahan
        ayam += 5;
        sapi += 3;
        //Dicetak menggunakan print
        System.out.println("------------------------");
        System.out.print("Total Ayam : "+ayam);
        System.out.print("Total Sapi : "+sapi);
        
        
        

    }

}
