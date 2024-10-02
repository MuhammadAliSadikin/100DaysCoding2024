package pkg100h_ngoding;
 
public class day31 {
    public static void main(String[] args) {
        //Konversi String ke data primitif
        String a ="123";
        System.out.printf("String : %s%n",a);
        //String to byte
        byte b = Byte.parseByte(a);
        System.out.printf("byte : %d%n",b);
        //String to short
        short c = Short.parseShort(a);
        System.out.printf("short : %d%n",c);
        //String to int
        int  d= Integer.parseInt(a);
        System.out.printf("int : %d%n",d);
        //String to long
        long e = Long.parseLong(a);
        System.out.println("long : "+e);
        //String to doubel
        double f = Double.parseDouble(a);
        System.out.println("double : "+f);
        //String to float
        float g = Float.parseFloat(a);
        System.out.println("Float : "+g);
        //String to char
        char h = a.charAt(0);
        System.out.print("Char : "+h+"\n");
        //String to boolean
        a ="true";
        boolean i = Boolean.parseBoolean(a);
        System.out.print("boolean : "+i+"\n");
         
    }
 
}
