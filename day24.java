package pkg100h_ngoding;

public class day24 {

    public static void main(String[] args) {
        //Tipe Data Reference Float
        System.out.println("------------------------------");
        System.out.println("Jumlah Anggaran Setiap Kota");
        System.out.println("------------------------------");
        Float kota_a = 80.2f;
        Float kota_b = 70.3f;
        Float kota_c = 20.1f;
        Float kota_d = 50.8f;
        Float kota_e = 40.5f;
        //Dicetak Menggunakan Printf dengan format %f
        System.out.println("Kota A : " + kota_a+"M");
        System.out.println("Kota B : " + kota_b+"M");
        System.out.println("Kota c : " + kota_c+"M");
        System.out.println("Kota D : " + kota_d+"M");
        System.out.println("Kota E : " + kota_e+"M");
        System.out.println("------------------------------");
        //Jumlah Data
        Float JumlahData = 5f;
        System.out.printf("Jumlah Kota \t: %.0f Kota\n",JumlahData);
        //Total Anggaran dan Rata-Rata Anggaran
        Float total = kota_a+ kota_b + kota_c + kota_d + kota_e;
        System.out.printf("Total \t\t: %.1f M\n", total);
        Float RataRata = total / JumlahData;
        System.out.printf("Rata-Rata \t: %.1f M\n", RataRata);
        System.out.println("------------------------------");

    }
}
