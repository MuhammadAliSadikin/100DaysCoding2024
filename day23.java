package pkg100h_ngoding;

public class day23 {

    public static void main(String[] args) {
        Long kota_a = 1500L;
        Long kota_b = 2200L;
        Long kota_c = 3000L;
        Long kota_d = 4700L;
        Long kota_e = 1800L;
        //Dicetak Menggunakan printf
        System.out.println("Menampilkan Jumllah Penduduk Di Setiap Wilayah");
        System.out.printf("Kota A : %d penduduk\n", kota_a);
        System.out.printf("Kota B : %d penduduk\n", kota_b);
        System.out.printf("Kota C : %d penduduk\n", kota_c);
        System.out.printf("Kota D : %d penduduk\n", kota_d);
        System.out.printf("Kota E : %d penduduk\n", kota_e);
        //Jumalah seluruh penduduk
        Long total_penduduk = kota_a + kota_b + kota_c + kota_d + kota_e;
        System.out.println("Jumalah Seluruh Penduduk : " + total_penduduk + " penduduk");
        //Kota Dengan Penduduk  Jumalah Terbanyak
        String kota_terbanyak = (kota_a > kota_e) ? "Kota A" : "Kota E";
        System.out.println("Kota dengan penduduk terbanyak : " + kota_terbanyak);
        //Kota Dengan Penduduk Jumalah Paling Sedikit
        String kota_palingsedikit = (kota_a < kota_e) ? "Kota A" : "Kota E";
        System.out.println("Kota dengan penduduk paling sedikit : " + kota_palingsedikit);
        //selisih
        Long selisih = Math.abs(kota_a - kota_d);
        System.out.println("Selish Kota A Dengan Kota D: " + selisih);
        Long rata_rata = total_penduduk / 2;
        System.out.print("Rata - Rata Penduduk : " + rata_rata + "\n");

    }
}
