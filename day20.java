package pkg100h_ngoding;

public class day20 {

    public static void main(String[] args) {
        //Tipe data reference Byte
        
        Byte Ali = 20;
        Byte Budi = 15;
        Byte Cici = 18;
        Byte Dedi = 22;
        Byte Evi = 17;
       
        //Dicetak menggunakan printf
        System.out.printf("Ali memiliki %d kelereng\n", Ali);
        System.out.printf("Bidi memiliki %d kelereng\n", Budi);
        System.out.printf("Cici memiliki %d kelereng\n", Cici);
        System.out.printf("Dedi memiliki %d kelereng\n", Dedi);
        System.out.printf("Evi memiliki %d kelereng\n", Evi);

        System.out.println("---------------------------------------------------------");
        //Pertukarran Nilai
        Byte temp;
        temp = Ali;
        Ali = Budi;
        Budi = temp;

        temp = Cici;
        Cici = Dedi;
        Dedi = temp;
        //Melakukan penambahan nilai
        
        
        System.out.print("Kelereng Ali di tukar dengan punya budi dan + 5 : ");
        System.out.println(Ali+5);
        System.out.print("Kelereng Budi di tukar dengan punya Ali dan + 3 : ");
        System.out.println(Budi+3);
        System.out.println("Kelereng Cici di tukar dengan punya Dedi dan + 2 : ");
        System.out.println(Cici+2);
        System.out.println("Kelereng Dedi di tukar dengan punya Cici dan + 4 : ");
        System.out.println(Dedi+4);
    }
    

}
