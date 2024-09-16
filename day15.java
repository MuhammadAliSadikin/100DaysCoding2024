package pkg100h_ngoding;

public class day15 {
    public static void main(String[] args) {
        //Deklarasi Variabel dengan tipe data:Double
        double a ,b,c,d,e;
        a = 2.1234567;
        b = 5.1234567;
        c = 7.1234567;
        d = 9.1234567;
        e = 8.1234567;
        //Di cetak menggunakan printf
        System.out.printf("Nilai 1 = %.1f\n",a);
        System.out.printf("Nilai 2 = %.2f\n",b);
        System.out.printf("Nilai 3 = %.3f\n",c);
        System.out.printf("Nilai 4 = %.4f\n",d);
        System.out.printf("Nilai 5 = %.5f\n",e);
        // Inisialisasi Variabel 
        double f = 9.12345678912;
        double g = 10.12345678912;
        double h = 11.12345678912;
        double i = 12.12345678912;
        double j = 13.12345678912;
        double k = 14.12345678912;
        double l = 15.12345678912;
        double m = 16.12345678912;
        double n = 17.12345678912;
        System.out.println("------------------------------");
        // Di cetak menggunakan println
        System.out.println(String.format("Nilai 6 = %.7f",f));
        System.out.println(String.format("Nilai 7 = %.7f",g));
        System.out.println(String.format("Nilai 8 = %.7f",h));
        System.out.println(String.format("Nilai 9 = %.7f",i));
        System.out.println(String.format("Nilai 10 = %.7f",j));
        System.out.println(String.format("Nilai 11 = %.7f",k));
        System.out.println(String.format("Nilai 12 = %.7f",l));
        System.out.println(String.format("Nilai 13 = %.7f",m));
        System.out.println(String.format("Nilai 14 = %.7f",n));
        System.out.println("------------------------------");
        //Phi
        double phi = 22.0 / 7.0;
        //Di cetak menggunakan Println
        System.out.println(String.format("Nilai = %.2f",phi));
        System.out.println(String.format("Nilai = %.3f",phi));
        System.out.println(String.format("Nilai = %.4f",phi));
        System.out.println(String.format("Nilai = %.5f",phi));
        System.out.println(String.format("Nilai = %.6f",phi));
        System.out.println(String.format("Nilai = %.7f",phi));
        System.out.println(String.format("Nilai = %.8f",phi));
        System.out.println(String.format("Nilai = %.9f",phi));
        System.out.println(String.format("Nilai = %.10f",phi));
        System.out.println(String.format("Nilai = %.11f",phi));
    }
 
}
