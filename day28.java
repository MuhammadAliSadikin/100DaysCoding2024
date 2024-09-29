package pkg100h_ngoding;

public class day29 {

    public static void main(String[] args) {
        //Tipe data reference Boolean
        System.out.println("----------------------------");
        System.out.println("Tipe data Reference Boolean");
        System.out.println("----------------------------");
        Boolean True = true;
        Boolean False = false;
        //Dicetak menggunakan println
        System.out.println("Boolean : " + True);
        System.out.println("Boolean : " + False);
        Boolean a = 1 < 6;
        Boolean b = 10 == (5 + 5);
        Boolean c = 5 > 2;
        Boolean d = (5 * 5) == 25;
        //Dicetak menggunakan printf
        System.out.printf("1 < 6 :%b\n",a );
        System.out.printf("10 sama dengan 5 + 5 : %b\n",b);
        System.out.printf("5 >  2 : %b\n",c);
        System.out.printf("5 x 5 = 25 : %b\n",d);
        Boolean hujan = true;
        Boolean cerah = false;
        if (hujan && cerah) {
            System.out.print("Hari ini turun hujan\n"+hujan);
        }else{
            System.out.println("Hari ini cerah"+cerah);
        }
           System.out.println("");       
     
    }
}
