package pkg100h_ngoding;

import java.math.BigInteger;

public class day29 {

    public static void main(String[] args) {
        //Tipe data Reference Biginteger
        System.out.println("-----------------------------------------");
        BigInteger a = new BigInteger("123456789");
        BigInteger b = new BigInteger("987654321");
        BigInteger c = new BigInteger("555555555");
        BigInteger d = new BigInteger("999999999");
        BigInteger e = new BigInteger("111111111");
        //Dicetak Menggunakan printf
        System.out.printf("BigInteger A : %d\n",a);
        System.out.printf("BigInteger B : %d\n",b);
        System.out.printf("BigInteger C : %d\n",c);
        System.out.printf("BigInteger D : %d\n",d);
        System.out.printf("BigInteger E : %d\n",e);
        //Pertukaran nilai
        BigInteger temp;
        temp = a;
        a = b;
        b = temp;
        temp = c;
        c = d;
        d = temp;
        System.out.print("-----------------------------------------\n");
        System.out.print("Pertukaran Nilai antara A dan B, C dan D\n");
        System.out.println("A : "+a);
        System.out.println("B : "+b);
        System.out.println("C : "+c);
        System.out.println("D : "+d);
      
        
    }
}
