package pkg100h_ngoding;

public class day19 {

    public static void main(String[] args) {
        //Tipe Data Reference String
        String a = "Hai";
        //'a'menyimpan referensi ke objek String "Hai"
        String b = a;
        //'b'menyimpan referensi yang sama ke objek String "Hai"
        System.out.println(b);
        b = "Teman";
        //membuat objek baru "Teman" dan mengubah referensi'a'
        System.out.printf("%s\n", a);//output : Hai (karena 'a' masih menyimpan referensi asli
        System.out.println(b);//output : Teman (karena 'b' sekarang menyimpan alamat baru)
        String a1 = "Ini";
        String a2 = "adalah";
        String a3 = "penjelasan";
        String a4 = "tentang";
        String a5 = "tipe data";
        String a6 = "reference";
        String a7 = "Strimg";
        System.out.println(a1 + " " + a2 + " " + a3 + " " + a4 + " " + a5 + " " + a6 + " " + a7);
        System.out.println("--------------------------------------------------------------");
        String[] d = {"Muhammad", "Ali", "Sadikin"};
        for (int i = 0; i < d.length; i++) {
            System.out.print(d[i] + " ");

        }
        System.out.println("");
    }

}
