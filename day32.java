package pkg100h_ngoding;

public class day32 {
    public static void main(String[] args) {
        //Konversi tipe data primitif ke String
        System.out.println("Konversi tipe data primitif ke String");
        System.out.println("---------------------------------------");
        String s;
        byte a = 24;
        s = String.valueOf(a);
        System.out.printf("byte to String : %d%n",a);
        short b = 50;
        s = String.valueOf(b);
        System.out.printf("short to String : %d%n",b);
        int c = 80;
        s = String.valueOf(c);
        System.out.printf("int to String : %d%n",c);
        long d = 120;
        s = String.valueOf(d);
        System.out.print("long to String : "+d+"\n");
        double e = 50.5;
        s = String.valueOf(e);
        System.out.print("double to String : "+e+"\n");
        float f = 70.0f;
        s = String.valueOf(f);
        System.out.print("float to String : "+f+"\n");
        char g = 'A';
        s = String.valueOf(g);
        System.out.print("char to String : "+g+"\n");
        boolean h = true;
        s = String.valueOf(h);
        System.out.print("boolean to String : "+h+"\n");
        
    }
 
}
