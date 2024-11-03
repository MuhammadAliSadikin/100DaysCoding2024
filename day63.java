package pkg100h_ngoding;


public class day63 {

    public static void main(String[] args) {
        //Keyword continue
        System.out.println("Angka Genap Dilewati");
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {

                continue;
            }

            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("Angka Ganjil dilewati");
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 1) {
                continue;

            }

            System.out.print(i + " ");

        }System.out.println();
    }

}
