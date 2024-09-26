package pkg100h_ngoding;

public class day25 {

    public static void main(String[] args) {
        //Tipe Data Reference Double
        System.out.println("------------------------");
        Double a = 15.5;
        Double b = 20.5;
        Double c = 30.5;
        Double d = 35.5;
        Double e = 40.5;
        //Dicetak Menggunkan printf
        System.out.printf("Nilai A : %.1f\n",a);
        System.out.printf("Nilai B : %.1f\n",b);
        System.out.printf("Nilai C : %.1f\n",c);
        System.out.printf("Nilai D : %.1f\n",d);
        System.out.printf("NIlai D : %.1f\n",e);
        System.out.println("-----------------------");
        //Jumlah Nilai
        Double jumlah = a+b+c+d+e;
        System.out.println("Jumlah : "+jumlah);
        //Perkalian Nilai A dan B,C dan E
        Double Hasil1 = a*b;
        Double Hasil2 = c*d;
        System.out.println("A x B : "+Hasil1);
        System.out.println("C x D : "+Hasil2);
        //Pengurangan B - A , E - C
        Double kurang1 = b - a;
        Double kurang2 = e - c;
        System.out.print("B - A : "+kurang1);
        System.out.print("\nE - C : "+kurang2);
        System.out.print("\n-----------------------\n");
        
    }

}
