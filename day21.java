public class day1 {
    public static void main(String[] args) {
        // Tipe data reference Short
        Short pemain1 = 12; 
        Short pemain2 = 18; 
        Short pemain3 = 25; 
        Short pemain4 = 10; 
        Short pemain5 = 15; 

        // Dicetak menggunakan printf
        System.out.printf("Pemain 1 memiliki %d kelereng\n", pemain1);
        System.out.printf("Pemain 2 memiliki %d kelereng\n", pemain2);
        System.out.printf("Pemain 3 memiliki %d kelereng\n", pemain3);
        System.out.printf("Pemain 4 memiliki %d kelereng\n", pemain4);
        System.out.printf("Pemain 5 memiliki %d kelereng\n", pemain5);
        System.out.println("---------------------------------------------------------");

        // Pertukaran Nilai
        Short temp;
        temp = pemain1;
        pemain1 = pemain2;
        pemain2 = temp;
        temp = pemain3;
        pemain3 = pemain4;
        pemain4 = temp;

        // Melakukan penambahan nilai
        System.out.print("Kelereng Pemain 1 di tukar dan + 5 : ");
        System.out.println(pemain1 + 5);
        System.out.print("Kelereng Pemain 2 di tukar dan + 3 : ");
        System.out.println(pemain2 + 3);
        System.out.print("Kelereng Pemain 3 di tukar dan + 2 : ");
        System.out.println(pemain3 + 2);
        System.out.print("Kelereng Pemain 4 di tukar dan + 4 : ");
        System.out.println(pemain4 + 4);
        
    }
}

