// 7038320 - Be A Top Search Quality Engineer - Alterra Academy Batch 5

import java.util.Scanner;
public class soalPrioritas1_2a {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Harga Beli: ");
        int hargaBeli = input.nextInt();

        System.out.print("Harga Jual: ");
        int hargaJual = input.nextInt();

        int untung = hargaJual - hargaBeli;

        if (untung > 0) {
            System.out.println("Untung sebesar: " + untung);
        } else if (untung < 0) {
            System.out.println("Rugi sebesar: " + Math.abs(untung));
        } else {
            System.out.println("Sama saja");
        }
        input.close();
    }
}
