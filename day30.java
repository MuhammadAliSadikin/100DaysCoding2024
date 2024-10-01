package pkg100h_ngoding;

import java.math.BigDecimal;

public class day30 {
    public static void main(String[] args) {
        //Tipe data Refernce Big Decimal 
        BigDecimal a = new BigDecimal("90.50");
        BigDecimal b = new BigDecimal("85.70");
        BigDecimal c = new BigDecimal("65.50");
        BigDecimal d = new BigDecimal("70.50");
        BigDecimal e = new BigDecimal("55.50");
        System.out.println("-------------------------");
        //Dicetak Menggunakan printf
        System.out.printf("Nilai A : %.2f\n",a);
        System.out.printf("Nilai B : %.2f\n",b);
        System.out.printf("Nilai C : %.2f\n",c);
        System.out.printf("Nilai D : %.2f\n",d);
        System.out.printf("Nilai E : %.2f\n",e);
        System.out.println("-------------------------");
        //Penjumlahan Seluruh Nilai 
        BigDecimal Jumlah = a.add(b).add(c).add(d).add(e);
        System.out.print("Jumlah \t: "+Jumlah+"\n");
        //Perkalian Nilai A dengan B
        BigDecimal Perkalian = a.multiply(b);
        System.out.print("A X B \t: "+Perkalian+"\n");
        //Selisih Nilai Antar D dengan E
        BigDecimal Selisih = d.subtract(e);
        System.out.print("Selisih D dan E : "+Selisih+"\n");
        System.out.println("-------------------------");
    }
}
