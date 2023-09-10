// Winanda Greace A. Sinaga
// 7038320 - Be A Top Search Quality Engineer - Alterra Academy Batch 5

import java.util.Scanner;

public class Kalkulator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan operasi (penjumlahan/pengurangan/perkalian/pembagian): ");
        String operasi = input.nextLine();

        System.out.print("Masukkan angka pertama: ");
        double angka1 = input.nextDouble();

        System.out.print("Masukkan angka kedua: ");
        double angka2 = input.nextDouble();

        double hasil = 0.0;

        if (operasi.equalsIgnoreCase("Penjumlahan")) {
            hasil = penjumlahan(angka1, angka2);
        } else if (operasi.equalsIgnoreCase("Pengurangan")) {
            hasil = pengurangan(angka1, angka2);
        } else if (operasi.equalsIgnoreCase("Perkalian")) {
            hasil = perkalian(angka1, angka2);
        } else if (operasi.equalsIgnoreCase("Pembagian")) {
            hasil = pembagian(angka1, angka2);
        } else {
            System.out.println("Operasi tidak valid.");
            System.exit(1);
        }

        System.out.println("Hasil perhitungan: " + hasil);
    }

    public static double penjumlahan(double angka1, double angka2) {
        return angka1 + angka2;
    }

    public static double pengurangan(double angka1, double angka2) {
        return angka1 - angka2;
    }

    public static double perkalian(double angka1, double angka2) {
        return angka1 * angka2;
    }

    public static double pembagian(double angka1, double angka2) {
        if (angka2 != 0) {
            return angka1 / angka2;
        } else {
            System.out.println("Pembagian oleh nol tidak diizinkan.");
            System.exit(1);
            return 0;
        }
    }
}
