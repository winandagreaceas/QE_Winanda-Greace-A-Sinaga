// Winanda Greace A. Sinaga
// 7038320 - Be A Top Search Quality Engineer - Alterra Academy Batch 5

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Soal1 {
    public static void main(String[] args) {
        Soal1 soal1 = new Soal1();
        soal1.run();
    }

    public void run() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Masukkan elemen array pertama: ");
        String input1 = scanner.nextLine();
        String[] array1 = input1.split(" ");

        System.out.println("Masukkan elemen array kedua: ");
        String input2 = scanner.nextLine();
        String[] array2 = input2.split(" ");

        String[] mergedArray = mergeArrays(array1, array2);

        System.out.println("Hasil: ");
        for (String element : mergedArray) {
            System.out.print(element + " ");
        }
    }

    public String[] mergeArrays(String[] array1, String[] array2) {
        // Menggabungkan kedua array ke dalam sebuah List
        List<String> mergedList = new ArrayList<>();
        for (String element : array1) {
            mergedList.add(element);
        }
        for (String element : array2) {
            mergedList.add(element);
        }

        // Menghapus duplikat
        Set<String> uniqueSet = new HashSet<>(mergedList);

        // Mengembalikan hasil dalam bentuk array
        return uniqueSet.toArray(new String[0]);
    }
}
