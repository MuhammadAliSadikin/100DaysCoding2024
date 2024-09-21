package pkg100h_ngoding;

public class day20 {

    public static void main(String[] args) {
        //Tipe data reference Byte
        byte Ali, Budi, Cici, Dedi, Evi;
        Ali = 20;
        Budi = 15;
        Cici = 18;
        Dedi = 22;
        Evi = 27;
        //Dicetak menggunakan printf
        System.out.printf("Ali memiliki %d kelereng\n", Ali);
        System.out.printf("Bidi memiliki %d kelereng\n", Budi);
        System.out.printf("Cici memiliki %d kelereng\n", Cici);
        System.out.printf("Dedi memiliki %d kelereng\n", Dedi);
        System.out.printf("Evi memiliki %d kelereng\n", Evi);

        System.out.println("---------------------------------------------------------");
        //Pertukarran Nilai
        byte temp;
        temp = Ali;
        Ali = Budi;
        Budi = temp;

        temp = Cici;
        Cici = Dedi;
        Dedi = temp;
        //Melakukan penambahan nilai
        Ali += 5;
        Budi += 3;
        Cici += 2;
        Dedi += 4;
        System.out.println("Kelereng Ali di tukar dengan punya budi dan + 5 : " + Ali);
        System.out.println("Kelereng Budi di tukar dengan punya Ali dan + 3 : " + Budi);
        System.out.println("Kelereng Cici di tukar dengan punya Dedi dan + 2 : " + Cici);
        System.out.println("Kelereng Dedi di tukar dengan punya Cici dan + 4 : " + Dedi);

    }

}
